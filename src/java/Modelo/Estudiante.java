/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class Estudiante {
    private int matricula;
    private String nombre;
    private String Apellido;
    private int Edad;
    private String Sexo;
    private String Contrasena;
    private String Carrera;

    public Estudiante() {
    }

    public Estudiante(int matricula, String nombre, String Apellido, int Edad, String Sexo, String Contrasena, String Carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Contrasena = Contrasena;
        this.Carrera = Carrera;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    
    
}
