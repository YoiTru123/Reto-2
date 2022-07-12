package Principal;
import Vistas.*;
import Modelo.*;


public class Main {

    public static void main(String[] args) {
        //Creamos la instancia de la vista Login.
        Login login = new Login();
        
        //El metodo hace visible la ventana.
        login.setVisible(true);
        
        //Se crea la instancia de la clase conexion.
        Conexion conexion = new Conexion();
        conexion.getCConection();
    }
    
}
