
/**
 * Isaac Valasek
 * Retail Item
 * Programming III
 * 10/1/19
 */
public class RetailItemDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create 3 item objects
        RetailItem item1 = new RetailItem("Item #1\t\t Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Item #2\t\t Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Item #3\t\t Shirt", 20, 24.95);
        
        //Display info
        System.out.println("Description\t\t\tUnits On Hand\t\tPrice");
        System.out.println("-------------------------------------------------"
                + "--------------");
        System.out.println(item1.getDescription() + "\t\t"
                + item1.getUnitsOnHand() + "\t\t\t" + item1.getPrice());
        System.out.println(item2.getDescription() + "\t"
                + item2.getUnitsOnHand() + "\t\t\t" + item2.getPrice());
        System.out.println(item3.getDescription() + "\t\t"
                + item3.getUnitsOnHand() + "\t\t\t" + item3.getPrice());
    }

}
