import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Menu {
        

  public static void main(String[] args)throws IOException {
    	Sesion_Usuario sesion[]=new Sesion_Usuario[20];
    	String Usuario,Contrasena,a;
    	int i,IniciarSesion=0,Guardari;
     	Usuario=JOptionPane.showInputDialog( "Usuario:" );
		Contrasena=JOptionPane.showInputDialog( "Contrasena" );
		
		File doc= new File("Empresa.txt");
        Scanner obj = new Scanner(doc);
        while (obj.hasNextLine()){
        	System.out.println(obj.nextLine());
        	}

		for(i=0;i<20;i++){
			if(Contrasena==sesion[i].Contrasena&&Usuario==sesion[i].Usuario){
				IniciarSesion=1;
				Guardari=i;
				}else{
					IniciarSesion=2;
					}
		}
		if (IniciarSesion==1){
			
			}
	}
	public static String [] cargarArreglo(String archivo) throws IOException{
		// primero se lee el archivo para contar el número de líneas
		FileReader a = new FileReader(archivo);
		BufferedReader dentro= new BufferedReader(a);
		int n = 0;
		String linea= dentro.readLine();
		while (linea!= null) {
		linea= dentro.readLine();
		n++;
		}
		a.close();
		// Creación del arreglo
		String[] v = new String[n];
		// Ciclo para leer las cadenas del archivo en el arreglo
		a = new FileReader(archivo);
		dentro= new BufferedReader(a);
		int i= 0;
		linea= dentro.readLine();
		while ((linea!= null) && (i<n)) {
		v [i] = linea;
		linea= dentro.readLine();
		i++;
		}
		a.close();
		return v;
	}
}
