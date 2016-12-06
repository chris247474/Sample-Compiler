package scan.Interpreter;

import scan.TLValue;
import scanneralt.InputPane;
import scanneralt.Main;

public class WhileStatementNode implements TLNode {

    private TLNode expression;
    private TLNode block;
    private int line;

    public WhileStatementNode(TLNode exp, TLNode bl) {
        expression = exp;
        block = bl;
    }

    @Override
    public TLValue evaluate() {
        setCaret();
        while(expression.evaluate().asBoolean()) {

            TLValue returnValue = block.evaluate();

            if(returnValue != TLValue.VOID) {
                return returnValue;
            }
        }

        return TLValue.VOID;
    }
    public void setCaret(){
        InputPane p = Main.getSelTab();
        p.getTextArea().setCaretPosition(p.getPos(line));
    }
    public void setLine(int a){
        line = a;
    }
}
