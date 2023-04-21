package conexion.sql;
/*
Procedimiento para conectar la DB y realizar la eliminacion de un registro 
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class Eliminar {
  public static void main(String[] args) {
    
    Connection conexion;
    String url="jdbc:mysql://localhost:3306/escuela";
    String usuario="root";
    String clave="pabLo987$";
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba el DNI del alumno a eliminar:...");
    int AlumDni  = sc.nextInt(); //asigna la entrada de usuario a la DNI
    
    String consulta="DELETE FROM alumnos WHERE AlumDni = '"+AlumDni+"'";
     // DELETE FROM Producto WHERE ClienDni = 7   
    try {
    	Class.forName("com.mysql.jdbc.Driver");     
        conexion=DriverManager.getConnection(url,usuario,clave);    
        Statement sentencia=conexion.createStatement();
        sentencia.execute(consulta);   
        System.out.println("El registro se elimino!!");
    } catch (Exception e) {  
      e.printStackTrace();
      System.out.println("Error en el borrado del registro!!");
    }
  }
}