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


### Exception

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

### RuntimeException

Modifico a **OperacionExcepcion** para ser del tipo uncheckException por extender de RuntimeException -> **extends RuntimeException**

```JAVA
package excepciones;
//va a ser del tipo uncheckException por extender de RuntimeException
public class OperacionExcepcion extends RuntimeException { 
    //se manda un mensaje que se envia a la clase Excepcion(clase padre)
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
}
```

Y la diferencia la voy a ver en **el uso de la clase** ya que el compilador no nos obliga a procesar ese tipo de excepciones, entonces en el metodo que arrojo la excepcion, en la clase **Aritmetica** no es necesario tener throws OperacionExcepcion  en la firma del metodo.

En el metodo de la clase Aritmetica ya **no** tengo que aclarar -> **throws OperacionExcepcion**

```JAVA
public class Aritmetica {
//throws OperacionExcepcion -> me avisa que puede lanzar una excepcion del tipo OperacionExcepcion
    //no es necesario tener throws OperacionExcepcion  en la firma del metodo
    public static int division(int numerador, int denominador) {
        
        if (denominador == 0) {  //si denominador es igual a 0 voy a tener excepcion
            //igualmente la excepcion la creo solo que no la reporto en la firma dle metodo
            throw new OperacionExcepcion("Division entre cero"); 
        
        } 
        //si el denominador no es 0 ->  puedo hacer la division sin ningun problema
        return numerador / denominador;
    }
}
```


Y en **TestExcepciones** podría no tener el **try catch** y el IDE no me marca ningún problema, pero...al momento de ejecutarlo si lo voy a tener y se me interrumpe el proagrama.  Por consola veo:

```
Exception in thread "main" excepciones.OperacionExcepcion: Division entre cero
	at aritmetica.Aritmetica.division(Aritmetica.java:12)
	at test.TestExcepciones.main(TestExcepciones.java:17)
C:\Users\juan\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
```

---

💻 [ver ejemplo -> **ManejoExcepciones3**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion5_excepciones/ManejoExcepciones3)

---

### Ahora tenemos la duda ¿ qué tipo de excepcion manejamos ?

Al principio se recomendaba declarar las clases de tipo **Exception** utilizando excepciones de tipo **check Exception** pero ahora se recomienda usar excepciones dle tipo **RuntimeException** es decir las **uncheck Exception**, que limpian más nuestro código y sólo hacemos **try catch** de las excepciones que realmente estamos seguros que pueden suceder; y de no estar seguros que se arroje una excepcion entonces el código debe quedar lo más limpio posible.

Solo agrego clases **Exception** donde sea requerido, priorizo que sean **RuntimeException**

---

### Bloque finally

**Finally** es una palabra reservada que se utiliza al final del bloque **try catch**.

El bloque finally **se ejecuta siempre** independientemente de que ocurra una excepción o no.

Ejemplo en codigo:

```
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
	try{
             resultado = division(10, 0);
	} catch(Exception e){ 
	     System.out.println("Ocurrio un error");
             System.out.println(e.getMessage()); 
	} finally {
	     System.out.println("Se revisó la división entre cero");
	}
	System.out.println("resultado = " + resultado);
    }
    
}
```
Voy a ver:

```
Ocurrio un error
Division entre cero
Se revisó la división entre cero
```

Por consola siempre voy a ver el mensaje **Se revisó la división entre cero**

Este bloque **finally se utiliza para cerrar recursos**, por ejemplo si abrimos conexión a base de datos o a un archivo, con el finally lo cerramos.

Dentro del bloque **try** el erro podría arrojay una o **más excepciones**. Si queremos manejar más de una excepción, entonces **agrego todos los bloques catch que necesite** uno para cada excepción a procesar, se recomeinda **empezar a procesar las excepciones de menor jerarquía** asi puedo ir pasando de catch en catch hasta tener la excepción correcta.

Recordar que la clase **Exception** es la CLASE PADRE de todas las axcepciones, por llo que debe ir al final.

En codigo se ve así:


```
import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
	try{
             resultado = division(10, 0);
	} catch(OperacionExcepcion e) {
	     System.out.println("Ocurrio un error de tipo OperacionExcepcion");
	     System.out.println(e.getMessage()); 
	}catch(Exception e){ 
	     System.out.println("Ocurrio un error de tipo Exception");
             System.out.println(e.getMessage()); 
	} finally {
	     System.out.println("Se revisó la división entre cero");
	}
	System.out.println("resultado = " + resultado);
    }
    
}

---

