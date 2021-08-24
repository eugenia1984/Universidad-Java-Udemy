# Lección 2 - Manejo Avanzado de Objetos en Java

## Conversión de Objetos (cast)


---


## Identificando el tipo de objeto con el operador instanceof

INSTANCE OF -> determino el tipo por tiempo de ejecucion, ver de que tipo es la referencia a la cual está apuntando la memoria: new ClasePadre() ó new ClaseHija()


Ejemplo en codigo:

```JAVA
public static void determinarTipo(Empleado empleado){
        //Siempre empiezo preguntando si es instanceOf de CLASE HIJA
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        } 
    }
```

---


## La importancia y uso del operador this
