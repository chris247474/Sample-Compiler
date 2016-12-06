package scan.Interpreter;

import scan.TLValue;
import scanneralt.InputPane;
import scanneralt.Main;

public class DoWhileStatementNode implements TLNode {

    private TLNode expression;
    private TLNode block;
    private int line;

    public DoWhileStatementNode(TLNode exp, TLNode bl) {
        expression = exp;
        block = bl;
    }

    @Override
    public TLValue evaluate() {

        setCaret();
        do {

            TLValue returnValue = block.evaluate();

            if(returnValue != TLValue.VOID) {
                return returnValue;
            }
            
        }while(expression.evaluate().asBoolean());

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
