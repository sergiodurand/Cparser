/* Generated By:JJTree: Do not edit this line. ASTAND.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package lcr.c2bsv.parser;

public
class ASTAND extends SimpleNode {
  public ASTAND(int id) {
    super(id);
  }

  public ASTAND(C2BSVParser p, int id) {
    super(p, id);
  }

  public StringBuilder toBSV() {
	  SimpleNode n0 = (SimpleNode)jjtGetChild(0);
	  SimpleNode n1 = (SimpleNode)jjtGetChild(1);
	  return new StringBuilder("(" + n0.toBSV() + " && " + n1.toBSV() + ")");
  }

}
/* JavaCC - OriginalChecksum=072d883b5b2770a111dd908e93dcd49c (do not edit this line) */