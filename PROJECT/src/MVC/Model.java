/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author spencer
 */
public class Model {
    //just a getter and setter for age.
    private int age;
    
    //different variables are thrown around but this is the only true age
    //it will be the age the user entered as an int if it was a valid int.
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
}
