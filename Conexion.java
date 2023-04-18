package conexion.sql;

// Ejemplo solo para establecer la conexion basica

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//--------------------------
public class Conexion {
	public static void main(String[] args){
	try{
	    Class.forName("com.mysql.jdbc.Driver");
	    DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar2022","root","pabLo987$");
	    System.out.println("Conexion exitosa!!");
	    
	}catch (ClassNotFoundException e){
	    System.out.println("Error al cargar el controlador!!!!");
	    //e.printStackTrace();
	    
	}catch (SQLException e){
	    System.out.println("Error en la conexion!!!!");
	    //e.printStackTrace();
	}
 }
}
	