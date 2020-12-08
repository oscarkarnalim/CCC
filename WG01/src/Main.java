
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import cppantlr.CppLexer;
import csharpantlr.CSharpLexer;
import haskellantlr.HaskellLexer;
import javaantlr.Java8Lexer;
import pythonantlr.Python3Lexer;
import rantlr.RLexer;
import sqlantlr.CaseChangingCharStream;
import sqlantlr.MySqlLexer;

public class Main{
	public static void main(String[] args) {

		String commonCodePath = args[0];
		String assessmentPath = args[1];
		String programmingLanguage = args[2];
		
		boolean isIdentGeneralised = false;
		if (args.length == 4 && args[3].equalsIgnoreCase("generalised"))
			isIdentGeneralised = true;

		// set the file extensions
		String[] extensions = null;
		if (programmingLanguage.equalsIgnoreCase("java")) {
			extensions = new String[] { ".java" };
		} else if (programmingLanguage.equalsIgnoreCase("python")) {
			extensions = new String[] { ".py" };
		} else if (programmingLanguage.equalsIgnoreCase("csharp")) {
			extensions = new String[] { ".cs" };
		} else if (programmingLanguage.equalsIgnoreCase("cpp")) {
			extensions = new String[] { ".cpp", ".c", ".h" };
		} else if (programmingLanguage.equalsIgnoreCase("sql")) {
			extensions = new String[] { ".sql" };
		}else if(programmingLanguage.equalsIgnoreCase("haskell")) {
			extensions = new String[] {".hs"};
		}else if(programmingLanguage.equalsIgnoreCase("r")) {
			extensions = new String[] {".r"};
		}

		// get the token string of common code
		ArrayList<TokenTuple> commonCodeTokenString = getTokenString(commonCodePath, isIdentGeneralised, true);
		
		// for statistics
		ArrayList<String> containingFilePaths = new ArrayList<String>();
		int totalSubmission = 0;

		try {
			File assessmentDir = new File(assessmentPath);

			// get the submissions
			File[] submissionDirs = assessmentDir.listFiles();
			// iterate the submissions
			for (File submissionDir : submissionDirs) {
				// if it is not a directory, skip
				if (submissionDir.isDirectory() == false)
					continue;
				// otherwise, add the total submission
				else
					totalSubmission++;

				boolean isFoundForGeneralised = false;

				// search all files with the given extension
				// use stack instead of recursive for scalability
				Stack<File> submissionFiles = new Stack<>();
				submissionFiles.push(submissionDir);

				// for each unvisited file in the submission
				while (submissionFiles.size() > 0) {
					File curFile = submissionFiles.pop();
					// if the current file is a directory,
					// add all the children to the stack
					if (curFile.isDirectory()) {
						File[] curFileChildren = curFile.listFiles();
						for (File child : curFileChildren) {
							submissionFiles.push(child);
						}
					} else {
						// if the file extension matches
						boolean isMatch = false;
						for (String ext : extensions) {
							if (curFile.getName().toLowerCase().endsWith(ext)) {
								isMatch = true;
								break;
							}
						}

						// process
						if (isMatch) {
							// generate the token string
							ArrayList<TokenTuple> targetCodeTokenString = getTokenString(curFile.getAbsolutePath(),
									isIdentGeneralised, true);

							// search whether common code is in the target code.
							for (int i = 0; i < targetCodeTokenString.size() - commonCodeTokenString.size() + 1; i++) {
								boolean isFound = true;
								// iterate the elements
								for (int j = 0; j < commonCodeTokenString.size(); j++) {
									// if not match, mark as not found
									if (targetCodeTokenString.get(i + j).getContent()
											.equals(commonCodeTokenString.get(j).getContent()) == false) {
										isFound = false;
										break;
									}
								}

								if (isFound) {
									// if found, mark the related boolean
									isFoundForGeneralised = true;
									break;
								}
							}

							if (isFoundForGeneralised) {
								// if all matches have been found, break the loop
								break;
							}

						}
					}
				}

				// add to the corresponding list
				if (isFoundForGeneralised)
					containingFilePaths.add(submissionDir.getAbsolutePath());
			}

			System.out.println("\n==========================================================================");
			System.out.println("Submissions containing the common code:");
			for (String s : containingFilePaths)
				System.out.println(s);

			DecimalFormat df = new DecimalFormat("##.##%");

			System.out.println("\n==========================================================================");
			System.out.println("Submissions\t\t\t:" + totalSubmission);
			System.out.println("Submissions containing the code\t:" + containingFilePaths.size());
			System.out.println(
					"Occurrence proportion\t\t:" + df.format(containingFilePaths.size() * 1.0 / totalSubmission));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean isStartLineExclusive(ArrayList<TokenTuple> targetCodeTokenString, int i) {
		// check whether the first token is at the beginning of a
		// line
		boolean isStartLineExclusive = false;
		if (i == 0)
			isStartLineExclusive = true;
		else if (targetCodeTokenString.get(i).getLine() != targetCodeTokenString.get(i - 1).getLine())
			isStartLineExclusive = true;

		return isStartLineExclusive;
	}

	public static boolean isFinishLineExclusive(ArrayList<TokenTuple> targetCodeTokenString, int j) {
		// check whether the last token is at the end of
		// the line
		boolean isFinishLineExclusive = false;
		if (j == targetCodeTokenString.size() - 1)
			isFinishLineExclusive = true;
		else if (j + 1 < targetCodeTokenString.size()
				&& targetCodeTokenString.get(j).getLine() != targetCodeTokenString.get(j + 1).getLine())
			isFinishLineExclusive = true;
		return isFinishLineExclusive;
	}

	public static boolean isStartWithIdentifierOrKeyword(String firstTokenText) {
		// check whether it starts with identifier or keyword
		boolean isFirstTokenIdentifier = false;
		if (Character.isJavaIdentifierStart(firstTokenText.charAt(0))) {
			// mark as a possible identifier
			isFirstTokenIdentifier = true;
			// check whether the remaining chars are
			// identifier-permissible
			for (int j = 1; j < firstTokenText.length(); j++) {
				char c = firstTokenText.charAt(j);
				if (Character.isJavaIdentifierPart(c) == false)
					isFirstTokenIdentifier = false;
			}
		}

		return isFirstTokenIdentifier;
	}

	public static ArrayList<TokenTuple> getTokenString(String filePath, boolean isIdentifiersGeneralised,
			boolean isStringLiteralGeneralised) {
		try {
			ArrayList<TokenTuple> result = new ArrayList<>();
			List<Token> tokens = null;
			// ANTLR code to read tokens
			if (filePath.toLowerCase().endsWith(".java")) {
				Lexer lexer = new Java8Lexer(new ANTLRFileStream(filePath));
				tokens = (List<Token>) lexer.getAllTokens();
				if (tokens != null) {
					// copy each token to result
					for (int i = 0; i < tokens.size(); i++) {
						if (tokens.get(i).getChannel() == 0) {
							String txt = tokens.get(i).getText();
							String type = Java8Lexer.VOCABULARY.getDisplayName(tokens.get(i).getType()).toLowerCase();
							int line = tokens.get(i).getLine();
							int column = tokens.get(i).getCharPositionInLine();

							// if identifier, generalise
							if (type.equalsIgnoreCase("identifier") && isIdentifiersGeneralised)
								result.add(new TokenTuple("ident", txt, line, column));
							// if string literal, generalise
							else if (txt.startsWith("\"") && isStringLiteralGeneralised)
								result.add(new TokenTuple("string_literal", txt, line, column));
							// otherwise, add as long as it is not a whitespace
							else if (txt.trim().length() > 0)
								result.add(new TokenTuple(txt, txt, line, column));
						}
					}
					return result;
				}
			} else if (filePath.toLowerCase().endsWith(".py")) {
				Lexer lexer = new Python3Lexer(new ANTLRFileStream(filePath));
				tokens = (List<Token>) lexer.getAllTokens();
				if (tokens != null) {
					// copy each token to result
					for (int i = 0; i < tokens.size(); i++) {
						if (tokens.get(i).getChannel() == 0) {
							String txt = tokens.get(i).getText();
							String type = Python3Lexer.VOCABULARY.getDisplayName(tokens.get(i).getType()).toLowerCase();
							int line = tokens.get(i).getLine();
							int column = tokens.get(i).getCharPositionInLine();

							// do nothing for newline
							if(type.equals("94")||  type.equals("93")|| type.equals("newline"));
							// if identifier, generalise
							else if (type.equalsIgnoreCase("name") && isIdentifiersGeneralised)
								result.add(new TokenTuple("ident", txt, line, column));
							// if string literal, generalise
							else if ((txt.startsWith("\"") || txt.startsWith("'")) && isStringLiteralGeneralised)
								result.add(new TokenTuple("string_literal", txt, line, column));
							// otherwise, add as long as it is not a whitespace
							else if (txt.trim().length() > 0){
								result.add(new TokenTuple(txt, txt, line, column));
							}
						}
					}
					
					return result;
				}
			} else if (filePath.toLowerCase().endsWith(".cpp") || filePath.toLowerCase().endsWith(".c")
					|| filePath.toLowerCase().endsWith(".h")) {
				Lexer lexer = new CppLexer(new ANTLRFileStream(filePath));
				tokens = (List<Token>) lexer.getAllTokens();
				if (tokens != null) {
					// copy each token to result
					for (int i = 0; i < tokens.size(); i++) {
						String txt = tokens.get(i).getText();
						String type = CppLexer.VOCABULARY.getDisplayName(tokens.get(i).getType()).toLowerCase();
						int line = tokens.get(i).getLine();
						int column = tokens.get(i).getCharPositionInLine();

						// if identifier, generalise
						if (type.equalsIgnoreCase("identifier") && isIdentifiersGeneralised)
							result.add(new TokenTuple("ident", txt, line, column));
						// if starts with #, it is macro that is insensitive to spaces. Remove all the
						// spaces
						else if (txt.startsWith("#"))
							result.add(new TokenTuple(txt.replaceAll("\\s+", ""), txt, line, column));
						// if string literal, generalise
						else if (txt.startsWith("\"") && isStringLiteralGeneralised)
							result.add(new TokenTuple("string_literal", txt, line, column));
						// otherwise, add as long as it is not a whitespace
						else if (txt.trim().length() > 0)
							result.add(new TokenTuple(txt, txt, line, column));
					}
					return result;
				}
			} else if (filePath.toLowerCase().endsWith(".cs")) {
				Lexer lexer = new CSharpLexer(new ANTLRFileStream(filePath));
				tokens = (List<Token>) lexer.getAllTokens();
				if (tokens != null) {
					// copy each token to result
					for (int i = 0; i < tokens.size(); i++) {
						if (tokens.get(i).getChannel() == 0) {
							String txt = tokens.get(i).getText();
							String type = CSharpLexer.VOCABULARY.getDisplayName(tokens.get(i).getType()).toLowerCase();
							int line = tokens.get(i).getLine();
							int column = tokens.get(i).getCharPositionInLine();

							// if identifier, generalise
							if (type.equalsIgnoreCase("identifier") && isIdentifiersGeneralised)
								result.add(new TokenTuple("ident", txt, line, column));
							// if string literal, generalise
							else if (txt.startsWith("\"") && isStringLiteralGeneralised)
								result.add(new TokenTuple("string_literal", txt, line, column));
							// otherwise, add as long as it is not a whitespace
							else if (txt.trim().length() > 0)
								result.add(new TokenTuple(txt, txt, line, column));
						}
					}
					return result;
				}
			} else if (filePath.toLowerCase().endsWith(".sql")) {
				// exclusive for sql grammar
				CaseChangingCharStream upper = new CaseChangingCharStream(new ANTLRFileStream(filePath), true);
				Lexer lexer = new MySqlLexer(upper);
				tokens = (List<Token>) lexer.getAllTokens();
				if (tokens != null) {
					// copy each token to result
					for (int i = 0; i < tokens.size(); i++) {
						// if (tokens.get(i).getChannel() == 0) {
						String txt = tokens.get(i).getText();
						String type = MySqlLexer.VOCABULARY.getDisplayName(tokens.get(i).getType()).toLowerCase();
						int line = tokens.get(i).getLine();
						int column = tokens.get(i).getCharPositionInLine();

						// if identifier, generalise
						if (type.equalsIgnoreCase("id") && isIdentifiersGeneralised)
							result.add(new TokenTuple("ident", txt, line, column));
						// if string literal, generalise
						else if ((txt.startsWith("\"") || txt.startsWith("'") || type.equalsIgnoreCase("string_literal")) && isStringLiteralGeneralised)
							result.add(new TokenTuple("string_literal", txt, line, column));
						// otherwise, add as long as it is not a whitespace
						else if (txt.trim().length() > 0)
							result.add(new TokenTuple(txt, txt, line, column));
						// }
					}
					return result;
				}
			}else if (filePath.toLowerCase().endsWith(".hs")) {
				Lexer lexer = new HaskellLexer(new ANTLRFileStream(filePath));
				tokens = (List<Token>) lexer.getAllTokens();
				if (tokens != null) {
					// copy each token to result except the last one as it stands for end of file
					for (int i = 0; i < tokens.size()-1; i++) {
						if (tokens.get(i).getChannel() == 0) {
							String txt = tokens.get(i).getText();
							String type = HaskellLexer.VOCABULARY.getDisplayName(tokens.get(i).getType()).toLowerCase();
							int line = tokens.get(i).getLine();
							int column = tokens.get(i).getCharPositionInLine();

							// if identifier, generalise
							if (type.equalsIgnoreCase("varid") && isIdentifiersGeneralised)
								result.add(new TokenTuple("ident", txt, line, column));
							// if string literal, generalise
							else if (txt.startsWith("\"") && isStringLiteralGeneralised)
								result.add(new TokenTuple("string_literal", txt, line, column));
							// otherwise, add as long as it is not a whitespace
							else if (txt.trim().length() > 0)
								result.add(new TokenTuple(txt, txt, line, column));
						}
					}
					return result;
				}
			} else if (filePath.toLowerCase().endsWith(".r")) {
				Lexer lexer = new RLexer(new ANTLRFileStream(filePath));
				tokens = (List<Token>) lexer.getAllTokens();
				if (tokens != null) {
					// copy each token to result
					for (int i = 0; i < tokens.size(); i++) {
						if (tokens.get(i).getChannel() == 0) {
							String txt = tokens.get(i).getText();
							String type = RLexer.VOCABULARY.getDisplayName(tokens.get(i).getType()).toLowerCase();
							int line = tokens.get(i).getLine();
							int column = tokens.get(i).getCharPositionInLine();

							// if identifier, generalise
							if (type.equalsIgnoreCase("id") && isIdentifiersGeneralised)
								result.add(new TokenTuple("ident", txt, line, column));
							// if string literal, generalise
							else if ((txt.startsWith("\"") || txt.startsWith("'")) && isStringLiteralGeneralised)
								result.add(new TokenTuple("string_literal", txt, line, column));
							// otherwise, add as long as it is not a whitespace
							else if (txt.trim().length() > 0)
								result.add(new TokenTuple(txt, txt, line, column));
						}
					}
					return result;
				}
			}

		} catch (Exception e) {
			// System.out.println(filePath);
			e.printStackTrace();
		}

		return null;
	}

}

/*
 * [NOT USED as it will generate too many false positives] search whether common
 * code is in the target code. The algorithm is still able to find the common
 * code even though the code is embedded with many irrelevant tokens.
 */
//for (int i = 0; i < targetCodeTokenString.size() - commonCodeTokenString.size()+1; i++) {
//	// the counter counts how many tokens from common code that have been matched
//	// from i to the end
//	int matchedTokenCounter = 0;
//	// iterate the elements
//	for (int j = i; j < targetCodeTokenString.size(); j++) {
//		// if match, increase the counter by one
//		if (targetCodeTokenString.get(j)
//				.equals(commonCodeTokenString.get(matchedTokenCounter))) {
//			
//			matchedTokenCounter++;
//			// if match, break the loop
//			if (matchedTokenCounter == commonCodeTokenString.size())
//				break;
//		}
//	}
//	
//	if (matchedTokenCounter == commonCodeTokenString.size()) {
//		// if found, add to the path and clear the submission files (making the loop
//		// breaks and go to the next submission)
//		containingFilePaths.add(submissionDir.getAbsolutePath());
//		submissionFiles.clear();
//		break;
//	}
//}
//