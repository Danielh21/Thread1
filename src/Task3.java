
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Task3 implements Runnable{
 
    @Override
    public void run() {
        long billion = 10000000;
        
        for (int i = 10; i < billion; i++) {
            System.out.println("Task 3: " +i);  
        
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        
    }

