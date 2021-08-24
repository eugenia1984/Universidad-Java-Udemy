# Lección 4 - Uso de Clases Abstractas e Interfaces en Java

---

## Clases ambstractas


La clase abstracta tiene la palabra reservada **abstract** y tiene métodos definidos sin implementación, son los **metodos abstractos**.

Pero si una clase contine **por lo menos UN metodo abstracto entonces toda la clase debe marcarse como abstracta**. Incluso se pueden crear clases abstractas que no tengan metodos abstractos, pero lo común es que al menos un método de los que tiene sea abstracto. La clase hija **debe tener el metodo abstracto de la clase padre** y ella misma lo puede definir, o lo puede seguir manteniendo abstracto (en este claso la clase hija tambien debe ser abstracta) si es que de ella van a heredar otras clases hijas que si determinen el comportamiento del metodo.

Voy a tener dos clases:

CLASE PADRE: que **no** define comportamiento. Ya uqe una figura geometrica es muy general y no sabriamos que figura dibujar.

```JAVA
public abstract class FiguraGeometrica{
  abstract void dibujar();
}
```

CLASE HIJA: en cambio la clase hija ya es una clase rectangulo, se que dibujar, ella va a definir el comportamiento dle metodo dibujar.

```JAVA
public class Rectangulo extends FiguraGeometrica {
  void dibujar(){
    //comportamiento de la subclase
  }
}
```


---

## Diferencias entre Clases Abstractas e Interfaces

---

## Declaración y uso de Clases Abstractas

---

## Manejo de Interfaces en Java y cuándo utilizarlas
