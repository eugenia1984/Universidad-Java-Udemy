# Lección 6 - Funciones en Java

---

## DECLARACIÓN DE MÉTODOS ( FUNCIONES )

Los **métodos** los declaro en mi clase, y luego en la calse main, donde ejecuto el programa, voy primero a instanciar con la clase nuevos objetos, y a estos le asigno los valores y ejecuto los métodos. 

Los métodos pueden solo mostrar un mensaje o pueden hacer algún cálculo y tener el return. 



En el caso de que quiera sumar con argumentos, lo que NO modifica los atributos del objeto: 

```JAVA
public int sumarConArgumentos(int arg1, int arg2) {
  a = arg1;
  b = arg2;
  return a + b;
}
```

En este caso arg1 y arg2 son ARGUMENTOS. 

Entonces si dentro de mi clase PruebaAritmetica quiero usar este método: 

```JAVA
aritmetica1.sumarConArgumentos(5 , 8);
```

En este caso 5 y 8 son PARAMETROS, que s envian al método sumarConArgumentos que me devuelve un numero entero. 

---

## USO Y LLAMADO A FUNCIONES 

:computer: Ver los ejemplos en la carpeta [**operaciones**](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion6/operaciones) tengo la clase principal **PruebaAritmetica.java** y la clase **Aritmetica.java** donde tengo mi clase con sus atributos y métodos. 

---

## THIS

Con el método **this** se puede acceder a los atributos y los métodos del objeto. 

Hay que estar dentro de la clase para poder utilizarlo, solo existe dentro de la clase. 

Por ejemplo: 

```JAVA
public int sumarConArgumentos(int a, int b) {
  this.a = a;
  this.b = b;
  return a + b;
}
```

En **this.a** tengo un ATRIBUTO de mi clase y en (**int a**) tengo un ARGUMENTO que estoy recibiendo en el método. 


otro ejemplo: 

```JAVA
public class PalabraThis {

  public static void main(String[] args) {
  
    //creo un nuevo objeto de la clase y le paso por argumento 
    Persona pesona new Persona("Analia", "Carrizo");   
    
    //mando a imprimir el objeto persona
    System.out.println("persona = " + persona);
    //Y por consola veo persoan=palabrathis.Perona@(aca me indica la posicion de memoria)
    
    system.out.println("persona nombre : " + persona.nombre);
    system.out.println("persona apellido : " + persona.apellido);
     //Y veo por consola: 
     //persona nombre: Analia 
     //persona apellido: Carrizo
  }
  
}


//CONSTRUCTOR DE LA CLASE PERSONA

class Persona {
  String nombre;
  String apellido;
  
  Persona(String nombre, String apellido) {
    this.nombre= nombre;
    this.apellido= apellido;
    System.out.println("Objeto persona usando this: " + this);
    
    //Creo el objeto imprimir, es igual a : Imprimir imprimir 0 new Imprimir();
    new Imprimir().imprimir(this);
    
  }
}

//Creo la ultima clase: IMPRIMIR

class Imprimir{

  public void imprimir(Persona persona){
    
    System.out.println(" persona desde imprimir: " + persona);
    System.outprnitln("impresion del objeto actual(thist)" + this);
  }

}

```

Como agregue en mi **constructor de persona** a **System.out.println("Objeto persona usando this: " + this);** , lo primero que se va a imprimir es eto, porque siempre primero se ejecuta el constructor, entonces voy a ver por consola: 

Objeto persona usando this:palabrathis.Persona@(el lugar de memoria que ocupa) 

Esto sucede porque en el constructor Persona primero se llama a **super()**, se hace una llamada de la clase Padre (object).  Y es el encargado de crear el espacio de memoria y hacer referencia. 
 
Al final creo el método **Imprimir** y me va a imprimir con **this** el objeto que ejecuta en ese momento, es decir de tipo Imprimir. 
 
 
---

## CONSTRUCTORES

Se crea un objeto sin icializar valores con **CONSTRUCTOR VACIO**. Por ejemplo: 

```JAVA
Aritmetica variable1 = newAritmetica(); 
```

En cambio con el **CONSTRUCTOR NO VACIO** se crea y se le asigna valor. Por ejemplo :

```JAVA
Aritmetica variable2 = new Aritmetica(10); 
```

Las clases deben tener ambos constructores. 

Los constructores tienen el mismo nombre que la clase. 

Sin los constructores no se podrían instanciar nuevos objetos. 

Un ejemplo de constructor vacío: <

```JAVA
public Aritmetica(){

}
```

El CONSTRUCTOR VACIO es un método especial, que solo se lo llama al momento de crear el nuevo objeto ( cuando INSTANCIO, cuando utilizo **new**). <br>


---

# SOBRECARGA DE CONSTRUCTORES

Se agrega uno o más constructores a la clase. 

Cuando se utiliza el constructor vacío se omite la inicialización de valores, para luego agregarlos manualmente. 


Se puede agregar un SEGUNDO CONSTRUCTOR ( sobrecarga). 

Un ejemplo con un nuevo método Aritmetica, peor en este caso con argumentos: 

```JAVA
public Aritmetica(int arg1 , int arg2) {
  this.a = arg1;
  this.b = arg2;
}
```

Si en mi clase main quiero utilizar este constructor con argumentos: 

```JAVA
Aritmetica aritmetica2 = new Aritmetica(7, 12);
```

Y mando a imprimir estos atributos: 

```JAVA
System.out.println("aritmetica2 a:" + aritmetica1.a);
System.out.println("aritmetica2 b:" + aritmetica1.b);
```

---

Si no tenemos ningún constructor el sistema agregar por default el constructor vaío, pero si ya tengo otros constructores con argumentos el sistema no me va a agregar el constructor vacío (aca lo tengo que agregar yo).

---

## VARIABLES

Las **VARIABLES** que se definen DENTRO de los metodos son **LOCALES**.

La palabra reservada **VAR** no se puede utilizar cuando se declaran las variables que son **ATRIBUTOS** de la clase, si se pueden utilizar dentro de los argumentos de MÉTODOS.

Las mismas varaibles que defino como atributos las puedo utilizar en los métodos, me puedo referir a ellas con **.this**, más que nada si tengo varaibles locales y variables que se refieren a atributos de mi clase. 

Los MÉTODOS deben ser ESTÁTICOS para poder ser llamados desde el método main que también es ESTÁTICO.

---


## MEMORIA STACK Y HEAP 

Por ejemplo: 

```JAVA
Persona p1 = new Persona();
int x = 10;
```

### MEMORIAS LOCALES DEFINIDAS DENTRO DE UN MÉTODO (STACK)

Almacenan la referencia del objeto.  

Se crean y se destruyen cuando termina este método.  

Por ejemplo: 

p1 = 0x333; 

x = 10; 


### MEMORIAS TIPO OBJECT (HEAP)

No se destruyen de manera automática, solo se destruyen cuando termina la ejecución completa del programa.  

Los atributos d ela clase también se guardan en al memoria heap.

Por ejemplo :

Persona <br>
(ox333) <br>
-nombre<br>
-apellido<br>

---

## PASO POR VALOR

Son los métodos ( las funciones ) que reciben argumentos.

Los argumentos son de tipo **primitivo**. 

Un ejemplo: 

```JAVA

public class PasoPorValor {

   public static void main(String[] args){
  
      int x = 10;
      System.out.println(" x = " + x);
      cambioValor(x);
    
    }
    
    public static void cambioValor(int argumento1){
      System.out.println("argumento1 = " + argumento1);
    }
  

}
```

Ambas variables ( X y argumento1 ) van a imprimir el mismo valor (10), ya que se pasa por variable X hacia el argumento1. 

Se pasa una copia del valor de la variable al método al que se manda a llamar, el método no puede cambiar el valor de la variable original. 

---

## PASO POR REFERENCIA

Voy a reusar la clase persona que ya tenía armada que tiene el atributo nombre , el atributo apellido y el método desplegarInformacion() que muestra los atributos. 

```JAVA
import clases.Ppersona;

public class PasoPorReferencia {

 public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.nombre = "Eugenia";
    System.outprintln(" persona1 nombre : " + persona1.nombre);
 }

}
```

De este modo accedemos al atributo nombre, lo modificamos y lo imprimimos. 

Y creo le método cambiaValor: 

```JAVA
public static void cambiaValor(Persona persona) {
  persona.nombre = " Maria";
}
```

Y lo aplico en mi clase principal: 

```JAVA
cambiarValor(persona1);
```

Por lo cual si ahora mando a imprimir persona1.nombre voy a ver Maria en vez de Eugenia.

Porque en este caso realizo el cambio por medio de un método que modifica el atributo nombre como valor del objeto. 

Se llama también **paso por valor con referencia** ( con referencia al objeto al cual está apuntando) .

A los objetos podemos acceder desde otros métodos. 

---


## USO DE LA PALABRA RETURN

Cuando en vez de necesitar un tipo primitivo necesito que regrese un objeto: 

Entonces mi método cambiarvalor, sería:

```JAVA
public static Persona cambiaValor(Persona persona) {
  persona.nombre = " Maria";
  return persona;
}
```

Se regresa el tipo persona que se recibió como argumento y fue modificado en su atributo nombre. 

Y en mi clase, cuando llamo al método para modificar el valor: 

```JAVA
persona1 cambiarValor(persona1);
```

**return** devuelve una referencia de un **objeto** . 

Si el método es **void** implícitamente Java nos agrega al final de todo el **return** .

Siempre que esté el **return** finaliza el método, y se pasa al sigueinte bloque de código, terminando el método. 


---

## Argumentos variables en Java VARARGS


Se pasan *argumentos* a un *metodo*, sin aclarar cuantos argumentos se pasan.

Es similar al rest de JS.

Con los ... la variable va a ser un arreglo, se trata como un arreglo de manera interna, solo que no tiene una DIMENSION fija, sino que es VARIABLE.

:computer: [ver aca el ejercicio](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_seccion6/vararg)


---
