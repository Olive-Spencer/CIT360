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
    String Mom;
	String Dad;
	String [] Sons;
	String [] Daughters;
	String [] Favorites;

	public Model(String mom, String dad, String[] sons, String[] daughters, String []favorites) {
		this.Mom= mom;
		this.Dad = dad;
		this.Sons = sons;
		this.Daughters = daughters;
		this.Favorites = favorites;
	}

	protected String getMom() {
		return Mom;
	}

	protected void setMom(String mom) {
		Mom = mom;
	}

	protected String getDad() {
		return Dad;
	}

	protected void setDad(String dad) {
		Dad = dad;
	}

	protected String[] getSons() {
		return Sons;
	}

	protected void setSons(String[] sons) {
		Sons = sons;
	}

	protected String[] getDaughters() {
		return Daughters;
	}

	protected void setDaughters(String[] daughters) {
		Daughters = daughters;
	}

	protected String[] getFavorites() {
		return Favorites;
	}

	protected void setFavorites(String[] favorites) {
		Favorites = favorites;
	}

}
