/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class EX1_Starter {
    
    public static void main(String[] args) {
        Task1 ta1 = new Task1();
        Task2 ta2 = new Task2();
        Task3 ta3 = new Task3();
        
        Thread t1 = new Thread(ta1);
        Thread t2 = new Thread(ta2);
        Thread t3 = new Thread(ta3);
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}