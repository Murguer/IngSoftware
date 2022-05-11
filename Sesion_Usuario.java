import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Sesion_Usuario {
	String Nombre;
	String Usuario;
	String Contrasena;
	String Privilegios;
	
    public Sesion_Usuario(String nom, String Usu, String Contra,String priv) {
    	Nombre=nom;
    	Usuario=Usu;
    	Contrasena=Contra;
    	Privilegios=priv;
    }
     public String toString(){
    	return "Nombre="+Nombre+"\nUsuario="+Usuario+"\nContrasena="+Contrasena+"\nPrivilegios="+Privilegios;
    	}
    
}
