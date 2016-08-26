package EX2;

/**
 *
 * @author Daniel
 */
public class EX2_Starter {

    public static void main(String[] args) {
     Even e = new Even();
     
     e.start();
    }
}

/*
Answers to Questions:

 Explain what happens?
Sometimes both threads are in the same method at the same time, and after 
thread 1 has incremented the number twice, thread 2 increments the number once,
and before thread 2 increments the number agaian, thread 1 sends back the answer.
Then the will contuine to do this servel times or maybe jump back to a normal state
again, depending on how the machine time runs.



 How common is the problem?
It happend almost every time I runned the program without the synchronized
keyword for the next method. But introducing synchronized made sure that
thread 2 waited on thread 1, and then it did't happend again.

*/
