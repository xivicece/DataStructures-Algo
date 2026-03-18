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

//represents one device being loaned, storing basic info
public class Device {
    //using protected so child classes can access variables through inheritance
    protected String deviceID; 
    protected String userID;
    protected Date dueDate;
    protected boolean isAvailable; //shows if device is free or on loan
    
    //constructor
    public Device(String deviceID, String userID, Date dueDate){
        this.deviceID = deviceID;
        this.userID = userID;
        this.dueDate = dueDate;
        this.isAvailable = false;
    }
    
    //setters
    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }
    
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    
    // returns readable ver. of the device info (for testing)
    public String displayInfo(){
        return "Device ID: " + deviceID + ", UserID: "+ userID + ", Due Date: " +dueDate;
    }
    
    //getters
    public String getDeviceID(){
        return deviceID;
    }
    public String getUserID(){
        return userID;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public Date getDueDate(){
        return dueDate;
    }
}
