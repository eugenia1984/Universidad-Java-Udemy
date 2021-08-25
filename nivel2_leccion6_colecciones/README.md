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

---

# Map
