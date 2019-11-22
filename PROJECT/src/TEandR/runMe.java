/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEandR;



import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;


/**
 *
 * @author spencer
 */
public class runMe implements Runnable {
    
    AtomicInteger atomic = new AtomicInteger(0);
    IntUnaryOperator oneplus = a -> a + 1;
    
    
    runMe(AtomicInteger atomicInt){
        
        this.atomic=atomicInt;
    }
   
    @Override
    public void run(){
        try{
            
            for(int i = 0; i < 10000000; i++){
            atomic.updateAndGet(oneplus);
            }
        }
        catch(Exception e){}
       
    
        if (atomic.get() == 100000000){
        System.out.println(atomic);
        }
    
    } 
}
  

