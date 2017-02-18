<%-- 
    Document   : index
    Created on : Feb 18, 2017, 4:46:33 PM
    Author     : alvar
--%>

<%@page import="marco.modelo.pojos.Person"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<%@page import="marco.modelo.dao.PersonDao"%>
<%@page import="marco.modelo.dao.HibernateUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hibernate</title>
    </head>
    <body>
        <h1>Mapeo Hibernate</h1>
        
        
            <tr>
                <td>Número de DNI </td
                <td>Apellidos</td>
                <td>Nombres</td>
                <td>Email</td>
                <td>Genero</td>
                <td>Estatus</td>
                <td>Create</td>
            </tr>
           
            
            <%
                
                PersonDao persona = new PersonDao();
                List<Person> prueba = persona.verPersonas();
                        
               %>
    </body>
</html>
