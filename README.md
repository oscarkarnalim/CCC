# Common Code Counter

**Common** **code** **counter** \(CCC\) is a Java program to count how many programs contain a code segment via a simple substring matching algorithm. Currently, it covers seven languages: Java, Python, C#, C++, SQL, Haskell, and R. The program needs further development and this is part of a working group report. A work based on this code should acknowledge the working report.

*Command*: 
```
<code_segment_filepath> <program_root_directory> <programming_language> <is_generalised>
```  

## Parameters description \(sorted alphabetically\):  
### <code_segment_filepath>
A string representing file path of the code segment which occurrence will be counted. The file should have the same extension as the targeted code programs (e.g., '.java' for Java program). Please use quotes if the path contains spaces.  
### <is_generalised>
This parameter can be either not used or assigned with a string 'generalised'. If assigned, all identifiers and string constants will be generalised to their token types prior comparison. This can nullify variation on both aspects.
### <program_root_directory>
A string representing a directory containing programs in which the targeted code segment will be searched. Each program should be stored under a directory. Please use quotes if the path contains spaces.  
### <programming_language>
A constant depicting the programming language.  
values: 'java' for Java, 'python' for Python, 'csharp' for C#, 'cpp' for C++, 'sql' for SQL, 'haskell' for Haskell, or 'r' for R.  

## Acknowledgment
This tool uses [ANTLR](https://www.antlr.org/) to tokenise given program,
