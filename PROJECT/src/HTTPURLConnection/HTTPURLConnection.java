/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTTPURLConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

/**
 *
 * @author spencer
 */
public class HTTPURLConnection {
    public static void main(String args[]) throws Exception{
       //puts the URL into a string. This could be something entered by the user.
       String url = "https://olive-spencer.github.io/CIT-261/a12.html";
       //checks to see if the url is valid. If it is it executed the code.
       if (isValid(url)){
        //creating the url object
        URL website = new URL(url);  
        //opening the connection to the url
        HttpURLConnection open = (HttpURLConnection) website.openConnection();
        //creating a buffered reader to read from the url
        BufferedReader read = new BufferedReader(new InputStreamReader(open.getInputStream()));
        //creating a string to put the reader lines into
        String code;
        //while there is info print it to the user.
        while((code = read.readLine()) != null)
        {
            System.out.println(code);
                 
       
        }
        //close the connection
        read.close();
       // if the url is invalid it prints "invalid url to the user.
       }else{
           System.out.println("invalid url");
       }
    }
    
//checking to see if the url is valid and sending back the correct bool value.
public static boolean isValid(String url)
{
    try{
        new URL(url).toURI();
        return true;
    }
    catch (Exception e){
        return false;
    }
}


} 

