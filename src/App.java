import backend.User.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.println("ingrese el nombre del usuario");
        String user = s.nextLine();

        System.out.println("ingrese la contrasena");
        String pass = s.nextLine();

        System.out.println("el usuario existe: "+(Login.consultarUsuario(user, pass)));
        System.out.println("el usuario es admin?: "+(Login.esAdminstrador(user, pass)));

    }
}
