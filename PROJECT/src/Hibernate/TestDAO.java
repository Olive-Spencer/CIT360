/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;


public class TestDAO {

    SessionFactory factory = null;
    Session session = null;

    private static TestDAO single_instance = null;

    private TestDAO()
    {
        factory = HibernateUtils.getSessionFactory();
    }

   
    public static TestDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new TestDAO();
        }

        return single_instance;
    }

    
    public List<Customer> getCustomers() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Customer";
            List<Customer> cs = (List<Customer>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    
    public Customer getCustomer(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Customer where id=" + Integer.toString(id);
            Customer c = (Customer)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return c;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
    
    //used to add a customer
public void addCustomer(){
    
    
    try{
    session = factory.openSession();
    session.getTransaction().begin();
    Customer cust = new Customer(4, "Emerson", "5551231234");
    session.saveOrUpdate(cust);
    session.getTransaction().commit();
    
    
    }    
    catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
}
    finally{ 
        session.close();}
    }

//used to remove the added customer
public void removeCustomer(){
    
    try{
    session = factory.openSession();
    session.getTransaction().begin();
    Customer cust = new Customer(4, "Emerson", "5551231234");
    session.delete(cust);
    session.getTransaction().commit();}
    
    catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
}
    finally{ 
        session.close();}
    }
//used to update the first customer
public void updateCustomer(){
    try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Customer where id=" + 1;
            Customer c = (Customer)session.createQuery(sql).getSingleResult();
            String name = c.getName();
            if("Recneps".equals(name)){
                c.setName("Spencer");
            }else{
                c.setName("Recneps");
            }
            session.update(c);
            session.getTransaction().commit();
            

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            
        } finally {
            session.close();
        }
}



}




