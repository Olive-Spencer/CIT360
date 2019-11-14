/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import javax.persistence.*;


@Entity
@Table(name = "customer")
public class Customer {

   
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    
    @Column(name = "phone")
    private String phone;
    
    public Customer() {
    }
    

    public Customer (int id, String name, String number){
    super();
    this.id = id;
    this.name = name;
    this.phone = number; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return Integer.toString(id) + " " + name + " "  + phone;
    }
}
