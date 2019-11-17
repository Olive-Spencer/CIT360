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
		//commands.put("displayParents", new DisplayParentsHandler());
		//commands.put("displayChildren", new DisplayChildrenHandler());
		//commands.put("displayFamilyFavorites", new DisplayFamilyFavoritesHandler());
	}
		
	public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception{
		Handler command = commands.getOrDefault(commandKey, null);
		if(command==null) {
			throw new Exception("Ther is no command with the key word'" + commandKey +"'.");
		}
		
		return command.handleIt(commandData);
		}
	
}
    

