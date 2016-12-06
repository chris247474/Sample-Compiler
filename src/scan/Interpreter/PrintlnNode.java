package scan.Interpreter;

import java.io.PrintStream;
import scan.TLValue;
import scanneralt.InputPane;
import scanneralt.Main;

public class PrintlnNode implements TLNode {

    private TLNode expression;
    private PrintStream out;
    private int line;
    
    public PrintlnNode(TLNode e) {
        this(e, System.out);
    }

    public PrintlnNode(TLNode e, PrintStream o) {
        expression = e;
        out = o;
    }

    @Override
    public TLValue evaluate() {
        setCaret();
        TLValue value = expression.evaluate();
        if(value != null)
            out.println(value);
        else
            System.err.println("Null Exception");
        return TLValue.VOID;
    }
    
    public void setLine(int a){
        line = a;
    }
    
    public void setCaret(){
        InputPane p = Main.getSelTab();
        p.getTextArea().setCaretPosition(p.getPos(line));
    }
    
}
