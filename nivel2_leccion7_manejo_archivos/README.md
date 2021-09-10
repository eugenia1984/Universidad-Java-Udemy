# Módulo 7 - Manejo de Archivos en Java

---

## Manejo y uso de archivos en Java

Creo un proyecto llamado **ManejoArchivos** y la Clase **ManejoArchivos** en el mismo paquete.

En esta clase vamos a manejar varios métodos : crearArchivo, BorrarArchivo, etc.

Dependiendo de la operación que vamos a realizar es el método que vamos a mandar a llamar.


```JAVA
package manejoarchivos;

import java.io.File;  //importo File del paquete java.io I de INPPUT o de OUTPUT
import java.io.FileNotFoundException;
import java.io.PrintWriter; //importo PrintWriter

public class ManejoArchivos {
    //creo metodos estaticos para no tener que crear objetos de la clase para implementar el metodo
        public static void crearArchivo(String nombreArchivo){
            //creo nuevo objeto para que se cree el archivo en el disco duro 
            //Utilizo la clase File
            File archivo = new File(nombreArchivo); 
            try {
                //PrintWriter puede dar Excepcion
                //-> Agrego bloque TRY - CATCH
                //-> Reporto la excepcion en la firma del metodo, es CheckException hay que procesarla
                PrintWriter salida = new PrintWriter(archivo);
                //debemos cerrar el metodo, es acá que se crea el archivo en el disco duro
                salida.close();
                //Mando un mensaje para mostrar que se creo bien el archivo
                System.out.println("Se ha creado el archivo");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            }
        }
}
```


Voy a crear la clase **TestManejoArchivos** para poder probar los métodos de **ManejoArchivos**

```JAVA
package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

public class TestManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
        
    }
    
}
```

En NetBeans si voy a **Window -> Files** voy a poder los files generados y veo el **prueba.txt**

Al definir el nombre del archivo puedo ingresar el **path** de donde lo quieor guardar, por ejemplo:

Si estamos en Windows:

```JAVA
String nombreArchivo = "C:\\carpeta\\prueba.txt";
```

\ es el caracter de escape 

Si estamos en Linux o en Mac:

```JAVA
String nombreArchivo = "/carpeta/prueba.txt";
```

Hay que estar seguros de tener permisos para escribir en dicha carpeta.

## ¿ Cómo le agrego información al archivo ?


en mi clase **ManejoArchivo** :

```JAVA
public static void escribirArchivo(String nombreArchivo, String contenido){
            File archivo = new File(nombreArchivo); 
            try {
                //PrintWriter puede dar Excepcion
                //-> Agrego bloque TRY - CATCH
                //-> Reporto la excepcion en la firma del metodo, es CheckException hay que procesarla
                PrintWriter salida = new PrintWriter(archivo);
                //Escribo la información en mi archivo
                salida.println(contenido);
                //debemos cerrar el metodo, es acá que se crea el archivo en el disco duro
                salida.close();
                //Mando un mensaje para mostrar que se creo bien el archivo
                System.out.println("Se ha escrito al archivo");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            }
        }
```

Y en mi clase **testManejoArchivos** :

```JAVA
package test;

import static manejoarchivos.ManejoArchivos.crearArchivo; //como tengo más de uno puedo usar *
import static manejoarchivos.ManejoArchivos.escribirArchivo;

public class TestManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Hola desde Java");
        
    }
    
}
```

Si llamo nuevamente al metodo, tendría el mismo archivo, solo que SOBREESCRITO, no voy a crear un nuevo archivo.

```JAVA
package test;

import static manejoarchivos.ManejoArchivos.crearArchivo; //como tengo más de uno puedo usar *
import static manejoarchivos.ManejoArchivos.escribirArchivo;

public class TestManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Hola desde Java");
        escribirArchivo(nombreArchivo, "Adios");
        
    }
    
}
```

Para ello en la clase **testManejoArchivos** creo le metodo **anexarArchivo**

```JAVA
public static void anexarArchivo(String nombreArchivo, String contenido ){
            File archivo = new File(nombreArchivo); 
            try {
                //Escribo la información en mi archivo
                //PrintWriter puede dar Excepcion
                // Voy a crear un nuevo FileWriter y con TRUE para que se escriba para que apendee
                //Puedo tener IO Exception
                PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                //Escribo la información en mi archivo
                salida.println(contenido);
                //debemos cerrar el metodo, es acá que se crea el archivo en el disco duro
                //Mando un mensaje para mostrar que se creo bien el archivo
                System.out.println("Se ha escrito al archivo");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
```

## BUFFEREDREADER 

Es para leer del archivo, almacena caracter a caracter

Voy a envolvemos varios objetos archivo de tipo file -> FileReader -> BufferReader

FileReader no leer lineas completas pero BufferReader si crear estos objetos puede crear excepciones, porque lo que necesito usar TRY-CATCH

```JAVA
public static void leerArchivo(String nombreArchivo){
            File archivo = new File(nombreArchivo);
            try {
            //BUFFERREADER para leer del archivo, almacena caracter a caracter
            //envolvemos varios objetos archivo de tipo file -> FileReader -> BufferReader
            //FileReader no leer lineas completas pero BufferReader si
            //crear estos objetos puede crear excepciones
                BufferedReader entrada = new BufferedReader(new FileReader(archivo));
                String lectura = entrada.readLine(); //puede darme una IOException
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
 ``` 
 
 Pero, de este modo solo leo la primer linea, para leer todas las lineas uso un ciclo while
 
 

---

## Manejo de Streams en Java y sus usos

---
