import java.io.*;
public class Guardartxt {

    public Guardartxt(Sesion_Usuario v,String archivo)throws IOException {
    	FileWriter a=new FileWriter(archivo,false);
		PrintWriter salida=new PrintWriter(a);
		salida.println(v+"\n");
		salida.close();
		a.close();
    }
    
    
}