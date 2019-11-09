/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import static java.lang.Integer.parseInt;

/**
 *
 * @author spencer
 */
public class Controller{
    public String checkAge(String age){
        Model model = new Model();
        
        int ageInt = 0;
        //trying to parse the age into an int
        try{
             ageInt = parseInt(age);
             model.setAge(ageInt);
             ageInt = model.getAge();
            }
    //if it dosen't work it will return -1
    catch (Exception e) {
            return "You didn't enter a valid number";
            }
        //checking if ageInt is greater > 16
        
        if (checkDate(ageInt)){
            //no dates for you!
            age = "You are not old enough to date!";
            
        }
        return "you are old enough to date!";
}   //method to check the age is > 16
    public Boolean checkDate(int age){
        if (age >= 16){
            return false;
        }else{
            return true;
        }
    }
}
