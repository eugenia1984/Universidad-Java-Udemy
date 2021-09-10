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

---

## Manejo de Streams en Java y sus usos

--
