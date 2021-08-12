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

## Enumeraciones

Los tipos **enumerados** son un tipo especial de *clase*, el cual nos permite asociar una serie de valores de tipo final, es decir que son constantes. 

Por ejemplo podemos observar el la lámina las constantes de los días de la semana.

Vemos que es como crear una clase de Java, solo que en lugar de la palabra class, utilizamos la palabra reservada **enum**

Debido a que los elementos de una enumeración son **constantes**, se escriben con mayúsculas

``` JAVA
public enum Dias {
//Son valores constantes por eso van en mayuscula
 LUNES,
 MARTES,
 MIERCOLES,
 JUEVES,
 VIERNES,
 SABADO,
 DOMINGO
}
``` 

Podemos utilizar una clase de tipo enumeración cada vez que **necesitemos declarar una serie de valores constantes y que conozcamos
previamente**, como los días de la semana, los puntos cardinales, el conjunto de planetas, continentes, y en si cualquier conjunto de datos
que son constantes.


## ¿ Cómo lo utilizo en Java  ?

``` JAVA

public class EjemploEnumeraciones {

 public static void main(String[] args) {
  //Valores de la enumeracion
  System.out.println("Valor 1:" + Dias.LUNES);
 
  //Hacemos un test del dia utilizado
  indicar(Dias.LUNES);
  }
  
  public static void indicarDia(Dias dias) {
   swithc (dias) {
    //Podemos usar algun valor constante de la enumeracion directamente
     case LUNES:
      System.out.println("Primer día de la semana");
      break;
   }
  }
 
}
``` 
 
 Lo que hacemos es indicar el nombre de la enumeración, en este caso Dias, y posteriormente utilizamos alguno de los valores constantes de la enumeración, por ejemplo: Dias.LUNES, con eso estaremos utilizando alguno de los valores de enumeración según necesitemos.
 
 Sin embargo no es su único uso, podemos utilizar una enumeración para comprobar algunos de los casos de una estructura switch, la cual sabemos que seleccionará alguno de los casos según coincida con la entrada de la sentencia switch
 
 Para probar alguno de los casos de la estructura switch, debemos proporcionar ya un valor de la enumeración, como puede ser Dias.LUNES o Dias.MARTES, etc.
 
 Y dentro del switch en cada uno de los casos podemos especificar los valores ya sin especificar el nombre de la enumeración, sino simplemente indicando la constante de la enumeración, por ejemplo case LUNES, o case MARTES, etc.
 
 
 ### Otro ejemplo de uso:
 
 
 ```JAVA
 public enum Continentes {
  AFRICA(53),
  EUROPA(46),
  ASIA(44),
  AMERICA(34),
  OCEANIA(14);
  
  //ATRIBUTO DE CADA ELEMENTO DE UNA ENUMERACION
  private final int paises;
  
  //CONSTRUCTOR DE CADA ELEMENTO DE LA ENUMERACION
  Continentes( int paies) {
   this.paises = paises;
  }
 
  public int getPaises(){
   retunr paises;
  }
 }
 
 ```
 
 Sin embargo el tipo enumeración es más complejo que eso. Podemos además de definir simples valores
constantes, valores a cada una de las constantes.


Para ello debemos crear un constructor para inicializar cada uno de los valores asociado a cada constante.

Por ejemplo en el código podemos observar que estamos creando una enumeración de los continentes
existentes, sin embargo nos interesaría indicar el número de países existentes por cada continente.

Para ello cuando definimos cada constante de la enumeración, podemos proporcionar los valores que
deseemos separados por comas, en este caso es sólo un valor entero el que estamos proporcionado, el
cual significa el número de países por cada continente que declaramos.


 Sin embargo para poder crear este tipo de enumeraciones más complejas, necesitamos crear un
constructor para poder crear cada uno de los elementos de la enumeración, y además los atributos que se
asociarán con los valores proporcionados por cada constante de la enumeración.

Por ello vemos en el código, que no basta con crear las constantes de la enumeración, sino que debemos
además declarar el atributo países de tipo entero, y posteriormente declaramos un constructor, el cual se
llamará de manera automática por cada uno de los elementos de la enumeración.

Y finalmente, debido a que cada uno de los elementos de la enumeración contiene definido el numero de
países, es posible declarar un método getPaises para recuperar precisamente el atributo países declarado
en el tipo enumeración.

A continuación vamos a ver cómo utilizar una enumeración de este tipo.
 
 ```JAVA
 public static void main(String[] args0 0){
 
  //UTILIZAMOS LA ENUMERACION DE PAISES
  System.out.println("Continente nro 4:" + Continentes.AMERICA);
  System.out.println(Paises en Amercia" + Continentes.AMERICA.getPaises());
  
  //HACEMOS EL TEST DEL NUMERO DE PAISES POR CONTINENTES
  System.out.println("");
  indicarPaises(Continentes.AFRICA);
  
  public static void indicarPaises(Continentes continentes) {
  
   switch(continentes) {
   //PODEMOS USAR ALGUN VALOR CONSTANTE DE LA ENUMERACION
    case AFRICA:
      System.out.println("Nro Paises en: " + continentes + " : " + continentes.getPaises()); 
   }
  }
  
 
 }

 ```
 
 Como podemos observar, el uso básico es de las constantes de una enumeración es
el mismo que hemos estudiado, por ejemplo, para acceder a alguna de las
constantes especificamos el nombre de la enumeración seguido del nombre de la
constante, por ejemplo: Continentes.AMERICA, y si deseamos acceder a los
atributos de cada constante definida, podemos llamar el método para recuperar el
atributo de cada constante, por ejemplo: Contienentes.AMERICA.getPaises()

Con esto podemos observar que el uso del tipo enumeraciones puede ser más
completo que simplemente asociar algunas constantes, sino que también podemos
definir atributos y por tanto agregar métodos para recuperar los atributos para cada
una de las constantes definidas de una enumeración.
 
 
```JAVA
public class EjemploEnumeraciones {

 public static void mian(String[] args) {
 
  //IMPRIMIR LOS CONTINENTES
  System.out.println("");
  imprimirContinentes();
  }
 
 
 public static void imprimirContinentes() {
  //UTILIZAMOS UN FOREACH
  for(Continentes c: Contienentes.values()) {
   System.out.println("Continente: " + c + " continente " + c.getPaises() + " paises");
  }
  
 }
 
}

  
```
   
   El método values se agrega por default cada que creamos una enumeración. El
objetivo de este método es que nos regrese una lista de cada una de las constantes
definidas en una enumeración.

En el código podemos ver en el método imprimirContinentes, el uso de este
método, apoyados de un ciclo forEach, lo que hacemos es definir una variable de
tipo enumeración que estas utilizando, en este caso Continentes c, y
posteriormente indicamos los valores de la enumeración llamando precisamente al
método Continentes.values().

Una vez que estamos iterando cada uno de los elementos, tenemos la variable c
para recuperar el atributo de la constante que estamos iterando, por ello podemos
pedir el método c.getPaises para recuperar el número de países del continente
seleccionado y si queremos imprimir el continente que estamos iterando
simplemente usamos la variable c definida en el ciclo forEach.



 
 ---

