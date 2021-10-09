# Proyecto Laboratorio de nivel 3

## Objetivo:

Crear unn pruyecto con las sigueintes características:

-Crear una tabla llamada **usuario** en MySQL en el esquema test:

-id_usuario (int) (PK)

-usuario (VARCHAR)

-password (VARCHAR)

1-Crear las clases similares al ejercicio JDBC para el manejo de las operaciones SELECT, INSERT, DELETE pero ahora para la tabla de usuario.

---

**1.** En MySQL Workbench en mi SCHEMA **test** que ya tenia del ejercicio anterior:

```SQL
CREATE TABLE `test`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`id_usuario`));
```

**2.** Selecciono la table:

```SQL
SELECT * FROM test.usuario
```

**3.** Agrego usuario:

```SQL
INSERT INTO `test`.`usuario` (`usuario`, `password`) VALUES ('ana.costa', '123456');
INSERT INTO `test`.`usuario` (`usuario`, `password`) VALUES ('maria.lopez', 'abcdef');
```

**4.** En NetBeans creo el nuevo proyecto: **laboratoriofinal4**  y los paquetes *datos*, *domian* con su clase *usario*, *test*

**5.** Creo la clase *Usario* en el paquete *domain* con sus atributos:

```JAVA
private int idUsuario;
private String userName;
private String password;
```

Los constructores vacíos y con parámetros. Los Getters y setters y el toString.

En el mismo paquete *domain* copio la clase **Persona** del ejercicio anterior.

**6.** Reutilizo la clase **Conexion** y **PersonaJDBC** del paquete *datos* del ejercicio anterior. Y creo la clase **UsuarioJDBC** en el mismo paquete.

A la clase **UsuarioJDBC** le creo las constantes con las consutlas SQL:

```JAVa
private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";

private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES (?,?)";

private static final String SQL_UPDATE ="UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";

private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";  
```

Y los métodos para **select**:

```JAVA
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
```

**insert**:
```JAVA
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
```

**update**:
```JAVA
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
```


**delete**:
```JAVA
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
```


**7.** Agrego la clase **manejoUsuario** en el paquete de *test*.

```JAVA
package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;


public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();
        
        //Ejecutando el listado de usarios
        //Lo asigno a una lista de tipo Usuario
        List<Usuario> usuarios = usuarioJdbc.select();
        //recorro la colecion
        for(Usuario usuario : usuarios){
            //mando a imprimir el objeto
            System.out.println("Usuario: " + usuario);
        }
        
        //Insertamos un nuevo usuario
        Usuario usuarioNuevo = new Usuario("carlos", "123");
        usuarioJdbc.insert(usuarioNuevo);
        
        //modificamos un usuario
        Usuario usuarioModificado = new Usuario (2, "carlos", "123456");
        usuarioJdbc.update(usuarioModificado);
        
        //eliminamos un usuario
        usuarioJdbc.delete(new Usuario(1));
    }
            
}
```


---
