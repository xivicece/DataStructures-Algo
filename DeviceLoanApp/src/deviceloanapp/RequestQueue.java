/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */

//handles pending device requests(fifo)
public class RequestQueue {
    //first points to the first request in queue
    //rear point to th last request in queue
    Node front, rear;
    
    //constructor
    public RequestQueue(){
        front = null;
        rear = null;
    }
    
    //adds a device request to end
    //if queue is empty, front and rear point to new node
    public void enqueue(Device d){
        Node newNode = new Node(d);
        if(rear == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    // removes a specific device from the queue using its id
    // used when a device gets returned so it doesn't stay in awaiting
    public boolean removeByDeviceID(String deviceID) {
        // if queue is empty then nothing to remove
        if (front == null) {
            return false;
        }
        // if the first item matches, just remove it
        if (front.data.getDeviceID().equalsIgnoreCase(deviceID)) {
            dequeue();
            return true;
        }
        Node current = front;
        
        // go through the queue to find the device
        while (current.next != null) {
            if (current.next.data.getDeviceID().equalsIgnoreCase(deviceID)) {
                // if it's the last item, update rear
                if (current.next == rear) {
                    rear = current;
                }
                // skip over the node, so removing it
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        // device not found
        return false;
    }
    
    //removes the oldest request
    //if queue becomes empty after removal, rear is also set to null
    public Device dequeue(){
        if(front == null){
            return null;
        }
        
        Device removedDevice = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return removedDevice;
    }
    
    //returns forst node so gui can display queue contents in jtable
    public Node getFront(){
        return front;
    }
}
