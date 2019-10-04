
/**
 * Isaac Valasek
 * Car Class
 * Programming III
 * 9/30/2019
 */
public class CarDemo {

    public static void main(String[] args) {
        //create car object
        Car car = new Car(1989, "Ford", 0);
        
        //accelerate 5 times
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        
        // get speed
        System.out.println("The car accelerated to " + car.getSpeed() + 
                " miles per hour.");
        
        // brake 5 times
        car.brake();
        car.brake();
        car.brake();
        car.brake();
        car.brake();

        // get speed
        System.out.println("The braked to " + car.getSpeed() + " miles per "
                + "hour.");
    }

}
