/* Generated By:JJTree: Do not edit this line. ASTEqual.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package lcr.c2bsv.parser;

public
class ASTEqual extends SimpleNode {
  public ASTEqual(int id) {
    super(id);
  }

  public ASTEqual(C2BSVParser p, int id) {
    super(p, id);
  }

  public StringBuilder toBSV() {
	  SimpleNode n0 = (SimpleNode)jjtGetChild(0);
	  SimpleNode n1 = (SimpleNode)jjtGetChild(1);
	  return new StringBuilder("(" + n0.toBSV() + " == " + n1.toBSV() + ")");
  }

}
/* JavaCC - OriginalChecksum=e48ad55f92ddb529fe85dfde6a1b809d (do not edit this line) */
