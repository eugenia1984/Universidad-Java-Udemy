
package datos;

import domain.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioJDBC {
    //Van todas mis sentencias SQL, las guardo en variables
    //si es una sentencia de una sola linea no necesito el ; al final
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    //mi variable pra el INSERT
    //mis ? van a ser parametros a sustituir
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES (?,?)";
    //setencia de tipo UPDATE
    private static final String SQL_UPDATE ="UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    //sentencia de tipo DELETE
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";    

    //Defino el metodo que me regresa una lista de objetos de tipo usuario
    public List<Usuario> select(){
        //declaro e inicializo todas mis variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            //me conecto a la base de datos Connection puede dar una exception
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            //ejecuto la query
            rs = stmt.executeQuery();
            //voy iterando siempre que tenga un siguiente (.next())
            while(rs.next()){
                //voy recuperando los datos de cada variable
                //en vez de poner el nombre de la columna de mi bd lo puedo 
                //poner con numeros, empezando del 1, si estan ordenados
                //lo tengo en mi sentencia SQL_SELECT
                int idUsuario = rs.getInt("id_usuario");
                String userName = rs.getString("usuario");
                String password = rs.getString("password");
                //uso el constructor con todos los atributos 
                //-> convierto info de mi BD a OBJETOS JAVA
                //es lo que va a hacer HIBERNATE
                usuario = new Usuario(idUsuario, userName, password);
                //agrego la persona creada a mi lista de personas
                usuarios.add(usuario);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                //cierro los objetos y como me puede dar exception la encierro en bloqeu try-catch
                //cierro en el orden inverso en que se fueron abriendo
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        //devuelvo mi lista de persona
        return usuarios;
    } 
    
    //Agrego el metodo para insertar un usuario
    public int insert(Usuario usuario){
        //declaro mis variables
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        //inicializo mi varaible conn, que me puede dar una exception -> try-catch
        try {
            conn = Conexion.getConnection();
            //inicializo stmtm
            stmt = conn.prepareStatement(SQL_INSERT);
            //sustituyo cada uno de los parametros, con sus indices
            // 1 -> username
            stmt.setString(1, usuario.getUserName());
            //2 -> password
            stmt.setString(2, usuario.getPassword());
            //hago el update en mi base de datos, asi se actualiza el estado en 
            //la bd, .executeUpdate() puede realizar sentencias de tipo: 
            //UPDATE, DELETE e INSERT
            System.out.println("Ejecutando query : "+ SQL_INSERT);
            registros = stmt.executeUpdate();
            System.out.println("Registros afectados : " + registros);
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        } finally {
            //cierro los objetos que abri
            try {
                //cierro los objetos y como me puede dar exception la encierro en bloqeu try-catch
                //cierro en el orden inverso en que se fueron abriendo
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    //Agrego el metodo para actualizar un usuario
    public int update(Usuario usuario){
        //declaro mis variables
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        //inicializo mi varaible conn, que me puede dar una exception -> try-catch
        try {
            conn = Conexion.getConnection();
            //inicializo stmtm
            stmt = conn.prepareStatement(SQL_UPDATE);
            //sustituyo cada uno de los parametros, con sus indices
            // 1 -> UserName
            stmt.setString(1, usuario.getUserName());
            //2 -> password
            stmt.setString(2, usuario.getPassword());
            // 3 -> idUsuario
            stmt.setInt(3, usuario.getIdUsuario());

            //hago el update en mi base de datos, asi se actualiza el estado en 
            //la bd, .executeUpdate() puede realizar sentencias de tipo: 
            //UPDATE, DELETE e INSERT
            registros = stmt.executeUpdate();
            System.out.println("Registros actualizados : " + registros);
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        } finally {
            //cierro los objetos que abri
            try {
                //cierro los objetos y como me puede dar exception la encierro en bloqeu try-catch
                //cierro en el orden inverso en que se fueron abriendo
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    //Agrego el metodo para eliminar un usuario
    public int delete(Usuario usuario){
        //declaro mis variables
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        //inicializo mi varaible conn, que me puede dar una exception -> try-catch
        try {
            conn = Conexion.getConnection();
            //inicializo stmtm
            stmt = conn.prepareStatement(SQL_DELETE);
            //1 ->  id_persona
            stmt.setInt(1, usuario.getIdUsuario());
            //hago el update en mi base de datos, asi se actualiza el estado en 
            //la bd, .executeUpdate() puede realizar sentencias de tipo: 
            //UPDATE, DELETE e INSERT
            registros = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + registros);
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        } finally {
            //cierro los objetos que abri
            try {
                //cierro los objetos y como me puede dar exception la encierro en bloqeu try-catch
                //cierro en el orden inverso en que se fueron abriendo
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
