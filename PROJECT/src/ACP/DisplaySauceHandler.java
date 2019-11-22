/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;
import java.util.Arrays;

import java.util.HashMap;
/**
 *
 * @author spencer
 */
public class DisplaySauceHandler implements Handler {
    
    @Override
    public Object handleIt(HashMap<String, Object> data) {
        
        Model pizza = (Model)data.get("Pizza");
        
        String [] sauce = pizza.getSauce();
        
        System.out.println("Sauce: " + Arrays.deepToString(sauce));
        
        return null;
    }
    
}
