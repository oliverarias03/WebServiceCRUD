/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author User
 */
public interface CRUD {
    List listar();
    Estudiante listarId(int matricula);
    String agregar(int matricula, String nombre, String Apellido, int Edad, String Sexo, String Contrasena, String Carrera);
    String editar(int matricula, String nombre, String Apellido, int Edad, String Sexo, String Contrasena, String Carrera);
    Estudiante eliminar(int matricula);
    
    
}
