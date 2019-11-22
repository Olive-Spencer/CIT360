/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import java.util.HashMap;

/**
 *
 * @author spencer
 */
public class Controller {
    	private HashMap<String, Handler> commands;
	
	
	public Controller() {
		//constructor
		commands = new HashMap<String, Handler>();
		commands.put("displayMenu", new DisplayMenuHandler());
		commands.put("displayCrust", new DisplayCrustHandler());
                commands.put("displaySauce", new DisplaySauceHandler());
		commands.put("displayTops", new DisplayTopsHandler());
	}
		
	public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception{
		Handler command = commands.getOrDefault(commandKey, null);
		if(command==null) {
			throw new Exception("There is no command with the keyword'" + commandKey +"'.");
		}
		
		return command.handleIt(commandData);
		}
	
}
    

