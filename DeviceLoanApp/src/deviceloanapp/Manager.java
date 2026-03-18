/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */
public interface Manager {
    //add a device to a list
    void add(Device d); 
    //remove a device by id
    boolean remove(String deviceID);
    //finds a device by id
    Device search(String deviceID); 
    //displays all stored devices
    void displayAll();
}
