    
/**
 * Isaac Valasek
 * Project Name
 * Programming III
 * Date
 */
public class RectangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 10);
        //set the length and width of the rectangle
        r.setLength(20);
        r.setWidth(10);
        System.out.println("The length of the rectangle is " + r.getLength());
        System.out.println("The width of the rectangle is " + r.getWidth());
        System.out.println("The area of the rectangle is " + r.getArea());
    }

}
