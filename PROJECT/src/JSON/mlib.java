/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author spencer
 */


public class mlib {
    
     public static void main(String[] args) {
         
         
         
         new mlib().exp();
         new mlib().imp();
         
     }
     
    public class vars { 
    
    String name = "vars";
    String business;
    String activity;
    String obj;
    String name2;
    
}
        




         
    
    void exp() {
        
        JSONObject obj = new JSONObject();
        Scanner in = new Scanner(System.in);
        vars vars1 = new vars();
        
        System.out.print("Enter a name \n");
        
        //creates a json object and adds items to it
        
        
        vars1.name = in.nextLine();
        System.out.print("Enter a business\n");
        vars1.business = in.nextLine();
        System.out.print("Enter a activity \n");
        vars1.activity = in.nextLine();
        System.out.print("Enter plural object \n");
        vars1.obj = in.nextLine();
        System.out.print("Enter another name \n");
        vars1.name2 = in.nextLine();
        
        
        obj.put("name",vars1.name);
        obj.put("business",vars1.business);
        obj.put("activity",vars1.activity);
        obj.put("obj",vars1.obj);
        obj.put("name2",vars1.name2);
        

        //writes object to json file.
        try (FileWriter file = new FileWriter("k:\\projects\\madlib.json")) {
            file.write(obj.toJSONString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
               
        
    }
        
         
       //import json file to java
       void imp(){
           //create a new parser
            JSONParser parser = new JSONParser();
        // try to import a file into a new reader
        try (Reader reader = new FileReader("k:\\projects\\madlib.json")) {
            
            //create a json object to parse the reader
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            //prints out the full jsonobject
            
            vars vars2 = new vars();
            
            //prints out the jsonobject "name"
            vars2.name = (String) jsonObject.get("name");
            vars2.business = (String) jsonObject.get("business");
            vars2.activity = (String) jsonObject.get("activity");
            vars2.obj = (String) jsonObject.get("obj");
            vars2.name2 = (String) jsonObject.get("name2");
            
            System.out.print("Dear Mr or Mrs. " + vars2.name + "\n" +
                    "We regret to inform you that your application to " + vars2.business + " has been denied.\n"
                    +"Due to your lack of knowledge in " + vars2.activity + " it won’t be possible \n"
                    + "to continue your application process.\n\n" + 
                    "Perhaps if you spend more time focusing on " + vars2.obj + "\nwe may be able to consider you in the future. \n" +
                    "Sincerely, " + vars2.name2 + "\n");


            //catches exceptions if there are any
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
       }
}

     
    

    

