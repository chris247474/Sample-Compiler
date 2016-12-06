package scan.Interpreter;

import scan.Scope;
import scan.TLValue;
import scanneralt.InputPane;
import scanneralt.Main;

public class ForStatementNode implements TLNode {

    private String identifier;
    private TLNode startExpr;
    private TLNode stopExpr;
    private TLNode block;
    private TLNode expression;
    private TLNode start;
    private TLNode step;
    protected Scope scope;
    private int line;

    public ForStatementNode(String id, TLNode start, TLNode stop, TLNode bl, Scope s) {
        identifier = id;
        startExpr = start;
        stopExpr = stop;
        block = bl;
        scope = s;
    }

    public ForStatementNode(TLNode assign1, TLNode exp, TLNode assign2, TLNode bl, Scope s) {
        block = bl;
        scope = s;
        expression = exp;
        start = assign1;
        step = assign2;
    }

    
    /*
    @Override
    public TLValue evaluate() {

        int start = startExpr.evaluate().asDouble().intValue();
        int stop = stopExpr.evaluate().asDouble().intValue();

        for(int i = start; i <= stop; i++) {
            scope.assign(identifier, new TLValue(i));
            TLValue returnValue = block.evaluate();
            if(returnValue != TLValue.VOID) {
                return returnValue;
            }
        }
        
        
        

        return TLValue.VOID;
    }
     */
    @Override
    public TLValue evaluate() {

        setCaret();
        TLValue s = start.evaluate();
                

        while(expression.evaluate().asBoolean()){

            TLValue returnValue = block.evaluate();
            TLValue st = step.evaluate();
            
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
