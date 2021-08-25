# Módulo 6 - Manejo de Colecciones en Java

---

## Manejo de Colecciones en Java


Un **tipo generico** en Java es como un tipo **comodín** en el cual cuando definimos la clase no indicamos el tipo de dato que va a almacenar o utilizar nuestra clase sino que hasta el momento en que creamos un objeto de esta clase entonces es que vamos a especificar el tipo de dato que vamos a utilizar.


Tipos genéricos que se pueden utilizar:

| Nombre Tipo Genérico | Significado del Tipo Genérico |
| -------------------- | ----------------------------- |
| E | Element (utilizado generalmente por el framework de Colecciones Java) |
| K | Key (llave utilizada en mapas) |
| N | Number(utilizado para números) |
| T | Type (representa un tipo, una clase) |
| V | Value (representa un valor, tambien se usa en mapas) |
| S, U, V, etc. | usado para representar otros tipos |

Ejemplo en codigo:

El **atributo** es de tipo **T** generico

EL **constructor** recibe una variable de tipo generico **T**

con el método **obtenerTipo** mando a imprimir al tipo de objeto utilizando los métodos **.getClass()** y **.getSimpleName()**

```JAVA
package genericos;
 
public class ClaseGenerica<T> { //el tipo del atributo no lo conozco hasta que lo utilizo por eso lo nombro con T de tipo  
    private T objeto;  
    
    public ClaseGenerica(T objeto){  
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){  
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName() );
    }
    
}
```

## ¿ Cómo creo un objeto a partir de **una clase genérica ?

A partir de mi clase ClaseGenerica quiero instanciar un nuevo objeto.


---

## Colecciones Genéricas en Java

---
