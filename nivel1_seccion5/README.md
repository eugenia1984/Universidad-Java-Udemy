# Lección 5 - Programación Orientada a Objetos

## Introducción a la Programación Orientada a Objetos (POO)

Una **CLASE** es una plantilla , que tiene **ATRIBUTOS** y **MÉTODOS**, y de la cual se pueden CREAR (INSTANCIAR) nuevos **OBJETOS** .<br>

Por ejemplo tengo la CLASE PERSONA, con sus atributos (nombre, apellido, teléfono ) y métodos (para recuperar al edad de la persona y modificarla). <br>

En los programas definimos las clases, y luego creamos objetos para trabajar con ellos, asignarles valores o hacer cálculos. <br>
La clase define los atributos y métodos de manera genral y en el objeto le asigno los valores. <br>

Los nombres de las clases se declaran en **UpperCamelCase** . <br>

### Ejemplo con diagrama general de una clase:

**Persona**  (nombre de la clase) <br>

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


En la **CLASE MAIN** voy a ejecutar mi programa, acá vy a instanciar nuevos OBJETOS de mi clase y les puedo asignar valores. <br>
La clase main la distingo porque tengo: <br>

```
public static void main(String[] args) {

}
```

Tengo otra CLASE en la cual están los atributos y métodos (constructores, getters, setters, y métodos). <br>



---

## Uso de Objetos en Java


Los OBJETOS son instancias de mi clase, teiene sus atributos y métodos, pero son independientes, por ejemplo tengo la persona1 con el nombre Maria Eugenia y el apellido Costa y la persona2 con el nombre Ana y el apellido Baez, si bien ambas tieen nombre y apellido, cada una tiene su propio valor. <br>

---

:computer: ver la carpeta **clase** que tiene el paquete CLASE con los clases:  **Persona.java**  y **PruebaPersona** (donde está el método main) . <br>

---

## Encapsulamiento

Se usa el **modificador de acceso** **PRIVATE** lo que va a evitar que se pueda acceder a los datos.<br>

Se van a necesitar los **método de acceso** es decir los **GETTERS** y los **SETTERS**.<br>
Con **get** se obtiene la información del atributo . <br>
Con **set** se puede modificar el atributo. <br>


```
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
:computer: ver el ejemplo con los paquetes : **dominio** y la clase **Persona.java** y **test** y la clase **PersonaPrueba.java** .

---

## Método toString()

Nos permite imprimir el estado del objeto en todo momento, podremos vero los valores de los atributos que mandemos a imprimir por el método toString. <br>
El método convierte a cadena cada uno de los métodos que tengo de mi clase. <br>
Para el ejemplo de la clase Persona: <br>

```
public String toString(){
return "Persona ( nombre" + this.nombre + 
        ", sueldo: " + this.sueldo +
        ", eliminado : " + this.eliminado;
}
```

El método println ya trae toStrig() asi que solo puedo poner: <br>

```
System.out.println("persona1 : " +persona1);
```

Porque como en mi clase Persona ya tengo el método toString() al tener printLn es lo mismo : persona1 que persona1.toString(); <br>

---
