# Lección 8 - Herencia en Java

El concepto es muy parecido a la herencia del mundo real, los **hijos** **heredamos** muchas *características* de los  **abuelos** y **padres**.

Ejemplo de herencia en Java.

Voy a tener una clase PERSONA con sus atributos privados y sus GEtters y Setters.: 

Persona <br>
/////////////////<br>
nombre: String<br>
genero: char<br>
edad: int<br>
direccion: String<br>
//////////////////<br>
getNombre(): String<br>
getNombre(String): void<br>
getGenero(): char<br>
setGEnero(char): void<br>
getEdad(): int<br>
setEdad(int): void<br>
getDireccion(): String<br>
setDireccion(String): void<br>

Y las clases EMPLEADO y CLIENTE que van a extender de la clase PERSONA, van a heredar de ella ( van a tener sus características particulares y van a heredar de Persona). 

Empleado<br>
////////////////////<br>
idEmpleado: int<br>
sueldo: double<br>
/////////////////////<br>
gerIdEmpleado(): int<br>
getSueldo(): double<br>
setSueldo(double): void<br>

Cliente<br>
////////////////////<br>
idCliente: int<br>
fechaRegistro: Date<br>
vip: boolean<br>
///////////////////<br>
setIdCliente(): int<br>
getFechaRegistro(): Date<br>
setFechaRegistro(Date): void<br>
idVip(): boolean;<br>
setVip(boolean): void<br>




## Manejo de Herencia en Java

En Java solo hay **herencia simple**, no hay *herencia multiple* como en otros lenguajes.

De este modo todas las propiedades de Persona son disponibles en Empleado. 

```JAVA
///EXTENDS me indica que Empleado hereda de Persona
public class Empleado extends Persona{

}
```

En mi **clase Empleado** en vez de utilizar *toString* puedo utilizar **String Builder** podria modificarlo.

Si quiero utilizar:  **sb.append(", sueldo=").append(this.getSueldo());** puedo hacerlo porque el método se hereda porque es publico en la clase padre. 

Pero lo más común es que los **atributos de la clase padre estén marcados como protegidos** asi que podemos acceder directamente desde las clases hijas, entonces tengo: **  sb.append(", sueldo=").append(this.sueldo);**

```JAVA
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{id Empleado =").append(idEmpleado);
        sb.append(", nombre=").append(this.getNombre());
        sb.append(", sueldo=").append(this.getSueldo());
        sb.append('}');
        return sb.toString();
    }
```

Y como los atributos son de la clase padre, puedo directamente contatenar sus atributos. <br>

```JAVA
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{id Empleado =").append(idEmpleado);
        sb.append(", sueldo=").append(this.getSueldo());
        sb.append(", ").append(super.toString()).append("}");
        sb.append('}');
        return sb.toString();
    }
```

## Uso de superclases y subclases en Java

Las **clases hijas** acceden a los constructores de su clase padre mediante la palabra reservada **super**. 

Y dependiendo de los argumentos que se pasen por *super* es el constructor que se va autilizar: 

-Si no se pasan argumentos se utiliza el constructor de la clase padre vacío. 

-Si se pasa un argumento se utiliza el constructor de la clase padre con un argumento. 

Y así cada constructor que deseamos utilizar. 

Si una clase va a ser **clase padre** entonces sus atributos son **protected** para que sean heredados por sus **clases hijas**. 


Si en la **clase hija** quiero tener un *constructor* con lso atributos de la **clase padre**, entonces debo utilizar la palabra reservada *super*.

```JAVA
public Empleado(String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
    }
```

Utilizo el constructor con un argumento (nombre) para poder inicializarlo. Se recibe el argumento, desde la clase *empleado* y a su vez el argumento de nombre se va a propagar hacia la clase padre.

El atributo contadorEmpelado es *static* por lo que se asocia a la clase, no a los objetos. 

También puedo anteponer el nombre de la clase para saber que es una variable estática. 

```JAVA
   public Empleado(String nombre, double sueldo) {
       super(nombre);
       this.idEmpleado = ++Empleado.contadorEmpleado; 
       this.sueldo = sueldo;
    }
```

---

## Orden de creación de objetos cuando se trabaja con herencia


1-La clase Cliente con su constructor **super** que inicializa la inforamación de la clase padre. 

2-Los atributos particulares de la clase Cliente (la clase hija). 

Si no tiene una clase padre se va a llamar al constructor de la clase **Object**. 

---

# Sobrecarga de constructores

Cuando tenemos más de un constructor. Por ejemplo cuando tengo el constructor vacío y el constructor con argumentos, puedo tener más de un constructor con argumentos.

```JAVA
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
    //super();
    this.idEmpleado = ++Emplado.contadorEmpleado;
    }
    
    public Empleado(String nombre, double sueldo){
    //super(nombre);
    this();
    this.nombre=nombre;
    this.sueldo= sueldo;
    }
}
```

---

💻 Se puede ver todo el ejercicio en código en la carpeta [**herencia**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion8herencia/herencia) donde tenemos a la **clase padre** *Persona* y a sus clases hijas *cliente* y *empleado*. 

Y la carpeta [**test**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion8herencia/test) con la clase **TestHerencia** donde instancio un nuevo Empleado y lo mando a imprimir.

Y también se puede ver el modelo UML. 


---


# Sobrecarga de métodos

Es definir dos o más veces el método a utilizar, pero poniendo el mismo nombre. 

Y para hacer diferencia, ya que se llaman iguales, la diferencia lo hace la cantidad de argumentos. 

Tengo un primer método, y luego debe tener al menos un segundo método, para el cual el tipo de retorno puede variar y también el modificador de acceso (public), lo que si no puede ser más restrictivo, si mi primer método es *public* entonces mi segundo método debe ser *public* (no puede ser private / protected / defualt , sería más restrictivo).  Y el tipo de retorno puede variar. Lo que si debe cambiar es el **tipo de dato**.


En mi clase **Operaciones** tengo dos métodos **sumar** pero uno recibe como parámetros números **enteros** y otro recibe como parámetros números **doubles**. 


```JAVA
package operaciones;


public class Operaciones {
    
//Es static para no tener que instanciar objetos de la clase    
    public static int sumar(int a, int b) {
        System.out.println("sumar(int a, int b)");
        return a+b;
    }
    
    public static double sumar(double a, double b){
        System.out.println("sumar(double a, double b)");
        return a+b;
    }

}
```

En mi *clase principal* voy a llamar a mis dos métodos: 

```JAVA
package testOperaciones;

import operaciones.Operaciones;

public class TestOperaciones {
    
    public static void main(String[] args) {
        
        int resultado = Operaciones.sumar(1, 2);
        System.out.println("resultado = " + resultado);
        
        System.out.println("-------------------------");
        
        double resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado2 = " + resultado2);
    }
    
}

```

---

💻 Se puede ver todo el ejercicio en código en la carpeta [**SobrecargaMetodos**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion8herencia/SobrecargaMetodos) en el paquete **operaciones** y en la clase **Operaciones.java**. <br>


