# Final

Uso de la palabra final en Java, tiene distintos significados dependiendo donde se aplica: <br>

-**en variables** : evita cambiar el valor que alamcena la variable. Es una CONSTANTE cuando se combina con el modificador de acceso *static*. <br>
Por ejemplo Math.PI. <br>

Si por ejemplo defino: <br>
```
final int miVariable = 10;
```
Al tener *final* no puedo reasignarle un nuevo valor, si lo intento voy a tener un error. <br>

💻 ver la carpeta **PalabraFinal** con el proyecto *PalabraFinal* y el paquete *test* con su clase *TestFinal.java*. <br>


-**en clases**: evita que se cree una subclase. No va a tener clases hijas.<br>

Si por ejemplo tengo mi clase **Persona** con la palabra reservada **final**. <br>

```
public final class Persona {
    
    
}
```

Entonces, cuando quiero que la clase **Empleado** herede de la clase **Persona** no lo voy a poder hacer, me va a dar error de que no puede heredar, al hacer: <br>

```
public class Empleado extends Persona{
    
}
```

-**en métodos**: evita que se modificque la definición de un método desde una subclase.E comportamiento en al clase **hija** no podrá modificar el comportamiento en la clase **padre**.<br>

Si por ejemplo tengo mi clase padre **Persona** con un método con **final**. <br>

```
public class Persona {
    
    public final void imprimir(){
        System.out.println("Método imprimir");
    }
}
```

Y quiero en mi clase Empleado que hereda de Persona, tener el mismo método para sobreescribirlo: <br>

```
public void imprimir(){
        System.out.println("Método imprimir desde clase hija");
    }
    
```

Voy a tener **error** porque justamente no puedo sobreescribirlo al tener FINAL en su clase padre. <br>


en cambio si el método de mi clase padre no tiene final: <br>

```
public class Persona {
    
    public void imprimir(){
        System.out.println("Método imprimir");
    }
}
```

Mi clase hija Empleado si puede sobreescribir el método. <br>

```
public void imprimir(){
        System.out.println("Método imprimir desde clase hija");
    }
    
```

💻 ver la carpeta **PalabraFinal** con el proyecto *PalabraFinal* y el paquete *domain* con su clase *Persona.java* y *Empleado.java* que hereda de la clase persona. <br>

---


