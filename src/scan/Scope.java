package scan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Scope {

    private Scope parent;
    private Map<String, TLValue> variables;
    private Map<String, String> vType;
    private Map<String, String> vArrayType;
    private Map<String, ArrayList<TLValue>> array;
    private static Map<String, Object> constants;
    
    public Scope() {
        // only for the global scope, the parent is null
        this(null);
    }

    public Scope(Scope p) {
        parent = p;
        variables = new HashMap<String, TLValue>();
        vType = new HashMap<String, String>();
        vArrayType = new HashMap<String, String>();
        constants = new HashMap<String, Object>();
        array = new HashMap<String, ArrayList<TLValue>>();
    }

    public void assign(String var, TLValue value) {
        if(resolve(var) != null) {
            // There is already such a variable, re-assign it
            this.reAssign(var, value);
        }
        else {
            // A newly declared variable
            variables.put(var, value);
        }
    }
    
    public void constant(String var, TLValue value, String type) {
        if(resolve(var) != null){ 
                System.err.println("Constant or variable exists!");
        }
        else {
            
            if(value.isString() && type.equals("String")){
                variables.put(var, value);
                vType.put(var, type);
                constants.put(var,value);
            }
            else if(value.isBoolean() && type.equals("boolean")){
                variables.put(var, value);
                vType.put(var, type);
                constants.put(var,value);
            }
            else if(value.isFloat() && type.equals("double")){
                variables.put(var, value);
                vType.put(var, type);
                constants.put(var,value);
            }
            else if(value.isInt() && type.equals("int")){
                variables.put(var, value);
                vType.put(var, type);
                constants.put(var,value);
                this.parent = null;
            }
            else
                System.err.println("Type Mismatch!");
                
        }
        
    }
    
    public void assign(String var, TLValue value, String type) {
        if(resolve(var) != null) {
            // There is already such a variable, re-assign it
            if(constants.get(var) == null)
                if(vType.get(var) != null)
                    if(type == null){
                        if(value.isString() && vType.get(var).equals("String"))
                            this.reAssign(var, value);
                        else if(value.isBoolean() && vType.get(var).equals("Boolean"))
                            this.reAssign(var, value);
                        else if(value.isFloat() && vType.get(var).equals("double"))
                            this.reAssign(var, value);
                        else if(value.isInt() && vType.get(var).equals("int"))
                            this.reAssign(var, value);
                        else if(value.isBoolean() && vType.get(var).equals("boolean"))
                            this.reAssign(var, value);
                        else
                            System.err.println("Type Mismatch!");
                    }else 
                        System.err.println("Variable has already been declared!");
                else
                        this.reAssign(var, value);
            else
                System.err.println("Cannot reassign a constant");
                
            
        }
        else {
            if(type == null && vType.get(var) == null)
                System.err.println("Variable has not yet been Declared!"); 
            else{
                // A newly declared variable
                if(value.isString() && type.equals("String")){
                    variables.put(var, value);
                    vType.put(var, type);
                }
                else if(value.isBoolean() && type.equals("boolean")){
                    variables.put(var, value);
                    vType.put(var, type);
                }
                else if(value.isFloat() && type.equals("double")){
                    variables.put(var, value);
                    vType.put(var, type);
                }
                else if(value.isInt() && type.equals("int")){
                    variables.put(var, value);
                    vType.put(var, type);
                }
                else
                    System.err.println("Type Mismatch!");
                
                
            }
        }
    }
    
    
    public void assignArray(String var,int index, TLValue value) {
        if(resolveArray(var, index) != null) {
            // There is already such a variable, re-assign it
                if(vArrayType.get(var) != null)
                    
                        if(value.isString() && vArrayType.get(var).equals("String"))
                            this.reAssignArray(var,index,value);
                        else if(value.isBoolean() && vArrayType.get(var).equals("Boolean"))
                            this.reAssignArray(var,index,value);
                        else if(value.isFloat() && vArrayType.get(var).equals("double"))
                            this.reAssignArray(var,index,value);
                        else if(value.isInt() && vArrayType.get(var).equals("int"))
                            this.reAssignArray(var,index,value);
                        else if(value.isBoolean() && vArrayType.get(var).equals("boolean"))
                            this.reAssignArray(var,index,value);
                        else
                            System.err.println("Type Mismatch!");
  
            
        }
        else {
                if(array.get(var) != null)
                    System.err.println("Array Index out of bounce!");
                else
                    System.err.println("Array has not yet been declared!");
            
 
        }
    }
    
    public void declArray(String var, int size, String type) {
        if(array.get(var) != null) {
            System.err.println("Array has already been declared!");
        }
        else {
           
                // A newly declared variable
                if(type.equals("String")){
                    ArrayList<TLValue> a = new ArrayList<TLValue>();
                    for(int i = 0 ; i < size ; i++){
                        a. add(new TLValue(""));
                    }
                    array.put(var, a);
                    vArrayType.put(var, type);
                }
                else if(type.equals("boolean")){
                    ArrayList<TLValue> a = new ArrayList<TLValue>();
                    
                    for(int i = 0 ; i < size ; i++){
                        a. add(new TLValue(false));
                    }
                    array.put(var, a);
                    vArrayType.put(var, type);
                }
                else if(type.equals("double")){
                    ArrayList<TLValue> a = new ArrayList<TLValue>();
                    for(int i = 0 ; i < size ; i++){
                        a.add(new TLValue(0));
                    }
                    array.put(var, a);
                    vArrayType.put(var, type);
                }
                else if(type.equals("int")){
                    ArrayList<TLValue> a = new ArrayList<TLValue>();
                    for(int i = 0 ; i < size ; i++){
                        a.add(new TLValue(0));
                    }
                    array.put(var, a);
                    vArrayType.put(var, type);
                }
        }
    }

    public Scope copy() {
        // Create a shallow copy of this scope. Used in case functions are
        // are recursively called. If we wouldn't create a copy in such cases,
        // changing the variables would result in changes ro the Maps from
        // other "recursive scopes".
        Scope s = new Scope();
        s.variables = new HashMap<String, TLValue>(this.variables);
        s.vType = new HashMap<String, String>(this.vType);
        s.array = new HashMap<String, ArrayList<TLValue>>(this.array);
        
        return s;
    }

    public boolean isGlobalScope() {
        return parent == null;
    }

    public Scope parent() {
        return parent;
    }

    private void reAssign(String identifier, TLValue value) {
        if(variables.containsKey(identifier)) {
            // The variable is declared in this scope
            variables.put(identifier, value);
        }
        else if(parent != null) {
            // The variable was not declared in this scope, so let
            // the parent scope re-assign it
            parent.reAssign(identifier, value);
        }
    }
    
    private void reAssignArray(String identifier,int index ,TLValue value) {
        if(array.containsKey(identifier)) {
            // The variable is declared in this scope
            
          array.get(identifier).set(index, value);
        }
        else if(parent != null) {
            // The variable was not declared in this scope, so let
            // the parent scope re-assign it
            parent.reAssignArray(identifier,index ,value);
        }
    }

    public TLValue resolve(String var) {
        TLValue value = variables.get(var);
        if(value != null) {
            // The variable resides in this scope
            return value;
        }
        else if(!isGlobalScope()) {
            // Let the parent scope look for the variable
            return parent.resolve(var);
        }
        else {
            // Unknown variable
            return null;
        }
    }
    
    public TLValue resolveArray(String var, int index) {
        
        ArrayList<TLValue> tmp = array.get(var);
        if(tmp != null){
            TLValue value = tmp.get(index);
        
            if(value != null) {
                // The variable resides in this scope
                return value;
            }
            else if(!isGlobalScope()) {
                // Let the parent scope look for the variable
                return parent.resolveArray(var, index);
            }
            else {
                // Unknown variable
                return null;
            }
        }else if(!isGlobalScope()) {
                // Let the parent scope look for the variable
            return parent.resolveArray(var, index);
        }
        else {
            // Unknown variable
            return null;
        }
        
    }
}
