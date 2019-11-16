/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import javax.persistence.*;


@Entity
@Table(name = "family")
public class Family {

   
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "position")
    private String position;

    
    @Column(name = "phone")
    private String phone;
    
    public Family() {
    }
    

    public Family (int id, String name, String pos, String number){
    super();
    this.id = id;
    this.name = name;
    this.position = pos;
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
    
    public String getPos() {
        return position;
    }

    public void setPos(String position) {
        this.position = position;
    }
    

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return Integer.toString(id) + " " + name + " " + position + " " + phone;
    }
}
