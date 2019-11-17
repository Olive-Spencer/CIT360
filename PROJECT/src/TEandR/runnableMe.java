/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEandR;

import java.util.Random;

/**
 *
 * @author spencer
 */
public class runnableMe implements Runnable {
    
    String name;
    int speed;
    Random rand = new Random();
    
    public runnableMe(String nameIn){
        name = nameIn;
        speed = rand.nextInt(9999);
    }
    
  
    
    public void run(){
        try{
                     
            if("Done".equals(name)){
                Thread.sleep(10000);
                System.out.println("The race is over!");
            }else{
                Thread.sleep(speed);
                System.out.print(name + " has finished the race!\n");
            }
        }
        catch(Exception e){}
        
    }
    }
    

