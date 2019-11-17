/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.*;

public class RunHibernateExample {

    public static void main(String[] args) {

        TestDAO t = TestDAO.getInstance();
        t.addFamily();
        List<Family> f = t.getFamilyMembers();
        for (Family i : f) {
            System.out.println(i);
        }
        t.removeFamily();
        t.updateFamily();
        List<Family> d = t.getFamilyMembers();
        for (Family i : d) {
            System.out.println(i);
        }
        
        System.out.println(t.getInd(1));
    }
}
