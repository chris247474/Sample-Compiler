/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package scan;

import antlr.CommonAST;
import antlr.Token;
import antlr.collections.AST;

/**
 *
 * @author katrina
 */
public class NewNode extends CommonAST {
    int line;
    int column;

    @Override
    public void initialize(Token t)
    {
        super.initialize(t);
        line = t.getLine();
        column = t.getColumn(); 
    }
    public void initialize(AST t)
    {
        super.initialize(t);
        line = t.getLine();
        column = t.getColumn();
    }
}
