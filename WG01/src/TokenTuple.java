
public class TokenTuple {
	private String content, rawContent;
	private int line, column;
	public TokenTuple(String content, String rawContent, int line, int column) {
		super();
		this.content = content;
		this.rawContent = rawContent;
		this.line = line;
		this.column = column;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRawContent() {
		return rawContent;
	}
	public void setRawContent(String rawContent) {
		this.rawContent = rawContent;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	public String toString(){
		return rawContent;
	}
}
