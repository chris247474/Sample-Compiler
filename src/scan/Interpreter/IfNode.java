package scan.Interpreter;
import scan.TLValue;
import java.util.ArrayList;
import java.util.List;
import scanneralt.InputPane;
import scanneralt.Main;

public class IfNode implements TLNode {

    private List<Choice> choices;
    private int line;

    public IfNode() {
        choices = new ArrayList<Choice>();
    }

    public void addChoice(TLNode e, TLNode b) {
        choices.add(new Choice(e, b));
    }
    
    public void addChoice(TLNode e, TLNode b, int line) {
        choices.add(new Choice(e, b, line));
    }

    @Override
    public TLValue evaluate() {
            
        for(Choice ch : choices) {
            
            TLValue value = ch.expression.evaluate();

            if(!value.isBoolean()) {
                throw new RuntimeException("illegal boolean expression " +
                        "inside if-statement: " + ch.expression);
            }

            if(value.asBoolean()) {
             
                return ch.block.evaluate();
            }
        }

        return TLValue.VOID;
    }

    public void setCaret(){
        InputPane p = Main.getSelTab();
        p.getTextArea().setCaretPosition(p.getPos(line));
    }
    
    private class Choice {

        TLNode expression;
        TLNode block;
        private int line;

        Choice(TLNode e, TLNode b) {
            expression = e;
            block = b;
        }
        
        Choice(TLNode e, TLNode b,int line) {
            expression = e;
            block = b;
            this.line = line;
        }
        
        public void setCaret(){
            InputPane p = Main.getSelTab();
            p.getTextArea().setCaretPosition(p.getPos(line));
        }
        
        public void setLine(int a){
            line = a;
        }
    }
    
    public void setLine(int a){
        line = a;
    }
}
