package lcr.c2bsv.parser;

public class Symbol {
	
	public enum Type {
		PRIMITIVE, VECTOR, BRAM
	}
	
	private String name;
	private Type type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
}
