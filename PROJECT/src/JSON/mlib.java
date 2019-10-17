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
         
         
         
         exp();
         imp();
         
     }
         
    
    static void exp() {
        
        JSONObject obj = new JSONObject();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name \n");
        
        //creates a json object and adds items to it
        
        obj.put("name",in.nextLine());
        System.out.print("Enter a business\n");
        obj.put("business",in.nextLine());
        System.out.print("Enter a activity \n");
        obj.put("activity",in.nextLine());
        System.out.print("Enter plural object \n");
        obj.put("obj",in.nextLine());
        System.out.print("Enter another name \n");
        obj.put("name2",in.nextLine());
        

        //writes object to json file.
        try (FileWriter file = new FileWriter("k:\\projects\\madlib.json")) {
            file.write(obj.toJSONString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
               
        
    }
        
         
       //import json file to java
       static void imp(){
           //create a new parser
            JSONParser parser = new JSONParser();
        // try to import a file into a new reader
        try (Reader reader = new FileReader("k:\\projects\\madlib.json")) {
            
            //create ajson object to parse the reader
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            //prints out the full jsonobject
            
            
            //prints out the jsonobject "name"
            String name = (String) jsonObject.get("name");
            String bus = (String) jsonObject.get("business");
            String act = (String) jsonObject.get("activity");
            String object = (String) jsonObject.get("obj");
            String name2 = (String) jsonObject.get("name2");
            
            System.out.print("Dear Mr or Mrs. " + name + "\n" +
                    "We regret to inform you that your application to " + bus + " has been denied.\n"
                    +"Due to your lack of knowledge in " + act + " it won’t be possible \n"
                    + "to continue your application process.\n\n" + 
                    "Perhaps if you spend more time focusing on " + object + "\nwe may be able to consider you in the future. \n" +
                    "Sincerely, " + name2 + "\n");


            //catches exceptions if there are any
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
       }
}

     
    

    

