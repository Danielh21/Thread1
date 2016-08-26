/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

/**
 *
 * @author Daniel
 */
public class Even {

    Even obj;
    
    Task1 ta1 = new Task1();
    Task2 ta2 = new Task2();
    Thread t1 = new Thread(ta1);
    Thread t2 = new Thread(ta2);

    private int n = 0;
    public synchronized int next() {
        n++;
        n++;
        return n;
    }
    
    public void start(){
    obj = new Even();
    t1.start();
    t2.start();
    }
    
    class Task2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            
            int num = obj.next();
            if(num%2 != 0){
                System.out.println("NOT EVEN: " + num);
            }
            
       System.out.println("T2: "+ num);
        }
    }
    }
    
    class Task1 implements Runnable{

    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            
            int num = obj.next();
            
            if(num%2 != 0){
                System.out.println("NOT EVEN: " + num);
            }
            
//        System.out.println("T1: " + num);
        }
    }
    
}
}
