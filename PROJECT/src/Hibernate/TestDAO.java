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

    
    public List<Family> getFamilyMembers() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Family";
            List<Family> fm = (List<Family>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return fm;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    
    public Family getInd(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Family where id=" + Integer.toString(id);
            Family f = (Family)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return f;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
    
public void addFamily(){
    
    
    try{
    session = factory.openSession();
    session.getTransaction().begin();
    Family fam = new Family(4, "Dale", "Grandpa", "5555555555");
    session.saveOrUpdate(fam);
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


public void removeFamily(){
    
    try{
    session = factory.openSession();
    session.getTransaction().begin();
    Family fam = new Family(4, "Dale", "Grandpa", "5555555555");
    session.delete(fam);
    session.getTransaction().commit();}
    
    catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
}
    finally{ 
        session.close();}
    }

public void updateFamily(){
    try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Hibernate.Family where id=" + 2;
            Family f = (Family)session.createQuery(sql).getSingleResult();
            String name = f.getName();
            if("Recneps".equals(name)){
                f.setName("Spencer");
            }else{
                f.setName("Recneps");
            }
            session.update(f);
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




