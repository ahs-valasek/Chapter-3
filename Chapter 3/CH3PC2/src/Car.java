/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 992005923
 */
public class Car {
    
    //declare private variables
    private int yearModel, speed;
    private String make;
    
    /**
     * Car Constructor
     */
    public Car(int y, String m, int s) {
        yearModel = y;
        make = m;
        speed = s;
    }
    
    /**
     * No-arg Constructor
     */
    public Car() {
        yearModel = 0;
        make = "";
        speed = 0;
    }
    
    /**
     * set yearModel
     */
    public void setYearModel(int y){
        yearModel = y;
    }
    
    /**
     * set make
     */
    public void setMake(String m) {
        make = m;
    }
    
    /**
     * set speed
     */
    
    public void setSpeed(int s) {
        speed = s;
    }
    
    /**
     * get year model
     */
    public int getYearModel() {
        return yearModel;
    }
    
    /**
     * get make
     */
    public String getMake() {
        return make;
    }
    
    /**
     *  get speed
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * accelerate method
     */
    public void accelerate() {
        speed += 5;
    }
    
    /**
     * brake
     */
    public void brake() {
        speed -= 5;
    }
}
