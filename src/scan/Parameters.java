/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scan;



/**
 *
 * @author Sonia Tan
 */
public class Parameters {
    
    private String id;
    private String type;
    
    public Parameters(String id, String type){
        this.id = id;
        this.type = type;
    }
 

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
}
