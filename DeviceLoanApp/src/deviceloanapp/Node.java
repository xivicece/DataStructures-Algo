/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */
public class Node {
    Device data; // stores device object
    Node next;
    
    public Node(Device data){
        this.data = data; 
        this.next = null; //next node is null
    }
}
