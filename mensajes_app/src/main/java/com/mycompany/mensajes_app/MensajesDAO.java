/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gaova
 */
public class MensajesDAO {
    public static void crearMensajeDB(Mensajes mensaje){
        Conexion db_conexion = new Conexion();
        
        try(Connection conexion = db_conexion.get_connection()){
            PreparedStatement ps = null;
            
            try{
            String sql = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
            ps= conexion.prepareStatement(sql);
            ps.setString(1, mensaje.getMensaje());
            ps.setString(2, mensaje.getAutor_mensaje());
            ps.executeUpdate();
                System.out.println("mensaje creado");
            }catch(SQLException ex){
                System.out.println(ex);
               }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public static void leerMensajesDB(){
        Conexion db_connect = new Conexion();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try(Connection conexion = db_connect.get_connection()){
        String sql = "SELECT * FROM mensajes";
        ps= conexion.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while(rs.next()){
            System.out.println("ID: "+rs.getInt("id_mensajes"));
            System.out.println("Mensaje: "+rs.getString("mensaje"));
            System.out.println("Autor: "+rs.getString("autor_mensaje"));
            System.out.println("ID: "+rs.getString("fecha_mensaje"));
            System.out.println("");
            
        }
        }catch(SQLException e){
            System.out.println("no se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }
    public static void borrarMensajeDB(int id){
    
    }
    public static void actualizarMensajeDB(Mensajes mensaje){
    
    }
}
