/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deviceloanapp;

/**
 *
 * @author CelinaMoali
 */
public interface Processor {
    //handle next request in the queue
    void processRequest();
    //extend loan date by a month
    void extendLoan(Device d);
}
