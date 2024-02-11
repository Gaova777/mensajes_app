/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

/**
 *
 * @author gaova
 */
public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String feha_mensaje;

    public Mensajes() {
    }

    public Mensajes(String mensaje, String autor_mensaje, String feha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.feha_mensaje = feha_mensaje;
    }
    
    

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFeha_mensaje() {
        return feha_mensaje;
    }

    public void setFeha_mensaje(String feha_mensaje) {
        this.feha_mensaje = feha_mensaje;
    }
    
    
}
