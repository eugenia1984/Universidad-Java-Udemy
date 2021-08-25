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

## Uso de try-catch y propagación de Excepciones

---
