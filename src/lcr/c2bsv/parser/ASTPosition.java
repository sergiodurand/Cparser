/* Generated By:JJTree: Do not edit this line. ASTPosition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package lcr.c2bsv.parser;

public
class ASTPosition extends SimpleNode {
  public ASTPosition(int id) {
    super(id);
  }

  public ASTPosition(C2BSVParser p, int id) {
    super(p, id);
  }
  
  public StringBuilder toBSV() {
	  SimpleNode n0 = (SimpleNode)jjtGetChild(0);
	  return new StringBuilder(n0.toBSV());
  }

}
/* JavaCC - OriginalChecksum=e2850869acc571f1f50f8921a8cb8d2a (do not edit this line) */