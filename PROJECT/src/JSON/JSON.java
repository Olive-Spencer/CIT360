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
public class JSON {
    
    
    
     public static void main(String[] args) {
         
         
         
         exp();
         imp();
         
     }
         
    
    static void exp() {
         
        //creates a json object and adds items to it
        JSONObject obj = new JSONObject();
        obj.put("name", "Spencer");
        obj.put("zip", 90210);
        
        //creates a json list and adds items to it
        JSONArray list = new JSONArray();
        list.add("This is not my real zip");
        list.add("I don't live in California");
        list.add("and if I did, I couldn't afford this zip");
        
        //puts the array into the object
        obj.put("messages", list);

        //writes object to json file.
        try (FileWriter file = new FileWriter("k:\\projects\\test.json")) {
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
        try (Reader reader = new FileReader("k:\\projects\\test.json")) {
            
            //create ajson object to parse the reader
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            //prints out the full jsonobject
            System.out.println(jsonObject);
            
            //prints out the jsonobject "name"
            String name = (String) jsonObject.get("name");
            System.out.println(name);

            //prints out the jsonobject "zip"
            long zip = (Long) jsonObject.get("zip");
            System.out.println(zip);

            //uses and iterator to print out jsonobject "messages" in an array
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            //catches exceptions if there are any
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
     
       }
     
     
     }
             