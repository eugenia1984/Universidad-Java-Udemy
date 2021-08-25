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

Me creo la clase **OperacionExcepcion** que va a *extender* de **Exception** por lo que es una checkEception.

Y dentro tengo el metodo **OperacionException** que lo que hace es mandar un mensaje.

```JAVA
public class OperacionExcepcion extends Exception { //va a ser del tipo checkException
    //se manda un mensaje que se envia a la clase Excepcion(clase padre)
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
}
```

Luego me creo mi clase **Aritmetica** que va a tener el metodo **division** que es STATIC (voy a poder acceder a el desde otra clase) y tengo **throws OperacionExcepcion** lo que me avisa que puede lanzar (throw) una excepcion.

Y dentro del método efectivamente lanzo la excepcion:

**throw new OperacionExcepcion("Division entre cero"); **

Lo que tengo como String es el mensaje que voy a mandar si el metodo **division** tiene el error.

Con **.getMessage()** puedo acceder directo al mensaje


```JAVA
import excepciones.OperacionExcepcion;

public class Aritmetica {
//throws OperacionExcepcion -> me avisa que puede lanzar una excepcion del tipo OperacionExcepcion
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        //si denominador es igual a 0 voy a tener excepcion
        if (denominador == 0) {
            throw new OperacionExcepcion("Division entre cero"); 
        //aca lanzo la excepcion que la mando como mensaje a OperacionExcepcion
        } 
        //si el denominador no es 0 ->  puedo hacer la divisionsin ningun problema
        return numerador / denominador;
    }
}
```

Y entonces en mi programa main:

```JAVA
//importo Aritmetica y podria tambien importar el metodo division que es estatico
import aritmetica.Aritmetica; 


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        try{
            //De haber importado division ->
            //resultado = division(resultado, resultado);
            resultado = Aritmetica.division(10, 0);
        } catch(Exception e) {
        //Mando a imprimir la pila de excepciones por consola con System.out
        //no es requerido el System.out pero el IDE lo sugiere
            e.printStackTrace(System.out);
            //Si quiero mandar a imprimir de manera individual el mensaje uso getMessage
            System.out.println(e.getMessage());
        }
    //El resultado = 0 no es el resultado de la division sino el valor de la variable
        System.out.println("resultado = " + resultado);
    }
    
}
```

Y la clase **Test Excepciones** me va a mostrar por pantalla que mi excepcion ahora es del tipo -> **OperacionExcepcion**

```
excepciones.OperacionExcepcion: Division entre cero
	at aritmetica.Aritmetica.division(Aritmetica.java:11)
	at test.TestExcepciones.main(TestExcepciones.java:17
```

---

💻 [ver ejemplo -> **ManejoExcepciones2**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion5_excepciones/ManejoExcepciones2)

---

Modifico a **OperacionExcepcion** para ser del tipo uncheckException por extender de RuntimeException -> **extends RuntimeException**

Y la diferencia la voy a ver en **el uso de la clase** ya que el compilador no nos obliga a procesar ese tipo de excepciones, entonces en el metodo que arrojo la excepcion.

En el metodo de la clase Aritmetica ya **no** tengo que aclarar -> throws OperacionExcepcion



    

---
