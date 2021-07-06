# Lección 6 - Funciones en Java

---

## Declaración de Métodos o Funciones en Java

Los **métodos** los declaro en mi clase, y luego en la calse main, donde ejecuto el programa, voy primero a instanciar con la clase nuevos objetos, y a estos le asigno los valores y ejecuto los métodos. <br>

Los métodos pueden solo mostrar un mensaje o pueden hacer algún cálculo y tener el return. <br>



En el caso de que quiera sumar con argumentos, lo que NO modifica los atributos del objeto: <br>

```
public int sumarConArgumentos(int arg1, int arg2) {
  a = arg1;
  b = arg2;
  return a + b;
}
```

En este caso arg1 y arg2 son ARGUMENTOS. <br>

Entonces si dentro de mi clase PruebaAritmetica quiero usar este método: <br>

```
aritmetica1.sumarConArgumentos(5 , 8);
```

En este caso 5 y 8 son PARAMETROS, que s envian al método sumarConArgumentos que me devuelve un numero entero. <br>

---

## Uso y llamado de Funciones en Java

:computer: Ver los ejemplos en la carpeta **operaciones** tengo la clase principal **PruebaAritmetica.java** y la clase **Aritmetica.java** donde tengo mi clase con sus atributos y métodos. <br>

---

