/* Generated By:JJTree: Do not edit this line. ASTIf.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package lcr.c2bsv.parser;

public
class ASTIf extends SimpleNode {
  public ASTIf(int id) {
    super(id);
  }

  public ASTIf(C2BSVParser p, int id) {
    super(p, id);
  }
  
  public StringBuilder toBSV() {
	  SimpleNode ifcond = (SimpleNode)jjtGetChild(0);
	  SimpleNode ifthen = (SimpleNode)jjtGetChild(1);
	  SimpleNode ifelse = jjtGetNumChildren() == 3 ? (SimpleNode)jjtGetChild(2): null;
	  StringBuilder s = new StringBuilder();
	  s.append("if " + ifcond.toBSV() + NEW_LINE);
	  s.append("begin" + NEW_LINE);
	  s.append(ifthen.toBSV() + NEW_LINE);
	  s.append("end");
	  if (ifelse != null) {
		  s.append("else" + NEW_LINE);
		  s.append("begin" + NEW_LINE);
		  s.append(ifelse.toBSV() + NEW_LINE);
		  s.append("end");
	  }
	  return s;
  }

}
/* JavaCC - OriginalChecksum=92eb48b4fcf3c101753ec646f1980e5c (do not edit this line) */