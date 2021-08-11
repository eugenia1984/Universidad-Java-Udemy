# Final

Uso de la palabra final en Java, tiene distintos significados dependiendo donde se aplica: 

-**en variables** : evita cambiar el valor que alamcena la variable. Es una CONSTANTE cuando se combina con el modificador de acceso *static*. 

Por ejemplo Math.PI. 

Si por ejemplo defino: 

```JAVA
final int miVariable = 10;
```

Al tener *final* no puedo reasignarle un nuevo valor, si lo intento voy a tener un error. 

Otro ejemplo es en mi clase padre *Persona* tengo el atributo MI_CONSTANTE que es una constante de tipo entera: 


```JAVA
public class Persona {
    
    public final static int MI_CONSTANTE = 1;
    
 }   
```

Entonces desde la clase de prueba *TestFinal.java* si llamo a mi clase Persona, se me va a importar domain.Persona, pero al intentar reasignarle un valor a la constante voy a tener **error**. 

Lo que si puedo hacer es llamar a mi clase *Persona* y llamar a *MI_CONSTANTE* e imprimirla tal cual la tengo, sin modificarla: 


```JAVA
package test;

import domain.Persona;

public class TestFinal {
    
    public static void main(String[] args) {
        
        //Persona.MI_CONSTANTE = 5;
        
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE); 
    }
    
}
```


-**en clases**: evita que se cree una subclase. No va a tener clases hijas.

Si por ejemplo tengo mi clase **Persona** con la palabra reservada **final**. 


```JAVA
public final class Persona {
    
    
}
```

Entonces, cuando quiero que la clase **Empleado** herede de la clase **Persona** no lo voy a poder hacer, me va a dar error de que no puede heredar, al hacer: 

```JAVA
public class Empleado extends Persona{
    
}
```

-**en métodos**: evita que se modificque la definición de un método desde una subclase.E comportamiento en al clase **hija** no podrá modificar el comportamiento en la clase **padre**.

Si por ejemplo tengo mi clase padre **Persona** con un método con **final**. 

```JAVA
public class Persona {
    
    public final void imprimir(){
        System.out.println("Método imprimir");
    }
}
```

Y quiero en mi clase Empleado que hereda de Persona, tener el mismo método para sobreescribirlo:

```JAVA
public void imprimir(){
        System.out.println("Método imprimir desde clase hija");
    }
    
```

Voy a tener **error** porque justamente no puedo sobreescribirlo al tener FINAL en su clase padre. 


En cambio si el método de mi clase padre no tiene final: 

```JAVA
public class Persona {
    
    public void imprimir(){
        System.out.println("Método imprimir");
    }
}
```

Mi clase hija Empleado si puede sobreescribir el método. 

```JAVA
public void imprimir(){
        System.out.println("Método imprimir desde clase hija");
    }
    
```

---

💻 ver la carpeta [**PalabraFinal**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion10final/PalabraFinal) con el proyecto *PalabraFinal* y el paquete *test* con su clase *TestFinal.java*. 

---

💻 ver la carpeta  [**PalabraFinal**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion10final/PalabraFinal) con el proyecto *PalabraFinal* y el paquete *domain* con su clase *Persona.java* y *Empleado.java* que hereda de la clase persona. <br>

---

## Uso de la palabra FINAL con OBJETOS

En mi clase Persona creo un atributo privado de tipo String: *nombre*. 

```JAVA
public class Persona {
     
    //Atributo privado
    private String nombre;
    
    //Getter y Setter del atributo nombre
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
```

Y en mi clase *TestFinal* creo una variable **final** de tipo **Persona** llamada **persona1** que es una nueva insancia de la clase Persona, que al no tener los constructores con parámetros se crea con el constructor por defecto. 

Al ser de tipo final, si le quiero agregar una nueva referencia de un nuevo objeto, no puedo. 

Lo que si puedo hacer es settear el atributo nombre, que por default es null, y mandarlo a imprimir por consola con el getter.

Es decir que se puede modificar el contenido al objeto al cual esta apuntando. 


```JAVA
package test;

import domain.Persona;


public class TestFinal {
    
    public static void main(String[] args) {
        
        final Persona persona1 = new Persona();
        //persona1 = newPersona();
        persona1.setNombre("Eugenia");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        
        //Y le puedo settear un nuevo nombre
        persona1.setNombre("Ana");
        System.out.println("persona1 nombre modificado: " + persona1.getNombre())
        
    }
    
}
```
