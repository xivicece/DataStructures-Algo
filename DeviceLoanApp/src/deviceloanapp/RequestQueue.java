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
