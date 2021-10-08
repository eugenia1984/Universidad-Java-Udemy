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

## Pasos para conectarnos a una base de datos relacional

---

## Código JDBC para conectarnos a la base de datos

---
