/* Generated By:JJTree: Do not edit this line. ASTIfStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.miguel.sxl;

public
class ASTIfStatement extends SXLNode {
  public ASTIfStatement(int id) {
    super(id);
  }

  public ASTIfStatement(SXLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SXLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f71e6ca034e5451a3c70e11f5860af60 (do not edit this line) */
