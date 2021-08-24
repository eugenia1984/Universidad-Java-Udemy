# Lección 2 - Manejo Avanzado de Objetos en Java

## Conversión de Objetos (cast)

Cambio una variable de tipo padre a una variable de tipo hija para poder acceder a los atributos y metodos de la clase hija.

Con instanceof puedo ver si los puedo convertir o no.

Si es padre voy a tener acceso a los atributos y metodos de la clase padre.

Si es hijo voy a tener acceso  a los atributos y metodos de la clase hija.

Si es Object voy a tener acceso a los atributos y metodos de la clase Object.

```JAVA
//CONVERSION DE TIPO
    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
    //Variable de tipo EMPLEADO convertida a TIPO GERENTE
            Gerente gerente = (Gerente)empleado;
    //con la variable empleado accedo a los atributos y metodos de la clase hija
            gerente.getDepartamento();
        } 
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
            //Gerente gerente = (Gerente)empleado;
            //gerente.getDepartamento();
            //Esto me daria error porque ya es de tipo hija, no necesito castear
            System.out.println("empleado = " + empleado.getNombre());  //accedo a atributos de la clase padre
        } 
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            //Solo tengo acceso a los metodos de tipo object
        }
    }
```


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
