
/**
 * Isaac Valasek
 * Widget Factory
 * Programming III
 * 10/2/19
 */
import java.util.Scanner;
public class WidgetDemo {

    public static void main(String[] args) {
        //create objects
        Scanner keyboard = new Scanner(System.in);
        Widget w = new Widget();
        
        //ask for amount of widgets
        System.out.println("Enter an amount of widgets: ");
        w.setNumWidgets(keyboard.nextInt());
        
        //calculate and diplay
        int widgetDays = w.calculateWidgetDays();
        if(widgetDays == 0) {
            System.out.println("It will take less than 1 day to make"+
                    " those widgets.");
        } else {
        System.out.println("It will take " + w.calculateWidgetDays() + 
                " days to make those widgets.");
        }
    }

}
