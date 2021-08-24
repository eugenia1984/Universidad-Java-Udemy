# Lección 2 - Manejo Avanzado de Objetos en Java

## Conversión de Objetos (cast)

Vos a tener la SUPER CLASE **Object** de la cual va a extender la CLASE HIJA **Empleado**

Y a su vez la clase **Empleado** va a ser la clase padre de sus hijas: **Editor**, **Gerente** y **Escritor** el cual también va a ser padre de **Corrector** 

```
            Object
              ^
              | <<extends>>
           Empleado
              ^
              | <<extends>>
    --------------------
    |         |        |
Editor   Gerente    Escritor 
                      ^
                      | <<extends>>
                   Corrector
```

Si voy de una **clase superior (padre)** a una **clase inferior (hija)** -> **DOWNCASTING**

Si voy  de a una **clase inferior (hija)** a una **clase superior (padre)**  -> **UPCASTING**

En ambos casos es un **casteo** ó **conversión de objetos** pero dependeidno de la dirección en la que se hace se conoco como **downcasting** de una clase a una clase hija y como **upcasting** de una clase hija a una clase padre.

---

◾  [ejemplo de **conversion de objetos**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion2_manejo_avanzado_de_objetos/ConversionObjetos)

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

◾ [ver ejemplo de **instanceof**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion2_manejo_avanzado_de_objetos/InstanceOf)

---

## Clase Object

Todos las clases en Java **heredan de la clase object**.

La clase Object ya define algunos métodos, como por ejemplo:

**toString()**

**equals()** : compara el contenido de dos objetos para saber si son iguales

**hashCode()** : permite comparar el contenido de los objetos, sin embargo la comparacion se realiza con un tipo entero, se genera un valor de tipo entero que se va a asignar a cada objeto generado a partir d elos valores de cada uno de los atributos de la clase. Se genera un ENTERO UNICO PARA CADA OBJETO y posteriormente se COMPARA ESE VALOR UNICO para saber si dos objetos son iguales.

Si se va a implementar el método *hashCode* en la clase hay que SOBREESCRIBIR el metodo *equals*, más que nada cuando se usan algoritmos de ordenamiento como en las colecciones HashMap, HashSet, Hashtable.


CLASE OBJECT EN JAVA:

| Clase Reiaz de todos las clases -> java.lang:Object |
| --------------------------------------------------- |
| +toString(): String |
| +equals(): boolean |
| +hashCode(): int |

---


## La importancia y uso del operador this

Se vio en la seccion anterior

---
