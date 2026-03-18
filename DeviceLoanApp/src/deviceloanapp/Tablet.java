/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceloanapp;

import java.util.Date;
/**
 *
 * @author CelinaMoali
 */

//this class adds a model field
public class Tablet extends Device{
    private String model;
    
    //constructor
    public Tablet(String deviceID, String userID, Date dueDate, String model){
        super(deviceID, userID, dueDate); //calls class constructor in device class first
        this.model = model;
    }
    
    //setters
    public void setModel(String model){
        this.model = model;
    }
    
    //getters
    public String getModel(){
        return model;
    }
    
}
