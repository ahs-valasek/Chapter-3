/**
 * The rectangle class demonstrates a rectangle
 * 
 */
public class Rectangle {
    private int length;
    private int width;
    
    /**
     *  Rectangle class constructor
     */
    public Rectangle(int len, int w) {
        length = len;
        width = w;
    }
    
    /**
     * Rectangle Class No-Arg Constructor 
     */
    public Rectangle(){
        length = 1;
        width = 1;
    }
    
    /**
     * the setLength method accepts an argument 
     * that is stored in the length field (attribute)
     */        
    public void setLength(int l){
        length = l;
    }
    
    /**
     * the setWidth accepts an argument
     * that is stored in the width field
     */
    public void setWidth(int w){
        width = w;
    }
    
    /**
     * the getLength method returns the value
     * stored in the length field
     */
    public int getLength() {
        return length;    
    }
    
    /**
     * the getWidth method returns the value
     * stored in the width field
     */    
    public int getWidth() {
        return width;
    }
    
    /**
     * the getWidth method returns the value
     * of the length field times the width field
     */        
    public int getArea() {
        return length * width;
    }
}
