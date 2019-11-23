/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEandR;


import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;




/**
 *
 * @author spencer
 */

public class threads{
    public static void main(String[] args) {
        System.out.println("This program is going to use 10 threads to count to 150,000\n"
                + "When it is finished it will print out atomic.get() which will be 150,000\n"
                + "Please be patient this takes a short time");
        pool();
        

}
    public static void pool(){
        ExecutorService exe = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor executor = (ThreadPoolExecutor) exe;
        AtomicInteger atom = new AtomicInteger(0);
        
       
        
       for (int i = 0; i < 10; i++){
           
           executor.submit(new runMe(atom));
           
       }
       executor.shutdown();
       
       Thread thread1 = new Thread(new runMe(atom));
       Thread thread2 = new Thread(new runMe(atom));
       Thread thread3 = new Thread(new runMe(atom));
       Thread thread4 = new Thread(new runMe(atom));
       Thread thread5 = new Thread(new runMe(atom));
       thread1.start();
       thread2.start();
       thread3.start();
       thread4.start();
       thread5.start();
       
       
    }
    
   

}
