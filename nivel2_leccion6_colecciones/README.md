# Módulo 6 - Manejo de Colecciones en Java

---

## Uso de las colecciones en Java

API DE COLECCIONES EN JAVA

```
                    java.util
                    
       
        Collection                 Map
           ^                        ^
           |                        |
     --------------                 |
     |            |                 |
    Set         List                |
     ^           ^                  |
     |           |                  |
     |      --------------          |
     |      |            |          |
  HashSet  ArrayList  Vector     HashMap
   
```

Tenemos **clases que utilizan la Interface de COLLECTION** -> Set y List, y posteriormente dentro de esas interfaces existen clases que implementan estas interfaces, como: HashSet, ArrayList, Vector.

Tenemos **clases que utilizan la Inteface de MAP** -> HashMap, maneja el concepto de **llave - valor** -> **key** - **value**

---

## Manejo de List, Set y Map y la aplicación de cada estructura

## List

Una LISTA es similar al array porque puedo agregar varios elementos a mi lista, la ventaja es que **puede crecer dinamicamente**, no tengo que darle una dimensión ya que va variando (es una de las diferencias con el array).

Otra diferencia es que en la List **puedo tner elementos duplicados**


#### ¿ Cómo la creo ?

Siempre recordar importar -> ```import java.util.*;``` como utilizo varios voy a tener .*

Definiendo el tipo (**List**) e inicializo el objeto (**new ArrayList()**)

```
List miLista = new ArrayList();
```

### ¿ Como le agrego objetos?

Con el método **.add**, entre paréntesis agrego el Objeto, puede ser de diverso tipo, en el ejemplo uso tipo String.

```JAVA
miLista.add("Lunes");
miLista.add("Martes");
miLista.add("Miercoles");
miLista.add("Jueves");
miLista.add("Viernes");
miLista.add("Sabado");
miLista.add("Domingo");
```

Otra característica es que la **List mantiene el orden en el cual se agregan los elementos**, a diferencia de los **Set que no guarda el orden de los elementos conforme se vayan agregando**.


### ¿ Cómo imprimo la lista ?

Con el ciclo FOR EACH: **for** -> for( **variable_que_almacena_los_elementos_a_recorrer_en_la_List** : **lista a iterar**){...}

Paso la lista **miLista** como argumento en el ciclo for

```JAVA
for(Object elemento : miLista){
   System.out.println("elemento = " + elemento);
}
```

Y en Java a partir de la versión 8 se puede usar lambdas o **arrow function**

```Java
miLista.forEach((elemento) -> {
            System.out.println("elemento = " + elemento);
        });
```

Como parametro recibe **elemento** y luego de la flecha **->** recibe **el cuerpo de la funcion entre {}**

No se usar *var* ni se indica *Object* en : miLista.forEach((**elemento**) , de manera automatica esta variable *elemento* es del tipo que es la colección, en este caso son todos de tipo Object.

---

❗ [ver ejemplo de List en **ApiColecciones**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion6_colecciones/ApiColecciones)

---

# Set


Similar a la lista, con la difernecia de que **sus elementos no mantienen un orden** por lo que cuando la mandamos a imprimir no vamos a ver los elementos en el mismo orden que los ingresamos, cada vez que mandemos a imprmir se ven con distinto orden.

**Set** es más rápido que **List** para agregar elementos, debido a que Set no debe mantener el orden. Por lo que si no nos interesa guardar un orden se recomienda usar SET que va a ser más rápido.


Otra diferencia con List es que el Set **no puede tener elementos duplicados**, is agrego dos veces el mismo elemento, este último elemento a agregar nunca va a ser agregado, solo va a tener un elemento el set NUNCA DUPLICA.

#### ¿ Cómo la creo ?

```JAVA
Set miSet = new HashSet();
```

### ¿ Como le agrego objetos?

Con el método **.add()**, entre paréntesis agrego el Objeto, puede ser de diverso tipo.

Como también es clase hija de Collection tambien hereda el método **.add()**

Creo una lista SET con los meses el año:


```JAVA
  miSet.add("Enero");
  miSet.add("Febrero");
  miSet.add("Marzo");
  miSet.add("Abril");
  miSet.add("Mayo");
  miSet.add("Junio");
  miSet.add("Julio");
  miSet.add("Agosto");
  miSet.add("Septiembre");
  miSet.add("Octubre");
  miSet.add("Noviembre");
  miSet.add("Diciembre");
```

### ¿ Cómo imprimo la lista ?

En este caso también con un for each mejorado o arrow function.

Pero para tener otro modo voy a crear un método, para luego invocarlo, lo hago desde lo más genérico, es decir pasando por parámeto un objeto de tipo **Collection** y lo hago **static** para poder llamarlo de cualquier clase y paquete.


```JAVA
  public static void imprimir(Collection coleccion){
        for(Object elemento : coleccion) {
            System.out.println("elemento = " + elemento);
        }
    }
```

Entonces voy a imprimir mi Set invocando al método:

```JAVA
 public static void imprimir(Collection coleccion){
      for(Object elemento : coleccion) {
          System.out.println("elemento = " + elemento);
      }
}
```

Y otra manera de hacer el mismo método es con arrow function:

```JAVA
 public static void imprimir(Collection coleccion){
      coleccion.forEach((elemento) -> {
          System.out.println("elemento = " + elemento);
      });
}
```

Y voy a ver que no están en el mismo orden que los fui ingresando:

```
elemento = Junio
elemento = Diciembre
elemento = Noviembre
elemento = Octubre
elemento = Enero
elemento = Abril
elemento = Marzo
elemento = Febrero
elemento = Mayo
elemento = Julio
elemento = Agosto
elemento = Septiembre
```

Y si lo vuelvo a mandar a imprmir puedo tneer otro orden

---

❗  [ver ejemplo de List en **ApiColeccionesSet**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion6_colecciones/ApiColeccionesSet)

---

# Map

## HashMap

Un MAPA es una COLECCION DE ELEMENTOS almacenados en el concepto LLAVE - VALOR, por cada llave que se almacene se le asocia un valor.

## ¿ Como lo declaro ?

```JAVA
 Map miMapa = new HashMap();
 ```
 
 
 ## ¿ Cómo agrego elementos ?
 
 En este caso no heredo de la interface Colection por lo que no puedo usar **.add()**
 
 Como heredo de la interface map voy a tener el método **.put(Object key, Object value)** y voy a tener que ir agregando de a par KEY - VALUE (llave - valor). Se puede pensar como un diccionario en el cual se agrega un termino y se le asocia un valor a dicho termino (key). Se puede asociar cualquier tipo Object a la *key*.
 
 
```JAVA
miMapa.put("valor1","Euge");
miMapa.put("valor2", "Agus");
miMapa.put("valor3", "Ana");
```

## ¿ Cómo accedo a los elementos ?


Mediante el metodo **get** y debo indicar **el valor de la llave** -> **String elemento = miMapa.get("valor1");**

Sin embargo mi variable elemento es de tippo String tengo que hacer un downcasting y pasar de tipo **Object** a tipo **String**

```JAVA
 String elemento = (String)miMapa.get("valor1");
```

Si quiero recuperar el valor de **todas las llaves** -> **miMapa.keySet();** y como regresa el Set de cada una de las llaves puedo recutilizar mi método imprmir() que maneja Collection (Set)

```JAVA
imprimir(miMapa.keySet());
```

Que invoca a:

```JAVA
 public static void imprimir(Collection coleccion){
      coleccion.forEach((elemento) -> {
          System.out.println("elemento = " + elemento);
      });
 }
```

Y por consola veo que al set un SET NO ME GARANTIZA RESPETAR EL ORDEN EN QUE FUERON AGREAGADOS por eso no tengo:

valor1

valor2

valor3

Sino que tengo:

```
elemento = valor1
elemento = valor3
elemento = valor2
```

Si quiero recuperar el valor de **todos los values** -> **miMapa.values()**

Y por pantalla veo:

```
elemento = Euge
elemento = Ana
elemento = Agus
```

---

❗  [ver ejemplo de List en **ApiColeccionesMap**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion6_colecciones/ApiColeccionesMap)
 
---
