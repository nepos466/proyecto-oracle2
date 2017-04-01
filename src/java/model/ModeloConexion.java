/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
// Importamos el paquete java Sql para usar Oracle y su conector.
import  java.sql.*;

/**
 *
 * @author T-102
 */
public class ModeloConexion {
    // Metodo publico 
    // como nos conectamos a oracle abriremos el SQL developper
    
    public static Connection conectarse(String login, String password) throws Exception{
    
        //En los examenes de desarrolladores de base de datos
        //Accediendo al Servicio y tiene un URL se establece el jdbc java data base conection: y el el nombre del servicio
        //: thin ligero delgado, indicar si la arquitectura es cliente ligero o pesado es decir esta aplicación sera 
        // de tipo web, despues viene donde se ejecuta servidor 
        //: puerto listen puerto que escucha papuuuu
        // el orcl es la gestor de la base de datos, el id de la base de datos global
        
        // el administrador del Driver.
            String url="jdbc:oracle:think@localhost:1521/orcl";
            
            // se encierra en comillas dobles porque es un String.
            Class.forName("oracle.jdbc.OracleDriver");
          Connection con=  DriverManager.getConnection(url, login, password);
            return con;
    }
}
