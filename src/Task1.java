/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
  public class Task1 implements Runnable{
      

    @Override
    public void run() {
        
        long billion = 10000000;
          long sum = 0;
          for (long i = 0; i < billion; i++) {
              sum += i;
          }
          System.out.println("Task 1: " + sum);
      
    }
      
    }
