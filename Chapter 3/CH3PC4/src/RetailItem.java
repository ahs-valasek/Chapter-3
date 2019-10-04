

/**
 *
 * @author 992005923
 */
public class RetailItem {
    /**
     * Declare privates
     */
    private String description;
    private int unitsOnHand;
    private double price;
    
    /**
     * Retail Item Class Constructor
     */
    public RetailItem(String d, int u, double p) {
        description = d;
        unitsOnHand = u;
        price = p;
    }
    
    /**
     * Retail Item No-arg Constructor
     */
    public RetailItem() {
        description = "";
        unitsOnHand = 0;
        price = 0.0;
    }
    
    /**
     * set description
     */
    public void setDescription(String d) {
        description = d;
    }
    
    /**
     * set UnitsOnHand
     */
    public void setUnitsOnHand(int u) {
        unitsOnHand = u;
    }
    
    /**
     * set price
     */
    public void setPrice(double p) {
        price = p;
    }
    
    /**
     * get description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * get UnitsOnHand
     */
    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    
    /**
     * get price
     */
    public double getPrice() {
        return price;
    }
}
