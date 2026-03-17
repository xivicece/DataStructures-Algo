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
public class Device {
    protected String deviceID; 
    protected String userID;
    protected Date dueDate;
    
    //constructor
    public Device(String deviceID, String userID, Date dueDate){
        this.deviceID = deviceID;
        this.userID = userID;
        this.dueDate = dueDate;
    }
    
    //setters
    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }
    
    //getters
    public String getDeviceID(){
        return deviceID;
    }
    
    public String getUserID(){
        return userID;
    }
    
    public Date getDueDate(){
        return dueDate;
    }
}
