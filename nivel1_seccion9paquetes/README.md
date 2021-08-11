# Paquetes

Se nombran al reves que la url, si por ejemplo tengo globalmentoring.com.mx, voy a nombrar al paquete : 

**mx.com.globalmentoring**

Y voy a tneer la carpeta **mx** con la subcarpeta **com** con la subcarpeta **globalmentoring** 

No es un dominio con el cual se va a conectar a internet, sino un nombre para diferenciar a al aplicación.

También le puedo agregar el nombre del proyecto, por ejemplo: **mx.com.globalmentoring.paquetes** . 

Dentro de mi paquete voy a tener la clase **Utileria.java** que tiene el método estático **imprimir()** que recibe como argunmento un **String** y devuelve por pantalla esa String. 

También creo otro paquete para poder utilizar la clase. El paquete se llama **test** y la clase **TestUtileria.java**.

Y voy a tener: 

```JAVA
package test;

import mx.com.globalmentoring.Utileria;

public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos");
    }
}
```

Si directamente *importo* a la clase **Utileria** con el *método* **imprimir**, dentor de la clase *TestUtileria* directamente llamo al método imprimir.


```JAVA
package test;

import static mx.com.globalmentoring.Utileria.imprimir;

public class TestUtileria {
    public static void main(String[] args) {
        imprimir("Adios");
    }
}
```

Y también está la sintaxis conocida como el **nombre completamente calificado**. 

Se pueden usar las clases sin necesidad de usar import, pero se debe usar el nombre completamente calificado de la clase. 


```JAVA
package test;

public class TestUtileria {
    public static void main(String[] args) {
        
        mx.com.globalmentoring.Utileria.imprimir("Hola Mundo!");
    }
}

```

---


💻 Ejemplo en la carpeta [**Paquetes**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion9paquetes/Paquetes)
