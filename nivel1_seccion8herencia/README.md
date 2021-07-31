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


💻 Se puede ver todo el ejercicio en código en la carpeta **herencia**

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
