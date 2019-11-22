/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author spencer
 */
public class runACP {
    
    
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//Put in sample data for program example 
		
		String[] crust = {"Stuffed", "Thin", "Chicago"};
		String[] sauce = {"Tomato", "White"};
		String[] tops = {"Tomato", "Peppers", "Pepproni", "Pineapple", "Extra Cheese", "Anchovies", "Ham"};
		
		Model pizza = new Model(crust, sauce, tops);
		
		
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		try {
		
		int choice = -1;
		
		while(choice !=4) {
		
				choice = (int)controller.doCommand("displayMenu", GetCommmandData("scanner", scanner));
			
			switch (choice) {
			case 1: 
				System.out.println();
				
				controller.doCommand("displayCrust", GetCommmandData("Pizza", pizza));
				
				break;
			case 2:
				System.out.println();
				
				controller.doCommand("displaySauce", GetCommmandData("Pizza", pizza));
				break;
				
			case 3:
				System.out.println();
				
				controller.doCommand("displayTops", GetCommmandData("Pizza", pizza));
				break;	
				
			case 4:
				System.out.println("\nProgram Shutting Down");
				break;
				
			default:
				System.out.println("That is not a valid menu option, please enter a valid choice.");
				break;
			}
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//Create hash map to use to pass to handler
	public static HashMap<String, Object> GetCommmandData (String key, Object value)
	{
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put(key,value);
		return data;
		
	}
	

    
}
