package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Se crea la instancia.
    Connection connection;
    //Atributos.
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1java";
    String usuario = "root";
    String contrasena = "";

    //Adicionar constructor.
    public Conexion() {

        //Generar la conexion con la base de datos.
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
            if (connection != null) {
                System.out.println("Conexion exitosa.");
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Conexion erronea.");
        }
    }
        
    //Crear funcion que retorna.
    public Connection getCConection(){
        return connection;
    }
}
