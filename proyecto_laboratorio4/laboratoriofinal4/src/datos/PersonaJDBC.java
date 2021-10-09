
package datos;

import domain.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PersonaJDBC {
    //Van todas mis sentencias SQL, las guardo en variables
    //si es una sentencia de una sola linea no necesito el ; al final
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    //mi variable pra el INSERT
    //mis ? van a ser parametros a sustituir
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES (?,?,?,?)";
    //setencia de tipo UPDATE
    private static final String SQL_UPDATE ="UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    //sentencia de tipo DELETE
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";    
//Defino el metodo que me regresa una lista de objetos de tipo Persona
    public List<Persona> seleccionar(){
        //declaro e inicializo todas mis variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        try {
            //me conecto a la base de datos Connection puede dar una exception
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            //ejecuto la query
            rs = stmt.executeQuery();
            //voy iterando siempre que tenga un sigueinte (.netx())
            while(rs.next()){
                //voy recuperando los datos de cada variable
                //en vez de poner el nombre de la columna de mi bd lo puedo 
                //poner con numeros, empezando del 1, si estan ordenados
                //lo tengo en mi sentencia SQL_SELECT
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                //uso el constructor con todos los atributos 
                //-> convierto info de mi BD a OBJETOS JAVA
                //es lo que va a hacer HIBERNATE
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                //agrego la persona creada a mi lista de personas
                personas.add(persona);
                
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
        return personas;
    } 
    
    //Agrego el metodo para insertar una persona
    public int insertar(Persona persona){
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
            // 1 -> nombre
            stmt.setString(1, persona.getNombre());
            //2 -> apellido
            stmt.setString(2, persona.getApellido());
            // 3 -> email
            stmt.setString(3, persona.getEmail());
            //4 -> telefono
            stmt.setString(4, persona.getTelefono());
            //hago el update en mi base de datos, asi se actualiza el estado en 
            //la bd, .executeUpdate() puede realizar sentencias de tipo: 
            //UPDATE, DELETE e INSERT
            registros = stmt.executeUpdate();
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
    
    //Agrego el metodo para actualizar una persona
    public int actualizar(Persona persona){
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
            // 1 -> nombre
            stmt.setString(1, persona.getNombre());
            //2 -> apellido
            stmt.setString(2, persona.getApellido());
            // 3 -> email
            stmt.setString(3, persona.getEmail());
            //4 -> telefono
            stmt.setString(4, persona.getTelefono());
            //5 ->  id_persona
            stmt.setInt(5, persona.getIdPersona());
            //hago el update en mi base de datos, asi se actualiza el estado en 
            //la bd, .executeUpdate() puede realizar sentencias de tipo: 
            //UPDATE, DELETE e INSERT
            registros = stmt.executeUpdate();
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
    
    //Agrego el metodo para eliminar una persona
    public int eliminar(Persona persona){
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
            stmt.setInt(1, persona.getIdPersona());
            //hago el update en mi base de datos, asi se actualiza el estado en 
            //la bd, .executeUpdate() puede realizar sentencias de tipo: 
            //UPDATE, DELETE e INSERT
            registros = stmt.executeUpdate();
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
