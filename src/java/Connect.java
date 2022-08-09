
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    static String Bd_url = "jdbc:mysql://localhost:3306/pruebajdbc1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String user = "root";
    static String passw = "password";
    public static void main(String[] args){
        conexion();
    }
    
    public static void conexion(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(Bd_url,  user,  passw);
            if(conn != null ){
                System.out.println("Conexion realizada con exito");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error, " + e.getMessage());
        }
    }
}
