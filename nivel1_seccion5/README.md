# Lección 5 - Programación Orientada a Objetos

## Introducción a la Programación Orientada a Objetos (POO)

Una **CLASE** es una plantilla , que tiene **ATRIBUTOS** y **MÉTODOS**, y de la cual se pueden CREAR (INSTANCIAR) nuevos **OBJETOS** .

Por ejemplo tengo la CLASE PERSONA, con sus atributos (nombre, apellido, teléfono ) y métodos (para recuperar al edad de la persona y modificarla). 

En los programas definimos las clases, y luego creamos objetos para trabajar con ellos, asignarles valores o hacer cálculos.

La clase define los atributos y métodos de manera genral y en el objeto le asigno los valores. 

Los nombres de las clases se declaran en **UpperCamelCase** .

### Ejemplo con diagrama general de una clase:

**Persona**  (nombre de la clase) 

(los ATRIBUTOS ) <br>
-nombre: String <br>
-genero: char <br>
-ocupacion: String <br>

(los MÉTODOS ) <br>
( los GETTERS ) <br>
obtenerNombre: String <br>
obtenerGenero() : String<br>
obtenerOcupacion(): String <br>
( los SETTERS ) <br>
modificarNombre(nombre : String ) <br>
modificarGenero( genero : String )<br>
modificarOcupacion( ocupacion: String ) <br>


---

## Manejo de Clases en Java


En la **CLASE MAIN** voy a ejecutar mi programa, acá vy a instanciar nuevos OBJETOS de mi clase y les puedo asignar valores.

La clase main la distingo porque tengo: 


```JAVA
public static void main(String[] args) {

}
```

Tengo otra CLASE en la cual están los atributos y métodos (constructores, getters, setters, y métodos). 



---

## Uso de Objetos en Java


Los OBJETOS son instancias de mi clase, teiene sus atributos y métodos, pero son independientes, por ejemplo tengo la persona1 con el nombre Maria Eugenia y el apellido Costa y la persona2 con el nombre Ana y el apellido Baez, si bien ambas tieen nombre y apellido, cada una tiene su propio valor. 

---

:computer: ver la carpeta [**clase**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion5/clase) que tiene el paquete CLASE con los clases:  **Persona.java**  y **PruebaPersona** (donde está el método main) . 

---

## Encapsulamiento

Se usa el **modificador de acceso** **PRIVATE** lo que va a evitar que se pueda acceder a los datos.

Se van a necesitar los **método de acceso** es decir los **GETTERS** y los **SETTERS**.

Con **get** se obtiene la información del atributo . 

Con **set** se puede modificar el atributo. 


```JAVA
public class Persona {

    private String nombre;
    private boolean eliminado;
    
    //constructor
    public Persona(String nombre, boolean eliminado) {
        this.nombre = nombre;
        this.eliminado = eliminado;
    }
    
    //Metodos getters y setter del atributo nombre
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
        
    //Metodos getters(IS por ser booleano) y setter del atributo eliminado
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(Boolean eliminado){
        this.eliminado = eliminado;
    }
}

```

:computer: ver el ejemplo con los paquetes : [**dominio**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion5/dominio) y la clase **Persona.java** y **test** y la clase **PersonaPrueba.java** .

---

## Método toString()

Nos permite imprimir el estado del objeto en todo momento, podremos vero los valores de los atributos que mandemos a imprimir por el método toString. 

El método convierte a cadena cada uno de los métodos que tengo de mi clase. 

Para el ejemplo de la clase Persona: 


```JAVA
public String toString(){
return "Persona ( nombre" + this.nombre + 
        ", sueldo: " + this.sueldo +
        ", eliminado : " + this.eliminado;
}
```

El método println ya trae toStrig() asi que solo puedo poner:

```JAVA
System.out.println("persona1 : " +persona1);
```

Porque como en mi clase Persona ya tengo el método toString() al tener printLn es lo mismo : persona1 que persona1.toString(); 

---

## Contexto estático y contexto dinámico

El *contexto estático* está asociado a una clase. 

El contexto estático NO puede ACCEDER al contexto dinamico, porque necesita que las clases ya estén creadas para poder crear objetos.

El *contexto dinámico* está asociado a un objeto, porque ya creamos a partir de la clase que ya está en memoria.

En cambio el contexto dinámico si puede acceder al contexto estático. 

**static** se asocia a la *clase* no a los *objetos*, los objetos comparten los atributos y métodos estáticos. Si los atributos son estáticos, cada vez que se crea un objeto este tiene su propio atributo no estático.

Ejemplo en código: 

Tengo la clase Persona en **Persona.java** en el paquete [**dominio**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion5/dominio): 

```JAVA
package domain;

public class Persona {
  private int idPersona;
  private String nombre;
  private static int contadorPersona;
  
  public Persona(String nombre) {
    this.nombre = nombre;
  //incrementar el contador por cada objeto nuevo  
  Persona.contadorPersona++;
  //asignar el nuevo valor a la variable idPersona
  this.idPersona = Persona.contador++;
  }
  
  //Getters y Setters
  public int getIdPersona(){
    return idPersona;
  }
  
  public void setIdPersona(int idPersona) {
    this.idPersona = idPersona;
  }
  
  public int getNombre() {
    return nombre;
  }
  
  public void setNombre(Strinf nombre) {
    this.nombre = nombre;
  }
  
  public static int getContadorPersonas() {
    return contadorPersonas;
  }
  
  public static void setContadorPersonas(int ContadorPersonas) {
    contadorPersonas = aContadorPersonas;
  }
  
  @Override
  public String toString() {
    return "Persona {" + "idPersona" + idPersona + ", nombre=" + nombre + "]";
  }

}

```

La **clase Persona** extiende desde el **Objeto** que es una clase que tiene definido el método **toString**. Y como lo modificamos desde la clase persona tenemos **@Override**.<

Como ya tengo creada mi **clase persona** ahora creo un nuevo paquete [**test**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion5/test) con la clase **PersonaPrueba.java**.


```JAVA
package test;

import domian.Persona;

public class PersonaPrueba {
  public static void main(String[] args) {
  
    Persona persona1 = new Persona("Juan");
    Persona persona2 = new Persona("Karla");
   
     imprimir(persona1);
     //Imprime por consola: Persona1 = Persona{ idPersona=1, nombre=Juan}  
     imprimir(persona2);
     //Imprime por consola: Persona2 = Persona{ idPersona=2, nombre=Karla}  
  }
  
  public static void imprimir(Persona persona){
     System.out.print("persona = " + persona );
  }
  
}

```

