/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEandR;



/**
 *
 * @author spencer
 */
public class threads{
    public static void main(String[] args) {
    Thread t1 = new Thread(new runnableMe("Turtle"));
    Thread t2 = new Thread(new runnableMe("Rabbit"));
    Thread t3 = new Thread(new runnableMe("Sloth"));
    Thread t4 = new Thread(new runnableMe("Aardvark"));
    Thread t5 = new Thread(new runnableMe("Done"));
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    System.out.print("The race has started!\n");
    
 
    
    
    
    
    
}
}
