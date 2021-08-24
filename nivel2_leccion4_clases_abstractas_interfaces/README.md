# Lección 4 - Uso de Clases Abstractas e Interfaces en Java

---

## Declaración y uso de Clases Abstractas


La clase abstracta tiene la palabra reservada **abstract** y tiene métodos definidos sin implementación, son los **metodos abstractos**.

Pero si una clase contine **por lo menos UN metodo abstracto entonces toda la clase debe marcarse como abstracta**. Incluso se pueden crear clases abstractas que no tengan metodos abstractos, pero lo común es que al menos un método de los que tiene sea abstracto. La clase hija **debe tener el metodo abstracto de la clase padre** y ella misma lo puede definir, o lo puede seguir manteniendo abstracto (en este claso la clase hija tambien debe ser abstracta) si es que de ella van a heredar otras clases hijas que si determinen el comportamiento del metodo.

Voy a tener dos clases:

CLASE PADRE: que **no** define comportamiento. Ya uqe una figura geometrica es muy general y no sabriamos que figura dibujar.

```JAVA
public abstract class FiguraGeometrica{
  abstract void dibujar();
}
```

**NO** puedo instanciar objetos a partir de la clase **abstracta**, solo voy a poder trabajar con las clases hijas.


CLASE HIJA: en cambio la clase hija ya es una clase rectangulo, se que dibujar, ella va a definir el comportamiento dle metodo dibujar.

```JAVA
public class Rectangulo extends FiguraGeometrica {
  void dibujar(){
    //comportamiento de la subclase
  }
}
```

💥 [ver ejemplo en **ClasesAbstractas**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel2_leccion4_clases_abstractas_interfaces/ClasesAbstractas)

---

## Diferencias entre Clases Abstractas e Interfaces

Una **interface** es parecida a una clase abdtracta en el sentido de que **los métodos de una interfaz tampoco tienen una implementación**, son métodos abstractos. Sin embargo una interfaz es un nuevo tipo en Java y todos sus metodos deben ser abstractos. 

Si tiene **atributos** estos son **CONSTANTES** son public final static.

Cuando las CARACTERISTICAS de la clase son muy parecidas hay RELACION DE HERENCIA y se usa una CLASE ABSTRACTA.

Cuando la relación entre clases no es tanto por características sino por COMPORTAMIENTO se unsa una INTERFACE.
Un ejemplo seria una base de datos MySQL y ORACLE que ambas tiene los metodos de crear, modificar y eliminar, que implementan el comportamiento de la interface.

---

## Manejo de Interfaces en Java y cuándo utilizarlas
