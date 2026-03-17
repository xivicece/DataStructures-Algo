/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */
public class DeviceLinkedList {
    Node head; //start of the list
    
    public DeviceLinkedList(){
        head = null;
    }
    
    //add a device to the end of the list
    public void add(Device d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }
    
    //seach by deviceID
    
    //remove by deviceID
    
    //display all devices
}
