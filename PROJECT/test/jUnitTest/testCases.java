package jUnitTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.hamcrest.CoreMatchers.isA;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spencer
 */
public class testCases {
    jUnitTest test = new jUnitTest();
    @Test
    public void isEqual() {
        //plus1 is number + 1 so any number with 1 added will pass the test.
        int out = test.plus1(1);
        assertEquals(2, out);
        
        
    }
    @Test
    public void isFalse() {
        //any number but 1 will pass the test.
        boolean tf = test.is1(2);
        assertFalse(tf);
    }
    @Test
    public void isTrue() {
        //this test should pass is 1 is passed in.
        boolean tf = test.is1(1);
        assertTrue(tf);
    }
    @Test
    public void notNull() {
        //any number but 1 will pass the test.
        String check = test.notNull(2);
        assertNotNull(check);
    }
    
    @Test
    public void isNull(){
        //1 is the only number that will pass the test.
        String check = test.notNull(1);
        assertNull(check);
    }
    @Test
    public void isThat(){
        //this passes unless the item passed to test.notNull is a 1.
        assertThat(test.notNull(2),isA(String.class));
    }
    @Test 
    public void isSame(){
        //as long as the number passed to notNull is 1 test will pass.
        String check = test.notNull(1);
        assertSame(null, check);
        
    }
    @Test
    public void notSame(){
        String check = test.notNull(2);
        assertNotSame(null, check);
    }
    
    @Test
    //this is a true test and should never fail unless there is an error in the code.
    public void isArray(){
        int x = 1;
        int y = 2;
        int z = 3;
        int[] arr = new int[]{ x,y,z };
        int[] arrCheck = test.Arra(x, y, z);
        assertArrayEquals(arr, arrCheck);
    }
    
    
    

    
}
