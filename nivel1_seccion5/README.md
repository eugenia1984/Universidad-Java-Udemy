# Lección 5 - Programación Orientada a Objetos

## Introducción a la Programación Orientada a Objetos (POO)

Una **CLASE** es una plantilla , que tiene **ATRIBUTOS** y **MÉTODOS**, y de la cual se pueden CREAR (INSTANCIAR) nuevos **OBJETOS** .<br>

Por ejemplo tengo la CLASE PERSONA, con sus atributos (nombre, apellido, teléfono ) y métodos (para recuperar al edad de la persona y modificarla). <br>

En los programas definimos las clases, y luego creamos objetos para trabajar con ellos, asignarles valores o hacer cálculos. <br>
La clase define los atributos y métodos de manera genral y en el objeto le asigno los valores. <br>

Los nombres de las clases se declaran en **UpperCamelCase** . <br>

### Ejemplo con diagrama general de una clase:

**Persona**  (nombre de la clase) <br>

(los ATRIBUTOS ) <br>
-nombre: String <br>
-genero: char <br>
-ocupacion: String <br>

(los MÉTODOS ) <br>
( los GETTERS ) <br>
obtenerNombre: String <br>
obtenerGenero() : String<br>
obtenerOcupacion(): String <br>
( los SETTERS ) <br>
modificarNombre(nombre : String ) <br>
modificarGenero( genero : String )<br>
modificarOcupacion( ocupacion: String ) <br>


---

## Manejo de Clases en Java


En la **CLASE MAIN** voy a ejecutar mi programa, acá vy a instanciar nuevos OBJETOS de mi clase y les puedo asignar valores. <br>
La clase main la distingo porque tengo: <br>

```
public static void main(String[] args) {

}
```

Tengo otra CLASE en la cual están los atributos y métodos (constructores, getters, setters, y métodos). <br>


:computer: ver la carpeta **clase** que tiene el paquete CLASE con los clases:  **Persona.java**  y **PruebaPersona** (donde está el método main) . <br>

---

## Uso de Objetos en Java

---
