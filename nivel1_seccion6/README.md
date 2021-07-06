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

## This

Con el método **this** se puede acceder a los atributos y los métodos del objeto. <br>
Hay que estar dentro de la clase para poder utilizarlo, solo existe dentro de la clase. <br>

Por ejemplo: <br>
```
public int sumarConArgumentos(int a, int b) {
  this.a = a;
  this.b = b;
  return a + b;
}
```

En **this.a** tengo un ATRIBUTO de mi clase y en (**int a**) tengo un ARGUMENTO que estoy recibiendo en el método. <br>


---

## Constructores

Se crea un objeto sin icializar valores con **CONSTRUCTOR VACIO**. Por ejemplo: <br>

```
Aritmetica variable1 = newAritmetica(); 
```

En cambio con el **CONSTRUCTOR NO VACIO** se crea y se le asigna valor. Por ejemplo : <br>

```
Aritmetica variable2 = new Aritmetica(10); 
```

Las clases deben tener ambos constructores. <br>

Los constructores tienen el mismo nombre que la clase. <br>

Sin los constructores no se podrían instanciar nuevos objetos.  <br>

Un ejemplo de constructor vacío: <br>

```
public Aritmetica(){
}
```

El CONSTRUCTOR VACIO es un método especial, que solo se lo llama al momento de crear el nuevo objeto ( cuando INSTANCIO, cuando utilizo **new**). <br>


---

# SOBRECARGA DE CONSTRUCTORES

Se agrega uno o más constructores a la clase. <br>
Cuando se utiliza el constructor vacío se omite la inicialización de valores, para luego agregarlos manualmente. <br>

Se puede agregar un SEGUNDO CONSTRUCTOR ( sobrecarga). <br>

Un ejemplo con un nuevo método Aritmetica, peor en este caso con argumentos: <br>

```
public Aritmetica(int arg1 , int arg2) {
  this.a = arg1;
  this.b = arg2;
}
```

Si en mi clase main quiero utilizar este constructor con argumentos: <br>

```
Aritmetica aritmetica2 = new Aritmetica(7, 12);
```

Y mando a imprimir estos atributos: <br>

```
System.out.println("aritmetica2 a:" + aritmetica1.a);
System.out.println("aritmetica2 b:" + aritmetica1.b);
```

---

Si no tenemos ningún constructor el sistema agregar por default el constructor vaío, pero si ya tengo otros constructores con argumentos el sistema no me va a agregar el constructor vacío (aca lo tengo que agregar yo).

---

