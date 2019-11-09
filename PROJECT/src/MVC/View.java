/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;



import java.util.*;

/**
 *
 * @author spencer
 */
public class View {
    Scanner in = new Scanner(System.in);
    String age;
    Controller controller = new Controller();
    public static void main(String[] args){
    new View().view();
    }
    public void view(){
    System.out.println("Enter your age:");
    age = in.nextLine();
    String checkAge = controller.checkAge(age);
    System.out.println(checkAge);
    
    

}}
