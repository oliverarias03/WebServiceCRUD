/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EstudianteDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    
    int res;
    String msg;

    @Override
    public List listar() {
        List<Estudiante> datos = new ArrayList<>();
        String sql = "select * from estudiante";
        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Estudiante e = new Estudiante();
                e.setMatricula(rs.getInt("Matricula"));
                e.setNombre(rs.getString("Nombre"));
                e.setApellido(rs.getString("Apellido"));
                e.setEdad(rs.getInt("Edad"));
                e.setSexo(rs.getString("Sexo"));
                e.setContrasena(rs.getString("Contraseña"));
                e.setCarrera(rs.getString("Carrera"));
                datos.add(e);
            }
        }catch(SQLException e){
            System.out.println("error " + e);
        }
        return datos;
    }

    @Override
    public Estudiante listarId(int matricula) {
        String sql = "select * from estudiante where matricula ="+matricula;
        Estudiante e = new Estudiante();
        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                e.setMatricula(rs.getInt("Matricula"));
                e.setNombre(rs.getString("Nombre"));
                e.setApellido(rs.getString("Apellido"));
                e.setEdad(rs.getInt("Edad"));
                e.setSexo(rs.getString("Sexo"));
                e.setContrasena(rs.getString("Contraseña"));
                e.setCarrera(rs.getString("Carrera"));
            }
        }catch(SQLException ex){
            
        }
        return e;
    }

    @Override
    public String agregar(int matricula, String nombre, String Apellido, int Edad, String Sexo, String Contrasena, String Carrera) {
        String sql = "insert into estudiante(matricula,nombre,apellido,edad,sexo,contraseña,carrera) values (?,?,?,?,?,?,?)";
        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, matricula);
            ps.setString(2, nombre);
            ps.setString(3, Apellido);
            ps.setInt(4, Edad);
            ps.setString(5, Sexo);
            ps.setString(6, Contrasena);
            ps.setString(7, Carrera);
            res = ps.executeUpdate();
            if(res == 1){
                msg = "Estudiante Agregado";
            }else{
                msg = "Error al Agregar";
            }
        }catch(Exception e){
            
        }
        return msg;
    }

    @Override
    public String editar(int matricula, String nombre, String Apellido, int Edad, String Sexo, String Contrasena, String Carrera) {
        String sql = "update estudiante set nombre =?,apellido=?,edad=?,sexo=?,contraseña=?,carrera=? where matricula="+matricula;
        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
//            ps.setInt(1, matricula);
            ps.setString(1, nombre);
            ps.setString(2, Apellido);
            ps.setInt(3, Edad);
            ps.setString(4, Sexo);
            ps.setString(5, Contrasena);
            ps.setString(6, Carrera);
            res = ps.executeUpdate();
            if(res == 1){
                msg = "Estudiante Actualizado";
            }else{
                msg = "Error al Actualizar";
            }
        }catch(Exception e){
            
        }
        return msg;
    }

    @Override
    public Estudiante eliminar(int matricula) {
        String sql = "delete from estudiante where matricula ="+matricula;
        Estudiante e = new Estudiante();
        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(SQLException ex){
            
        }
        return e;
    }
    
}
