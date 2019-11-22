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
public class Model {
        
	String [] Crust;
	String [] Sauce;
	String [] Tops;

	public Model(String[] crust, String[] sauce, String [] tops) {
		this.Crust = crust;
		this.Sauce = sauce;
		this.Tops = tops;
	}

	

	protected String[] getCrust() {
		return Crust;
	}

	protected void setCrust(String[] crust) {
		Crust = crust;
	}

	protected String[] getSauce() {
		return Sauce;
	}

	protected void setSauce(String[] sauce) {
		Sauce = sauce;
	}

	protected String[] getTops() {
		return Tops;
	}

	protected void setTops(String[] tops) {
		Tops = tops;
	}

}
