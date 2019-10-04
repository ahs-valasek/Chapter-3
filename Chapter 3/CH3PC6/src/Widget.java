/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 992005923
 */
public class Widget {
    //initialize privates
    private int numWidgets, calculate;
    private int WIDGETSPERHOUR = 10, HOURSPERSHIFT = 4, NUMSHIFTS = 2;
    
    /**
     * Widget Class Constructor
     */
    public Widget(int n, int c) {
        numWidgets = n;
    }
    
    /**
     * No-arg Class Constructor
     */
    public Widget() {
        numWidgets = 0;
    }
    
    /**
     * set NumWidgets
     */
    public void setNumWidgets(int n) {
        numWidgets = n;
    }
    
    /**
     * get NumWidgets
     */
    public int getNumWidgets() {
        return numWidgets;
    }
    
    /**
     * calculate Widget Days
     */
    public int calculateWidgetDays() {
        calculate = numWidgets / (WIDGETSPERHOUR * HOURSPERSHIFT * NUMSHIFTS);
        return calculate;
    }
}
