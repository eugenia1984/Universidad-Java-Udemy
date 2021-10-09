
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {
    //Variable para conexion a MySQL
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    //variable para el usuario
    private static final String JDBC_USER= "root";
    //variable para el password
    private static final String JDBC_PASSWORD ="rootroot";
    
    //METODO PARA CONECTARNOS A LA BASE DE DATOS
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    //METODO PARA CERRAR LA CONEXION DE OBJETOS DE TIPO RESULTSET
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    //METODO PARA CERRAR LA CONEXION DE OBJETOS DE TIPO STATEMENT
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    //METODO PARA CERRAR LA CONEXION DE OBJETOS DE TIPO PREPAREDSTATEMENT
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    //METODO PARA CERRAR LA CONEXION DE OBJETOS DE TIPO  CONNECTION
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
