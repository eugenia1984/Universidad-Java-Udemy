# Módulo 6 - Manejo de Colecciones en Java

---

## Manejo de Colecciones en Java


Un **tipo generico** en Java es como un tipo **comodín** en el cual cuando definimos la clase no indicamos el tipo de dato que va a almacenar o utilizar nuestra clase sino que hasta el momento en que creamos un objeto de esta clase entonces es que vamos a especificar el tipo de dato que vamos a utilizar.


Tipos genéricos que se pueden utilizar:

| Nombre Tipo Genérico | Significado del Tipo Genérico |
| -------------------- | ----------------------------- |
| E | Element (utilizado generalmente por el framework de Colecciones Java) |
| K | Key (llave utilizada en mapas) |
| N | Number(utilizado para números) |
| T | Type (representa un tipo, una clase) |
| V | Value (representa un valor, tambien se usa en mapas) |
| S, U, V, etc. | usado para representar otros tipos |

Ejemplo en codigo:

El **atributo** es de tipo **T** generico

EL **constructor** recibe una variable de tipo generico **T**

con el método **obtenerTipo** mando a imprimir al tipo de objeto utilizando los métodos **.getClass()** y **.getSimpleName()**

```JAVA
package genericos;
 
public class ClaseGenerica<T> { //el tipo del atributo no lo conozco hasta que lo utilizo por eso lo nombro con T de tipo  
    private T objeto;  
    
    public ClaseGenerica(T objeto){  
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){  
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName() );
    }
    
}
```


---

## Colecciones Genéricas en Java

## ¿ Cómo creo un objeto a partir de **una clase genérica ?

A partir de mi clase ClaseGenerica quiero instanciar un nuevo objeto.

En mi main voy a crear un nuevo objeto a partir de **ClaseGenerica** y entre pico parentesis (anotacion diamante) voy a indicar el tipo de Objeto, aca no pueden ser primitivos, no puedo tener *int* sino que tengo **Integer** y nombro a la variable.

Instancio una nueva **new** **ClaseGenerica** y entre los paréntesis ya le asigno un valor entero.

```JAVA
 ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
 ```
 
 Se llama al constructor:
 
 ```JAVA
 public ClaseGenerica(T objeto){  
        this.objeto = objeto;
    }
```

Y se hace un autoboxing se convierte a un tipo Integer porque asi lo especificamos en la variable generica objetoint

Y lo mando a imprimir:

```JAVA
objetoInt.obtenerTipo();
```

Al ser generica puedo instanciar otro objeto de tipo String y mandarlo a imprimir:

```JAVA
ClaseGenerica<String> objetoString = new ClaseGenerica("Euge");
objetoString.obtenerTipo();
```
 
 Y veo por consola -> ``` El tipo T es: String ```
 
---

## Generics utilizando el API de COLLECTIONS

Todo el API de COLLECTIONS soporta tipos genéricos.

Entonces en el main:

-Creo la lista definiendo el tipo entre los pico parentesis aclaro **String** e inicializando el objeto

-Agrego elementos con el metodo -> .add(String), ahora en ve de tener .add(object) ya tengo String porque lo defini antes. Entonces si ahora entre los parentesis quiero agregar enteros me va a dar errores,  así valido en tiempo de compilación y cuando agrego los alementos, también los recupero directo, sin tener que convertir (porque antes tenia que hacer: ```String elementos = (String)miMapa.get("valor1");```).

```JAVA
List<String> miLista = new ArrayList<>(); 
        miLista.add("Lunes");
        String elemento = miLista.get(0);
        System.out.println(elemento);
```

Y si quisiera mandar a imprimir tengo que modificar mi metodo **imprimir** que tiene elementos de tipo *object* y necesito de tipo **String** :

```JAVA
 public static void imprimir(Collection<String> coleccion){
      coleccion.forEach((elemento) -> {
            System.out.println("elemento = " + elemento);
      }); 
}
```

Si quiero que sea más generico lo devuelvo como estaba en object -> ```public static void imprimir(Collection coleccion){...}```


Puedo convertir mi **Set** en **Generic**

```JAVA
Set<String> miSet = new HashSet<>(); 
```


Puedo convertir mi **Map** en **Generic**, en este caso debo indicar el tipo tanto para la *key* como para el *value* de manera separada entre coma.

```JAVA
Map<String, String> miMapa = new HashMap<>(); 
```

Y ya no tenog que hacer ninguna conversion -> ```String elementos = miMapa.get("valor1");```

Todos estos ejemplos los hice de tipo String, pero pueden ser de otro tipo, hicimos todos de tipo String para usar en todos el mismo método imprimir().

En mi método imprimir si quería utilizar el for esch normal en vez de Object tengo que tener String

```JAVA
for(String elemento : coleccion) {
   System.out.println("elemento = " + elemento);
}
```

---
