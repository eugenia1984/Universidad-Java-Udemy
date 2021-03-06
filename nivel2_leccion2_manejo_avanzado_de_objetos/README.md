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

| Clase Raiz de todos las clases -> java.lang:Object |
| --------------------------------------------------- |
| +toString(): String |
| +equals(): boolean |
| +hashCode(): int |


Ejemplo en codigo:

Creo dos variables que son instancia de la clase empleado
```JAVA
        Empleado empleado1 = new Empleado("Juan", 6000);
        Empleado empleado2 =  new Empleado("Juan", 6000);
```        
        
Aunque tengamos los **mismos valores en los atributos**, al utiliar **new** para crear cada uno de los objetos entonces se encuentran en diferente **referencia en memoria**

Tenemos que ver si dos ejemplos son iguales:

 ```JAVA       
if (empleado1 == empleado2) {
     System.out.println("Tienen la misma referencia en memoria");
} else {
     System.out.println("Tienen distinta referencia en memoria");
}
 ```
  
Por consola voy a ver -> Tienen distinta referencia en memoria
  
Ahora lo que queremos COMPARAR es el CONTENIDO de los objetos -> metodo **equals** en la clase Empleado 

Con **insert code...** selecciono **equals() and hashCode()**, del lado izquierdo selecciono los atributos para el equals() y del lado derecho los atributospara el hashcode()

Tengo que seleccionar LOS MISMOS ATRIBUTOS en equals y en hashcode, no me puede faltar en hashcode alguno de equals.


**hashcode** devuelve un tipo entero, lo más único posible (pero tengo una posibilidad minima de que se repita), se le asignoa un valor al hash y se le suman los valores de los atributos de la clase.

Este calculo puede variar de IDE en IDE y de implementación en implementación.

Lo que importa es que se trata de conseguir **un valor entero unico** para el objeto considerando los atributos del objeto.

```JAVA
  @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }
```


**equals** nos devuelve TRUE o FALSE, compara el objeto con el que estamos trabajando con otro objeto que recibe por parametro (ese parametro es variable de tipo Object). Compara el CONTENIDO.

**.getCLass** devuelve el tipo de la clase del objeto con el que estamos trabajando

```JAVA
 @Override
    public boolean equals(Object obj) {
        if (this == obj) {  //si es el mismo objeto que paso por parametro
            return true;
        }
        if (obj == null) { //si es null, son distintos
            return false;
        }
        if (getClass() != obj.getClass()) {   //si el tipo de la clase son diferentes
            return false;
        }
        final Empleado other = (Empleado) obj;  //hacemos un cast de la clase object a la clase empleado
         //comparo los atributos de la clase
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {  //comparamos los atributos de nombre
            return false;
        }
        return true;
    }
```


Veo si los dos son iguales con equals y hashcode de la clase Empleados:

```JAVA
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son distintos en contenido");
        }
```

Por consola tengo -> ```Los objetos son iguales en contenido```


Y comparo los hashcode:

```JAVA
 if(empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashcode es igual");
        } else {
            System.out.println("El valor hashcode es distinto");
        }
```

Por consola tengo -> ```El valor hashcode es igual```

Esto es asi porque si el valor de **equals** entre ambos objetos es true (es porque son iguales) , entonces el valor de **hashcode** también es igual.
  
---


◾ [ver ejemplo de **clase object**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion2_manejo_avanzado_de_objetos/ClaseObject)

---

## JavaBeans

-Dabe tener un constructor vacio y debe ser constructor PUBLIC. Puede tener más de un constructor, pero para ser considerada JavaBeans si o si debe tener el constructor vacío.

-Cada atributo que definamos dentro de la clase debe ser un atributo PRIVATE. 

-Cada atributo private debe de tener un método GET y SET asociado.

-Debe implementar una INTERFACE llamada  **Serializable**, que nos va a permitir enviar la clase entre diferentes equipos -> ```implements Serializable``` y hay que importar la clase porque viene de otro paquete -> ```import java.io.Serializable;```

-Se pueden agregar los metodos -> toString(), equals() y hashCode(), pero NO son requeridos para que mi clase se considere JavaBeans, son opcionales

Si mi clase sigue la nomenclatura de JavaBeans otros Framewroks (Spring o Hibernate) o JavaEnterprise la van a poder utilizar.


Ejemplo en codigo:

```JAVA
/*
 * CLASE QUE SE CONSIDERA JAVABEANS
 */
package domain;

import java.io.Serializable;

//Hay que importar la clase Serializable que esta en el paquete java.io
public class Persona implements Serializable{  
    //Atributos PRIVATE
    private String nombre;
    private String apellido;
    
    //Debe tener un constructor vacio y debe ser PUBLIC
    public Persona(){
    }
    
    //se pueden agregar mas constructores, pero no son necesarios para ser JavaBeans
    //en este ejemplo los agrego para poder inicializarlos
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Metodo get y set asociado por cada atributo privado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //se pueden agregar los metodos ->
    //toString(), equals() y hashCode(), pero NO son requeridos

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido + '}';
    }
    
}
```

En mi paquete test:

```JAVA
package test;

import domain.Persona;


public class TestJavaBeans {


    public static void main(String[] args) {
        //Creo un objeto de la clase Persona que es JavaBeans
        Persona persona = new Persona();  //uso el constructor vacio
        //con el metodo set inicializo los atributos
        persona.setNombre("Maria Eugenia");
        persona.setApellido("Costa");
        System.out.println("persona = " + persona);
        //Tambien puedo acceder a sus valores con el metodo get
        System.out.println("persona nombre = " + persona.getNombre());
        System.out.println("persona apellido = " + persona.getApellido());
    }
    
}
```

◾ [ver ejemplo de JavaBeans](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion2_manejo_avanzado_de_objetos/JavaBeans)


---

## La importancia y uso del operador this

Se vio en la seccion anterior

---
