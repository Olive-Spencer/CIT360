/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

/**
 *
 * @author spencer
 */

import java.util.HashMap;
import java.util.Scanner;

public class DisplayMenuHandler implements Handler{

	public DisplayMenuHandler() {
	}
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		
		String menuList = "\n---------------------------------------------------"
		        +"\n|  Main Menu Pizza Choices              |"
		        +"\n---------------------------------------------------"
		        +"\n1 - Display Crust"
		        +"\n2 - Display Sauce"    
		        +"\n3 - Display Toppings"
		        +"\n4 - Quit"

		        +"\n---------------------------------------------------"

		        +"\nPlease enter your choice: ";
		

		System.out.print(menuList);
		Scanner in = (Scanner)data.get("scanner");
		int selection = GetNextInt(in);
		return selection;
		
	}

	private int GetNextInt(Scanner scanner) {
		String input = scanner.nextLine();
		try {
			int result = Integer.parseInt(input);
			return result;
		}
		catch (Exception e) {
			System.out.println("You must enter a number from the menu.");
			return -1;
		}
		
	}
}
