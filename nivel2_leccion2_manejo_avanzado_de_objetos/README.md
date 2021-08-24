# Lección 2 - Manejo Avanzado de Objetos en Java

## Conversión de Objetos (cast)


---


## Identificando el tipo de objeto con el operador instanceof

INSTANCE OF -> determino el tipo por tiempo de ejecucion, ver de que tipo es la referencia a la cual está apuntando la memoria: new ClasePadre() ó new ClaseHija()


Ejemplo en codigo:

```JAVA
import domain.*;


public class TestInstanceOf {
    
    public static void main(String[] args) {
        
        //creo un objeto de tipo clase Empleado(CLASE PADRE)
        Empleado empleado = new Empleado("Juan",5000);
        determinarTipo(empleado);
        //creo un objeto de tipo clase genrente(CLASE HIJA)
        Gerente gerente = new Gerente("Sandra",10000,"Contabilidad");
    }
    
    //INSTANCE OF -> determino el tipo por tiempo de ejecucion, ver de que tipo
    //es la referencia a la cual está apuntando la memoria, si es new Gerente/Empleado
    public static void determinarTipo(Empleado empleado){
        //Siempre empiezo preguntando si es instanceOf de CLASE HIJA
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
    
}
```


Siempre hay que ir de la clase hija, a la clase padre, **siempre de tipo más específico a tipo más genérico**

Me va a dar TRUE para **el mismo tipo** y para **la clase padre**, por eso es importante el orden.

---

◾ [ver ejemplo de **instanceof**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion2_manejo_avanzado_de_objetos/InstanceOf)

--


## La importancia y uso del operador this
