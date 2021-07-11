# Lección 6 - Funciones en Java

---

## DECLARACIÓN DE MÉTODOS ( FUNCIONES )

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

## USO Y LLAMADO A FUNCIONES 

:computer: Ver los ejemplos en la carpeta **operaciones** tengo la clase principal **PruebaAritmetica.java** y la clase **Aritmetica.java** donde tengo mi clase con sus atributos y métodos. <br>

---

## THIS

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


otro ejemplo: <br>

```
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

Como agregue en mi **constructor de persona** a **System.out.println("Objeto persona usando this: " + this);** , lo primero que se va a imprimir es eto, porque siempre primero se ejecuta el constructor, entonces voy a ver por consola: <br>
Objeto persona usando this:palabrathis.Persona@(el lugar de memoria que ocupa)  <br>

Esto sucede porque en el constructor Persona primero se llama a **super()**, se hace una llamada de la clase Padre (object).  Y es el encargado de crear el espacio de memoria y hacer referencia. <br>
 
Al final creo el método **Imprimir** y me va a imprimir con **this** el objeto que ejecuta en ese momento, es decir de tipo Imprimir. <br> 
 
 
---

## CONSTRUCTORES

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

## VARIABLES

Las **VARIABLES** que se definen DENTRO de los metodos son **LOCALES**.<br>

La palabra reservada **VAR** no se puede utilizar cuando se declaran las variables que son **ATRIBUTOS** de la clase, si se pueden utilizar dentro de los argumentos de MÉTODOS.<br>

Las mismas varaibles que defino como atributos las puedo utilizar en los métodos, me puedo referir a ellas con **.this**, más que nada si tengo varaibles locales y variables que se refieren a atributos de mi clase. <br>

Los MÉTODOS deben ser ESTÁTICOS para poder ser llamados desde el método main que también es ESTÁTICO.<br>

---


## MEMORIA STACK Y HEAP 

Por ejemplo: <br>

```
Persona p1 = new Persona();
int x = 10;
```

### MEMORIAS LOCALES DEFINIDAS DENTRO DE UN MÉTODO (STACK)

Almacenan la referencia del objeto.  <br>
Se crean y se destruyen cuando termina este método.  <br>

Por ejemplo: <br>

p1 = 0x333; <br>
x = 10; <br>


### MEMORIAS TIPO OBJECT (HEAP)

No se destruyen de manera automática, solo se destruyen cuando termina la ejecución completa del programa.  <br>
Los atributos d ela clase también se guardan en al memoria heap. <br>

Por ejemplo : <br>

Persona <br>
(ox333) <br>
-nombre<br>
-apellido<br>

---

## PASO POR VALOR

Son los métodos ( las funciones ) que reciben argumentos.<br>
Los argumentos son de tipo **primitivo**. <br>

Un ejemplo: <br>

```

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

Ambas variables ( X y argumento1 ) van a imprimir el mismo valor (10), ya que se pasa por variable X hacia el argumento1. <br>

Se pasa una copia del valor de la variable al método al que se manda a llamar, el método no puede cambiar el valor de la variable original. <br>

---

## PASO POR REFERENCIA

Voy a reusar la clase persona que ya tenía armada que tiene el atributo nombre , el atributo apellido y el método desplegarInformacion() que muestra los atributos. <br>

```

import clases.Ppersona;

public class PasoPorReferencia {

 public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.nombre = "Eugenia";
    System.outprintln(" persona1 nombre : " + persona1.nombre);
 }

}
```

De este modo accedemos al atributo nombre, lo modificamos y lo imprimimos. <br>
Y creo le método cambiaValor: <br>

```
public static void cambiaValor(Persona persona) {
  persona.nombre = " Maria";
}
```

Y lo aplico en mi clase principal: <br>

```
cambiarValor(persona1);
```

Por lo cual si ahora mando a imprimir persona1.nombre voy a ver Maria en vez de Eugenia. <br>
Porque en este caso realizo el cambio por medio de un método que modifica el atributo nombre como valor del objeto. <br>

Se llama también **paso por valor con referencia** ( con referencia al objeto al cual está apuntando) . <br>

A los objetos podemos acceder desde otros métodos. <br>

---


## USO DE LA PALABRA RETURN

Cuando en vez de necesitar un tipo primitivo necesito que regrese un objeto: <br>
Entonces mi método cambiarvalor, sería:

```
public static Persona cambiaValor(Persona persona) {
  persona.nombre = " Maria";
  return persona;
}
```

Se regresa el tipo persona que se recibió como argumento y fue modificado en su atributo nombre. <br>

Y en mi clase, cuando llamo al método para modificar el valor: <br>

```
persona1 cambiarValor(persona1);
```

**return** devuelve una referencia de un **objeto** . <br>

Si el método es **void** implícitamente Java nos agrega al final de todo el **return** .<br>

Siempre que esté el **return** finaliza el método, y se pasa al sigueinte bloque de código, terminando el método. <br>


---
