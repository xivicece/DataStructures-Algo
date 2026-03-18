/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */
public class DeviceLinkedList implements Manager{
    //start of the list
    Node head; 
    
    //keeps track of how many devices are stored now
    int size;
    
    public DeviceLinkedList(){
        head = null;
        size = 0;
    }
    
    //add a device to the end of the list
    @Override
    public void add(Device d){
        Node newNode = new Node(d);
        //if list is empty, new node becomes the head
        if(head == null){
            head = newNode;
        }
        //else, method moves through list until the last node
        else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            //put new node in the end
            temp.next = newNode;
        }
        size++;
    }
    
    //seach through linked list for matching deviceID
    //if found,method returns device object
    //if not found, returns null
    @Override
    public Device search(String deviceID){
        Node temp = head;
        while (temp != null){
            //if found. method returns device object
            //if not found, it reruns null
            if(temp.data.getDeviceID().equals(deviceID)){
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }
    
    //updates stored device by replacing old object with new version having same device id.
    //used if device details change.
    public void update(Device d){
        Node temp = head;
        
        while (temp != null){
            if(temp.data.getDeviceID().equals(d.getDeviceID())){
                temp.data = d;
                return;
            }
            temp = temp.next;
        }
    }
    
    //remove device from linked list using device id
    @Override
    public boolean remove(String deviceID){
        //if device found and removed, true
        //false if device doesn't exist
        if(head == null){
         return false;   
        }
        //node to remove is the first node
        if(head.data.getDeviceID().equals(deviceID)){
            head = head.next;
            size--;
            return true;
        }
        Node temp = head;
        
        //check each next node so the current node can reconnect the list
        while(temp.next != null){
            if(temp.next.data.getDeviceID().equals(deviceID)){
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    //returns head so gui can loop through list
    public Node getHead() {
        return head;
    }
    
    //display all devices
    // only used for testing since the gui table display is 
    //handled with JFrame class
    @Override
    public void displayAll(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data.displayInfo());
            temp = temp.next;
        }
    }
}
