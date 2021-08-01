# Uso de Arreglos en Java


Un **array** es un conjunto de elementos de diferentes tipos, pueden ser int, String, objects, boolean, double, etc.<br>

Los **elementos** comienzan con el **índice** 0. <br>
Siempre el length va a ser igual a length-1 .<br>

Ejemplo: <br>

Arreglo de tipos INT: <br>
indices:  0  -  1  -  2  -  3  4<br>
elementos: 35 / 25 / 50 / 46 <br>
El largo (**length**) es de : 4 <br>

## ¿ Cómo declaro un array ?

Los corchetes pueden estar antes o después del nombre de la viariable. <br>

*tipo de dato* + *nombre de la variable de tipo areglo* + *corchetes* : <br>

En general el nombre de la variable suele estar en plural: edades, personas, y aclara que es lo que almacena. <br>

```
//Arreglo de tipo entero
int edades[];
```      
 
 *tipo de dato* + *corchetes* + *nombre de la voriable de tipo arraeglo* : <br>
 
 ```
//Arreglo de tipo entero
int []edades;
```  

## ¿ Cómo le doy dimesión al arreglo ?

Una vez que tiene una dimensión, es fija, no puede modificarse. <br>

``` 
int edades[] = new int[3];
``` 

Si lo mando a imprimir por consola voy a ver que ya ocupa un lugar en memoria, por más que todavía no tenga sus elementos. <br>


Para acceder a los elementos del arreglo y modificarlos: <br>
*nombre del arreglo* + *corchetes con el índice del elemento que quiero modificar* = *valor a asignar* ; <br>

``` 
edades[0] = 10;
``` 
    
## ¿ Cómo recorro mi arreglo ?

Con un ciclo **FOR**. <br>


```
for (int i = 0; i < edades.length; i++) {
     System.out.println("Arreglo edades con índice : " + i + " de valor: " + edades[i]);
}
```

## Arreglos: sintaxis resumida

Ya al declarar mi arreglo **le asigno los valores**. <br>

```
String frutas[] = {"Naranja", "Banana", "Uva"};
```

Mando por consola mi arreglo de frutas: <br>

```
for (int i = 0; i < frutas.length; i++) {
    System.out.println("Arreglo frutas, indice: " + i);
} 
```
    
---

:computer: Se pueden ver los ejercicios de la carpeta **Arreglos**, con su clase **TestArreglos.java** dentro del paquete **test**. <br>

---


## Arreglos con elementos de tipo objetos

Voy a tener a mi **clase Persona** con el *atributo* privado de tipo String **nombre** , su contructor y sus getters y setters. <br>

Y en mi paquete *test* voy a tener la clase **TestArreglosObject.java**. <br>

``` 
package domain;


public class Persona {
    //Atributo
    private String nombre;
    
    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    
    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + '}';
    }
}
``` 


```  
package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
    
//Creo un nuevo arreglo de tipo Object
    Persona personas[] = new Persona[2];

//Relleno mi arreglo    
    personas[0] = new Persona("Eugenia");
    personas[1] = new Persona("Marcos");
    
 //Lo imprimo recorriendolo con un for
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas con índice: " + i + " : " + personas[i]);
          
        }   
    }
}
```  

---

:computer: Se pueden ver los ejercicios de la carpeta **Arreglos**, con su clase **Persona.java** dentro del paquete **domain**. <br>


---

# Manejo de Matrices en Java
