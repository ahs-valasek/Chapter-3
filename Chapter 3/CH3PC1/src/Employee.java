/**
 *
 * Isaac Valasek
 */
public class Employee {
    private int idNumber;
    private String name, department, position;
    
    
    /**
     * Employee Class constructor
     */
    public Employee(String n, int i, String d, String p) {
        name = n;
        idNumber = i;
        department = d;
        position = p;
        
    }
    
    /**
     * Employee Class No-Arg Constructor 
     */
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    
    /**
     * Set name 
     */
    public void setName(String n) {
        name = n;
    }
    
    /**
     * Set Id Number
     */
    public void setIdNumber(int i) {
        idNumber = i;
    }
    
    /**
     * Set Department
     */
    public void setDepartment(String d) {
        department = d;
    }
    
    /**
     * set Position 
     */
    public void setPosition(String p) {
        position = p;
    }
    
    /**
     * get Name
     */
    public String getName() {
        return name;
    }
    
    /**
     * get Id Number
     */
    public int getIdNumber() {
        return idNumber;
    }
    
    /**
     * get Department 
     */
    public String getDepartment() {
        return department;
    }
    
    /**
     * get Position
     */
    public String getPosition() {
        return position;
    }
}
