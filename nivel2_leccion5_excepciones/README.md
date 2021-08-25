# Lección 5 - Manejo de Excepciones en Java

---

## Procesando las excepciones en Java

Ejemplo de codigo de cuando quiero hacer una division por 0, voy a tener un error -> **ArithmeticException / by zero** y mi programa se va a interrumpir.

Con el **try** voy a intentar hacer la division, voy a tner el error y no la puedo hacer, entonces mi **catch** me atrapa el error y me lo maneja, para que mi prigrama no se interrumpa y pueda seguir.

```JAVA
package test;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        try{
            resultado = 10 / 0;
        } catch(Exception e) {
        //Mando a imprimir la pila de excepciones por consola con System.out
        //no es requerido el System.out pero el IDE lo sugiere
            e.printStackTrace(System.out);
        }
    //El resultado = 0 no es el resultado de la division sino el valor de la variable
        System.out.println("resultado = " + resultado);
    }
    
}
```
---

💻 [ver ejemplo -> **ManejoExcepciones1**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion5_excepciones/ManejoExcepciones1)
---

### Tipo  de excepciones en el API de Java

Las clases que heredan dle tipo **Exception** se conocen como **checkException**, y las tengo que manejar con un bloque **try catch** o la reporto en la firma del método, creando una clase personalizada.

Las clases que heredan del tipo **RunRimeException** se conocen como **uncheckException**, el compilador no nos obliga a agregar un bloque try y catch, son excepciones que ocurren al momento de ejecución, antes el IDE no nos va a marcar error, peor al ejecutar se va a cortar el programa.

**NullPointerException** es cualquier variable que quiera acceder a un atributo o método y no esté apuntando a ningún objeto válido y tenga asignado el valor de null; si intenta acceder a un atributo o método va a marcar la excepción del tipo NullPointerException. El compilador no sabe de esta excepción hasta que se ejecuta el programa.

```
             Exception
                 |
       ----------------------
       |                    |
 RunTimeException       SQLException
       |
 NullPointerException
```

---

## Uso de try-catch y propagación de Excepciones

---
