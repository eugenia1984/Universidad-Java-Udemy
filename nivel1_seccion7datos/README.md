# Uso de Arreglos en Java


Un **array** es un conjunto de elementos de diferentes tipos, pueden ser int, String, objects, boolean, double, etc.

Los **elementos** comienzan con el **índice** 0. 

Siempre el length va a ser igual a length-1 .

Ejemplo: 

Arreglo de tipos INT: <br>
indices:  0  -  1  -  2  -  3  4<br>
elementos: 35 / 25 / 50 / 46 <br>
El largo (**length**) es de : 4 <br>

## ¿ Cómo declaro un array ?

Los corchetes pueden estar antes o después del nombre de la viariable.

*tipo de dato* + *nombre de la variable de tipo areglo* + *corchetes* :

En general el nombre de la variable suele estar en plural: edades, personas, y aclara que es lo que almacena. 

```JAVA
//Arreglo de tipo entero
int edades[];
```      
 
 *tipo de dato* + *corchetes* + *nombre de la voriable de tipo arraeglo* : 
 
 ```JAVA
//Arreglo de tipo entero
int []edades;
```  

## ¿ Cómo le doy dimesión al arreglo ?

Una vez que tiene una dimensión, es fija, no puede modificarse. 

```JAVA 
int edades[] = new int[3];
``` 

Si lo mando a imprimir por consola voy a ver que ya ocupa un lugar en memoria, por más que todavía no tenga sus elementos. 


Para acceder a los elementos del arreglo y modificarlos: 

*nombre del arreglo* + *corchetes con el índice del elemento que quiero modificar* = *valor a asignar* ; 

```JAVA 
edades[0] = 10;
``` 
    
## ¿ Cómo recorro mi arreglo ?

Con un ciclo **FOR**. 


```JAVA
for (int i = 0; i < edades.length; i++) {
     System.out.println("Arreglo edades con índice : " + i + " de valor: " + edades[i]);
}
```

## Arreglos: sintaxis resumida

Ya al declarar mi arreglo **le asigno los valores**. 

```JAVA
String frutas[] = {"Naranja", "Banana", "Uva"};
```

Mando por consola mi arreglo de frutas: 

```JAVA
for (int i = 0; i < frutas.length; i++) {
    System.out.println("Arreglo frutas, indice: " + i);
} 
```
    
---

:computer: Se pueden ver los ejercicios de la carpeta [**Arreglos**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion7datos/Arreglos), con su clase **TestArreglos.java** dentro del paquete **test**. 

---


## Arreglos con elementos de tipo objetos

Voy a tener a mi **clase Persona** con el *atributo* privado de tipo String **nombre** , su contructor y sus getters y setters. 


Y en mi paquete *test* voy a tener la clase **TestArreglosObject.java**. 


```JAVA 
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


```JAVA  
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

:computer: Se pueden ver los ejercicios de la carpeta [**Arreglos**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion7datos/Arreglos), con su clase **Persona.java** dentro del paquete **domain**.


---

# Manejo de Matrices en Java

Es un arreglo de arreglos, tiene **filas** y **columnas**.

Ejemplo de **matriz** de tipo **int**. 

fila 0 : 35 - 78 - 34 - 50 - 41 - 15 - 18 <br>
fila 1 : 27 - 90 - 24 - 48 - 56 - **89** - 78 <br>
fila 2 : 3 - 47 - 79 - 28 - 64 - 40 - 52 <br>
fila 3 : 56 - 2 - 31 - 75 - 36 - 13 - 49 <br>

El elemento **89** es de índice [1][5], porque ocupa la fila 1 y columna 5

## ¿ Cómo declaro mi matriz ?

Los [][] me indican que va a ser una matriz. Por ejemplo: 


```JAVA 
int edades[][]= new int[3][2];
```  

[3] me indica que va a tener 3 filas. <br>
[2] me indica que va a tener 2 columnas. <br>

Voy a tener una matriz con estos índices: <br>

[0,0] - [0,1] <br>
[1,0] - [1,1] <br>
[2,0] - [2,1] <br>


## ¿ Cómo asignarle valores manualmente ?

Si quiero asigna la edad al elemento con índice: fila 0, colomna 0: 

```JAVA  
edades[0][0] = 10;
edades[0][1] = 2;

edades[1][0] = 60;
edades[1][1] = 12;

edades[2][0] = 3;
edades[2][1] = 4;
```  

Me va a quedar: <br>

10 - 2 <br>
60 - 12 <br>
3 - 4 <br>


## ¿ Cómo asignar valores iterando con dos ciclos FOR?

Utilizo un **FOR ANIDADO**, porque primero voy a ir recorreindo las filas, y dentro de cada fila voy a ir recorriendo las columnas ( aca va a estar mi for anidado).

``` JAVA
for (int fila = 0; fila < edades.length; fila++) { ///para recorrer las filas
            
    for (int columna = 0; columna < edades[fila].length; columna++) {      ///para recorrer las columnas
         System.out.println("edades : " + fila + " -  " + columna);
    }
}

``` 

## Sintaxis simplificada en matrices


```JAVA
String frutas[][] = {{"Naranja", "Limón"}, {"Frutillas", "Arándanos"}};
```

Para recorrer mi matriz y mostrarla, utilizo for anidados: 

```JAVA
for (int f = 0; f < frutas.length; f++) { 
            
   for (int columna = 0; columna < frutas[f].length; columna++) { 
      System.out.println("Frutas : " + f + " -  " + columna + " : " +  frutas[f][columna]);
   }
}
```

Y se imprime: 

Frutas : 0 -  0 : Naranja <br>
Frutas : 0 -  1 : Limón <br>
Frutas : 1 -  0 : Frutillas <br>
Frutas : 1 -  1 : Arándanos <br>


## Matriz de tipo Objetos

Creo una nueva matriz de tipo Objeto. 

```JAVA
Persona personas [][] = new Persona[2][3];
```


Les asigno los valores a la primer fila 

```JAVA
    personas[0][0] = new Persona("Juan"); 
    personas[0][1] = new Persona("Ana"); 
    personas[0][2] = new Persona("Mara"); 
```

Les asigno los valores a la segunda fila 

```JAVA
    personas[1][0] = new Persona("Juana"); 
    personas[1][1] = new Persona("Analia"); 
    personas[1][2] = new Persona("Maria");  
```

## Creo un metodo para imprimir mi matriz

Fuera del método principal: 

```JAVA
 public static void imprimir(Object matriz[][]) {
      for (int i = 0; i < matriz.length; i++) { 
            
        for (int j = 0; j < matriz[i].length; j++) { 
            System.out.println("Matriz : " + i + " -  " + j + " : " +  matriz[i][j]);
        }
    }
  
  } 
```  
  
Llamo mi método imprimir() para ver el arreglo de Persona  

```JAVA  
    System.out.println("Matriz personas : ");
    imprimir(personas);
    
``` 

Y veo por consola:

Matriz personas :  <br>
Matriz : 0 -  0 : Pesona{nombre = Juan} <br>
Matriz : 0 -  1 : Pesona{nombre = Ana} <br>
Matriz : 0 -  2 : Pesona{nombre = Mara} <br>
Matriz : 1 -  0 : Pesona{nombre = Juana} <br>
Matriz : 1 -  1 : Pesona{nombre = Analia} <br>
Matriz : 1 -  2 : Pesona{nombre = Maria} <br>

---

:computer: Ver el proyecto [**Matrices**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion7datos/Matrices)

---
