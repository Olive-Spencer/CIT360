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
        t.addCustomer();
        List<Customer> c = t.getCustomers();
        for (Customer i : c) {
            System.out.println(i);
        }
        t.removeCustomer();
        t.updateCustomer();
        List<Customer> d = t.getCustomers();
        for (Customer i : d) {
            System.out.println(i);
        }
        
        System.out.println(t.getCustomer(1));
    }
}
