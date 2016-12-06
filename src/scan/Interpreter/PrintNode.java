package scan.Interpreter;

import scan.TLValue;

import java.io.PrintStream;
import scanneralt.InputPane;
import scanneralt.Main;

public class PrintNode implements TLNode {

    private TLNode expression;
    private PrintStream out;
    private int line;
    
    public PrintNode(TLNode e) {
        this(e, System.out);
    }

    public PrintNode(TLNode e, PrintStream o) {
        expression = e;
        out = o;
    }

    @Override
    public TLValue evaluate() {
        setCaret();
        TLValue value = expression.evaluate();
        out.print(value == TLValue.NULL ? "" : value);
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
