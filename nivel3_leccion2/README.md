# Nivel 3 - Leccion 2

## JDBC - Java DataBase Connectivity


Vamos a crear un uevo poryecto pero utilizando **Maven** que nos permite administrar las librerías.

-> File -> New Proyect -> Java with Maven -> Java Application 

Además del *Proyect Name* (IntroduccionJDBC) me va a pedir el *Group Id* (mx.com.gm.jdbc) y la *Version* (1.0) y el *nombre del paquete* es opcional (lo quitamos).

Y al ver el proyecto en **Dependencies** voy a ver muchas librerías.

->Click derecho en el nombre del proyecto -> Clean and Build

->**Proyect Files** -> **pom.xml** -> Veo las dependencias

Debajo de la etiqueta de **properties** :

```
<depedencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.19</version>
        </dependency>
    </depedencies>
 ```   

->Click derecho en el nombre del proyecto -> Clean and Build

---

## Conectando a la Base de Datos (BD)

```JAVA
String url ="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "root";  //el usuario de mi conexion a MySQL
        String password = "rootroot"; //la clave de mi conexion a MySQL
        //

        try {
            //necesario en las aplicaciones webs el Class.forName(...)
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, user, password);
            //objeto de tipo statement para hacer sentencias en al base de datos
            Statement instruccion = conexion.createStatement();
            //en el String sql guardo mi query SQL
            String sql ="SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            //ejecuto la instruccion (query SQL)
            ResultSet resultado = instruccion.executeQuery(sql);
            //como puedo teneer mas de un registro itero el resultado con un ciclo while
            while(resultado.next()){ //mientras tenga un proximo
                //getInt(indice_de_la_columna)
                //id_persona (1), nombre(2), apellido(3), email(4), telefono(5)
                //"Id persona :" + resultado.getInt(1)
                //pero si luego cambian de orden, si las nombramos por el nombre no tneemos problema
                System.out.print("Id persona :" + resultado.getInt("id_persona"));
                System.out.print(" Nombre: "+ resultado.getString("nombre"));
                System.out.print(" Apellido: "+ resultado.getString("apellido"));
                System.out.print(" Email: "+ resultado.getString("email"));
                System.out.print(" Telefono: "+ resultado.getString("telefono"));
                System.out.println("");
            }
            //cierro los objetos
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
```

---


## Mejores prácticas

La conexion a la base de Datos se hace mediante el DAO mi capa de **datos**, por eso creo un paquete **dato** y creo la clase **Conexion** (no la nombro Conection en inglés, porque Java ya tiene una clase Conection).


**CLASE CONEXION**

```JAVA
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
```

Creamos la clase **Persona** en el paquete **domain** que va a representar cada una de las columnas de la base de datos.

Va a ser mi **CLASE ENTIDAD**

```JAVA
package domain;

public class Persona {
    //atributos que coinciden con las columnas de mi base de datos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    //constructores
    public Persona() {
    }
    //constructor con el parámetro idPersona (sobrecarga de constructores)
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }
    //constructor para insertar nuevo registro (sobrecarga de constructores)
    //sin PK porque es autoincremental
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    //constructor con todos los atributos para modificar (sobrecarga de constructores)
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    //getters y setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //toString

    @Override
    public String toString() {
        return "Persona{" + "idPersona = " + idPersona + ", nombre = " + nombre 
                + ", apellido = " + apellido + ", email = " + email 
                + ", telefono = " + telefono + '}';
    }   
}
```

**CLASE DAO** ( **Data Access Object** )

Va a estar sobre al capa de datos, es la clase **PersonaDAO**.

Voy a tener una clase DAO para cada clase Entidad que tenga.

Van a realizar las acines de INSERT, UPDATE o DELETE sobre la entidad Persona. 


```JAVA

package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAO {
    //Van todas mis sentencias SQL, las guardo en variables
    //si es una sentencia de una sola linea no necesito el ; al final
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    
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
}
```

---

## Pasos para conectarnos a una base de datos relacional

---

## Código JDBC para conectarnos a la base de datos

---
