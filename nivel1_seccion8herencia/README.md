# Lección 8 - Herencia en Java

El concepto es muy parecido a la herencia del mundo real, los **hijos** **heredamos** muchas *características* de los  **abuelos** y **padres**. <br>

Ejemplo de herencia en Java.

Voy a tener una clase PERSONA con sus atributos privados y sus GEtters y Setters.: <br>

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

Y las clases EMPLEADO y CLIENTE que van a extender de la clase PERSONA, van a heredar de ella ( van a tener sus características particulares y van a heredar de Persona). <br>

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

En Java solo hay **herencia simple**, no hay *herencia multiple* como en otros lenguajes. <br>

De este modo todas las propiedades de Persona son disponibles en Empleado. <br>

```
///EXTENDS me indica que Empleado hereda de Persona
public class Empleado extends Persona{

}
```



## Uso de superclases y subclases en Java

Las **clases hijas** acceden a los constructores de su clase padre mediante la palabra reservada **super**. <br>

Y dependiendo de los argumentos que se pasen por *super* es el constructor que se va autilizar: <br>
-Si no se pasan argumentos se utiliza el constructor de la clase padre vacío. <br>
-Si se pasa un argumento se utiliza el constructor de la clase padre con un argumento. <br>
Y así cada constructor que deseamos utilizar. <br>

Si una clase va a ser **clase padre** entonces sus atributos son **protected** para que sean heredados por sus **clases hijas**. <br>


Si en la **clase hija** quiero tener un *constructor* con lso atributos de la **clase padre**, entonces debo utilizar la palabra reservada *super*.

```
public Empleado(String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
    }
```

Utilizo el constructor con un argumento (nombre) para poder inicializarlo. Se recibe el argumento, desde la clase *empleado* y a su vez el argumento de nombre se va a propagar hacia la clase padre.<br>

El atributo contadorEmpelado es *static* por lo que se asocia a la clase, no a los objetos. <br>
También puedo anteponer el nombre de la clase para saber que es una variable estática. <br> 
```
   public Empleado(String nombre, double sueldo) {
       super(nombre);
       this.idEmpleado = ++Empleado.contadorEmpleado; 
       this.sueldo = sueldo;
    }
```


💻 Se puede ver todo el ejercicio en código en la carpeta **herencia** donde tenemos a la **clase padre** *Persona* y a sus clases hijas *cliente* y *empleado*. <br>

