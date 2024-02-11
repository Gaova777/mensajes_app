/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author gaova
 */
public class Inicio {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int opcion = 0;
        
        do{
            System.err.println("---------------------");
            System.err.println(" Aplicacion de Mensajes");
            System.err.println(" 1. crear mensaje");
            System.err.println(" 2. listar mensajes");          
            System.err.println(" 3. editar mensajes");
            System.err.println(" 4. eliminar mensajes");
            System.err.println(" 5. eliminar");
            //guardado de opcion
            
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                case 5:
                    break;
            }
        }while(opcion!=5);
    }
    
}
