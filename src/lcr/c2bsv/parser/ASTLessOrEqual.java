/* Generated By:JJTree: Do not edit this line. ASTLessOrEqual.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package lcr.c2bsv.parser;

public
class ASTLessOrEqual extends SimpleNode {
  public ASTLessOrEqual(int id) {
    super(id);
  }

  public ASTLessOrEqual(C2BSVParser p, int id) {
    super(p, id);
  }

  public StringBuilder toBSV() {
	  SimpleNode n0 = (SimpleNode)jjtGetChild(0);
	  SimpleNode n1 = (SimpleNode)jjtGetChild(1);
	  return new StringBuilder("(" + n0.toBSV() + " >= " + n1.toBSV() + ")");
  }
}
/* JavaCC - OriginalChecksum=3eb728214e08977301cad42e7afd9b73 (do not edit this line) */
