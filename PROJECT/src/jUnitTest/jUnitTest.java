/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jUnitTest;

/**
 *
 * @author spencer
 */
public class jUnitTest {
    
    public int plus1(int x){
        int y = x+1;
        return y;
    }
    
    public boolean is1(int x){
        if (x == 1){
            return true;
        }else{
            return false;
        }
    }
    public String notNull(int x){
        if (x == 1){
            return null;
        }else{
            return "not null";
        }
        
    }
    public int[] Arra(int x, int y, int z){
        
        int[] arr = new int[]{ x,y,z };
        return arr;
    }
    }
    

