package backend.User;

import java.net.ConnectException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;


import database.ConexionMySQL;

public class Login{
    public static boolean consultarUsuario(String usuario, String password){
        boolean resultado = false;
        ConexionMySQL conexion = new ConexionMySQL();
        Connection conn = conexion.conectarMySQL();

        PreparedStatement consulta = null;
        ResultSet respuesta = null;

        try{
            consulta = conn.prepareStatement("select user, password from usuario where user ='"+usuario+"' and password ='"+password+"';");
                                            //select user, password from usuario where user = 'brayan' and password = 'password'; 
            respuesta = consulta.executeQuery();
            resultado =  respuesta.next();
            conn.close();
        }catch (Exception e){
            System.out.println(e);
        }
        
        return resultado;
    }

    public static boolean esAdminstrador(String usuario, String password){
        boolean resultado = false;

        ConexionMySQL conexion = new ConexionMySQL();
        Connection conn = conexion.conectarMySQL();

        PreparedStatement consulta = null;
        ResultSet respuesta = null;

        try{
            consulta = conn.prepareStatement("select admin from usuario where user ='"+usuario+"' and password ='"+password+"';");
            respuesta = consulta.executeQuery();

            // user(varchar)     password(varchar)    admin(1,0)

            respuesta.next();

            resultado = ( respuesta.getString("admin").equals("1") ) ? true : false;
            conn.close();
        }catch (Exception e){
            System.out.println(e);
        }

        return resultado;
    }
}