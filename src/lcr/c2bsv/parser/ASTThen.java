/* Generated By:JJTree: Do not edit this line. ASTThen.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package lcr.c2bsv.parser;

public
class ASTThen extends SimpleNode {
  public ASTThen(int id) {
    super(id);
  }

  public ASTThen(C2BSVParser p, int id) {
    super(p, id);
  }
  
  public StringBuilder toBSV() {
	  SimpleNode statement = (SimpleNode)jjtGetChild(0);
	  return new StringBuilder(statement.toBSV());
  }

}
/* JavaCC - OriginalChecksum=3a8ed1a9a95f58e5702b54f3294af2fc (do not edit this line) */