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

public interface Handler{
	public Object handleIt(HashMap<String, Object> data);
}
