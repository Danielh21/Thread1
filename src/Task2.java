
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
public class Task2 implements Runnable{
    
        

    @Override
    public void run() {
        for (int i = 1; i <6 ; i++) {
            System.out.println( "Task 2: "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
        
    }
