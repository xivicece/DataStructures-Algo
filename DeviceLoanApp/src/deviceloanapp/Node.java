/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */

//node used in linked list, queue and stack. holding a device
// and referencing to next node
public class Node {
    // stores device object
    Device data;
    
    //next points to next node in structure
    // if next = null, then it's the last node
    Node next;
    
    public Node(Device data){
        this.data = data; 
        this.next = null; //next node is null
    }
}
