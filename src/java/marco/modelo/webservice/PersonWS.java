/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marco.modelo.webservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import marco.modelo.dao.PersonDao;

import marco.modelo.pojos.Person;

/**
 *
 * @author alvar
 */
@WebService(serviceName = "PersonWS")
public class PersonWS {

    
    @WebMethod(operationName = "ListarPersonas")
    public List<Person> ListarPersonas() {
        
        PersonDao persona = new PersonDao();
        List<Person> listapersonas = persona.verPersonas();
        return listapersonas; 
        
    }

 }
