/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */
public class User {
    String userID;
    String firstName;
    String lastName;
    String phone;
    String address;
    
    public User(String userID, String firstName, String lastName, String phone, String address){
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
    
    //getters
    public String getUserID(){
        return userID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
}
