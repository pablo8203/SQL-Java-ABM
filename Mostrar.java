package conexion.sql;

/*
Procedimiento para conectar la DB y realizar la lectura de datos en la tabla sin mostrar datos
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Mostrar {
  public static void main(String[] args) {
    
    Connection conexion;
    String url="jdbc:mysql://localhost:3306/qatar2022";
    String usuario="root";
    String clave="pabLo987$";
    String consulta=" select * from empleados "; // (EmpDni,EmpNom,EmpApe,EmpNac,EmpDep) values ('99','Luis','Java','Chile','1')";
        
    try {
    	Class.forName("com.mysql.jdbc.Driver");     
        conexion=DriverManager.getConnection(url,usuario,clave);    
        Statement sentencia=conexion.createStatement();
        sentencia.execute(consulta);   
        System.out.println("Consulta SQL exitosa!!");
    } catch (Exception e) {  
      e.printStackTrace();
      System.out.println("Error en la conexion de datos!!");
    }
  }
}