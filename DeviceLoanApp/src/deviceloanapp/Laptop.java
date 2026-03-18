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

//this class adds an os field
public class Laptop extends Device{
    private String os;
    
    //constructor
    public Laptop(String deviceID, String userID, Date dueDate, String os){
        super(deviceID, userID, dueDate); //calls class constructor in device class first
        this.os = os;
    }
    //setters
    public void setOS(String os){
        this.os = os;
    }
    
    //getters
    public String getOS(){
        return os;
    }
}
