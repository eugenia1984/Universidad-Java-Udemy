# Paquetes

Se nombran al reves que la url, si por ejempplo tengo globalmentoring.com.mx, voy a nombrar al paquete : <br>
**mx.com.globalmentoring**<br>
Y voy a tneer la carpeta **mx** con la subcarpeta **com** con la subcarpeta **globalmentoring** <br>

No es un dominio con el cual se va a conectar a internet, sino un nombre para diferenciar a al aplicación. <br>

También le puedo agregar el nombre del proyecto, por ejemplo: **mx.com.globalmentoring.paquetes** . <br>

Dentro de mi paquete voy a tener la clase **Utileria.java** que tiene el método estático **imprimir()** que recibe como argunmento un **String** y devuelve por pantalla esa String. <br>

También creo otro paquete para poder utilizar la clase. El paquete se llama **test** y la clase **TestUtileria.java**.<br>
Y voy a tener: <br>

```
package test;

import mx.com.globalmentoring.Utileria;

public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos");
    }
}
```

Si directamente *importo* a la clase **Utileria** con el *método* **imprimir**, dentor de la clase *TestUtileria* directamente llamo al método imprimir. <br>

```
package test;

import static mx.com.globalmentoring.Utileria.imprimir;

public class TestUtileria {
    public static void main(String[] args) {
        imprimir("Adios");
    }
}
```
