/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */

//this class stores recently returned devices using stack (lifo)
public class ReturnStack {
    //top points ot most recent returned device
    Node top;
    
    //constructor
    public ReturnStack(){
        top = null;
    }
    
    //adds returned device to the top
    // newnode pointing to old top, then taking over as new top itself
    public void push(Device d){
        Node newNode = new Node(d);
        newNode.next = top;
        top = newNode;
    }
    
    //removes and returns device on top of the stack
    //meaning most recently returned device is removed first
    public Device pop(){
        if(top == null){
            return null;
        }
        
        Device removedDevice = top.data;
        top = top.next;
        return removedDevice;
    }
    
    //returns top node so the gui can display the stack contents in jtable
    public Node getTop(){
        return top;
    }
    
}
