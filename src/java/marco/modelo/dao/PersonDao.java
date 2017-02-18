/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marco.modelo.dao;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;
import marco.modelo.pojos.Person;
/**
 *
 * @author alvar
 */
public class PersonDao {
   
    
    
    public void ingresarPersona (Person p)
    {
        SessionFactory sf=null;
        Session sesion= null;
        Transaction tx= null;
            try
            {
                sf =HibernateUtil.getSessionFactory();
                sesion =sf.openSession();
                tx=sesion.beginTransaction();
                sesion.save(p);
                tx.commit();
                sesion.close();
            }
    
    
            catch (Exception ex) 
            {
                tx.rollback();
                throw new RuntimeException("No se pudo grabar");
            }
    }
    
    
    
    public String consultaPersona(String dni_number)
    {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session sesion =sf.openSession();
    Person persona =(Person)sesion.get(Person.class, dni_number);
    
    
        if (persona!=null) 
        {
          return persona.getDniNumber()+persona.getFirstName()+persona.getSurname()+persona.getCity()+persona.getDateOfBirth();
        }
        else 
        {
          return "La persona con dni:"+dni_number+"no está registrada";
        }
    }
    
    
    
    public List<Person> verPersonas ()
    {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session sesion =sf.openSession();
    Query consulta =sesion.createQuery("*from Person");
    
    List<Person> listapersonas=consulta.list();
    sesion.close();
    return listapersonas;
    }





}


    