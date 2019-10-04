
/**
 * Isaac Valasek
 * Project Name
 * Programming III
 * 9/26/19
 */
public class EmployeeRunner {

    public static void main(String[] args) {
        
        //create employee objects
        Employee em1 = new Employee("Susan Myers", 47899, "Accounting",
                "Vice President");
        Employee em2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee em3 = new Employee("Joy Rogers", 81774 , "Manufacturing", 
                "Engineer");
        
        //print employee info
        System.out.println("Name\t\tID Number\t\tDepartment\t\tPosition");
        System.out.println("--------------------------------------------------"
                + "------------------------");
        System.out.println(em1.getName() + "\t" + em1.getIdNumber() + "\t\t\t" 
                + em1.getDepartment() + "\t\t" + em1.getPosition());
        System.out.println(em2.getName() + "\t" + em2.getIdNumber() + "\t\t\t" 
                + em2.getDepartment() + "\t\t\t" + em2.getPosition());
        System.out.println(em3.getName() + "\t" + em3.getIdNumber() + "\t\t\t" 
                + em3.getDepartment() + "\t\t" + em3.getPosition());        
    }

}
