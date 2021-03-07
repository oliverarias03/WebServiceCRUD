/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.Estudiante;
import Modelo.EstudianteDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "Services")
public class Services {
    EstudianteDAO es = new EstudianteDAO();
    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "listar")
    public List<Estudiante> listar() {
        List datos = es.listar();
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "matricula") int matricula, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "edad") int edad, @WebParam(name = "sexo") String sexo, @WebParam(name = "contrasena") String contrasena, @WebParam(name = "carrera") String carrera) {
       String datos = es.agregar(matricula, nombre, apellido, edad, sexo, contrasena, carrera);
       return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarId")
    public Estudiante listarId(@WebParam(name = "matricula") int matricula) {
        Estudiante est = es.listarId(matricula);
        //TODO write your implementation code here:
        return est;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public String editar(@WebParam(name = "matricula") int matricula, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "edad") int edad, @WebParam(name = "sexo") String sexo, @WebParam(name = "contrasena") String contrasena, @WebParam(name = "carrera") String carrera) {
       String datos = es.editar(matricula, nombre, apellido, edad, sexo, contrasena, carrera);
       return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public Estudiante eliminar(@WebParam(name = "matricula") int matricula) {
        Estudiante est = es.eliminar(matricula);
        //TODO write your implementation code here:
        return est;
    }
}
