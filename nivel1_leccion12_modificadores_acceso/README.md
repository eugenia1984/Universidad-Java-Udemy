# Modificadores de acceso en Java

Para donde aplican (SI):

| Modificador | Clase | Variable | Método | Constructor |
| ----------- | ----- | -------- | ------ | ----------- |
| public | SI | SI | SI | SI |
| protected | NO | SI | SI | SI |
| default * | SI | SI | SI | SI |
| private | No | SI | SI | SI |

Estan mencionados del menos restrictivo al más restrictivo

*es la ausencia de cualquier modificador, si no ponemos ninguno va el default

En el ejercicio práctico vamos a definir dos paquetes:

PAQUETE 1:

| Clase1 |
| ------ |
| +id atributo |
| + metodo() |

| Clase2 |
| ------ |

PAQUETE 2:

| Clase3 |
| ------ |

Esta Clase3 va a EXTENDER de la Clase1

| Clase4 |
| ------ |

Clase4 no tiene relación con ninguna otra clase

---

### Modificador de acceso PUBLIC :

Mi **CLase1** :

-tiene el MODIFICADOR DE PUBLIC -> ```JAVA  public class Clase1 ```  -> puede ser  utilizada en otra clase del mismo paquete o paquete externo.

-tiene un ATRIBUTO PUBLIC -> ```JAVA  public String atributoPublico = "Valor atributo publico";``` -> voy a poder acceder a este atributo desde otra clase. <br>
En mi TestModificadorAcceso voy a poder acceder al atributo -> ```JAVA System.out.println("clase1: " + clase1.atributoPublico);```

-tiene un CONSTRUCTOR PUBLIC  -> que se me va a mandar a llamar en mi clase TestModificadores e accesos al instanciar (crear) el objeto: ```JAVA Clase1 clase1 = new Clase1(); ``` . Voy a poder utlizar este constructor en cualquier otra clase sin restricciones.

```JAVA 
public Clase1() {
        System.out.println("Constructor publico");
    }
```    

-tiene un METODO PUBLIC -> se va a poder usar desde otra clase. En mi clase testModificadoresAccesos lo mando a llamar: ```JAVA  clase1.metodoPublico(); ```

```JAVA
public void metodoPublico(){
        System.out.println("Metodo publico");
    }
```


Voy a tener el **paquete test** con la **clase TestModificadoresAcceso** para en el mismo probar acceder a mi Clase1 que es PUBLIC.

Entonces en i Clase TestModificadoresAcceso creo instancio al objeto clase1 a partir de Clase1 y solo importo ```JAVA  import paquete1.Clase1;``` y trabajo sin inconvenientes.

:computer: [ver Modificadores Acceso](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_leccion12_modificadores_acceso/ModificadoresAcceso)

---

### Modificador de acceso PROTECTED :

Se permite a las clases hijas que accedan a sus constructores o atributos de la clase padre, aunque los constructores no se heredan, con super() los podemos invocar.

Recordar que protected no aplica para clases.


Mi **Clase1** va a seguir PUBLIC porque el modificador PROTECTED no está permitido  a nivel de clases

-tengo un atributo PROTECTED, al cual voy a poder acceder desde las clases hijas y si estoy dentro del mismo paquete -> ```JAVA    protected String atributoProtected = "Valor atributo protected";```

-Agrego un constructor publico porque si solo tengo el protected no voy a poder instanciar objetos ->

```JAVA
    public Clase1(String arg) {
        System.out.println("Constructor public");
    }
```

-constructor protected -> desde otra clase, sin restriccion puedo acceder a este constructor

```JAVA
    protected Clase1() {
        System.out.println("Constructor protected");
    }
 ```   

-un metodo public se va a poder acceder desde otra clase ->

```JAVA
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
```


Tengo mi **ClaseHija** que hereda (**extends**) de Clase1

Y tiene:

```JAVA
public ClaseHija(){
    //Se puede mandar a llamar al constructor protegido de la clase padre
        super();
    //en la clase hija con .this accedo al atributo protected de la clase padre    
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("atributo protegido : " + this.atributoProtected);
    //se puede tambien acceder al metodo protegido de la clase padre
        this.metodoProtected();
 }
 ```


Y en mi **paquete test** :

```JAVA
 //Instancio un nuevo objeto de la ClaseHija
        ClaseHija claseHija = new ClaseHija();
        System.out.println("Clase Hija: " + claseHija);
```


:computer: [ver Modificadores Acceso Protected](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_leccion12_modificadores_acceso/ModificadoresAccesoProtected)

---


### Modificador de acceso DEFAULT o PACKAGE

Ausencia del modificador, puede aplicar desde la clase (desde la definición de la clase) pero da error en la clase hija si está en otro paquete.

Por esto una clase hija de una clase Default o Package no puede ser utilizada fuera del paquete.

Solo se puede utilizar a la clase hija dentro dle mismo paquete de la clase super default o package.

Es más restrictivo que los anteriores, sol ose trabaja en el mismo paquete.

Entonces en mi **Clase1** tengo:

-atributo default o package -> al no tener modificador es default

```JAVA
String atributoDefault = "Atributo Default";
```

-constructor defualt o package -> no tiene atributo de acceso

```JAVA
  Clase1(){
        System.out.println("Constructor Default");
  }
```  

-metodo default o packege -> no tiene atributo de acceso

```JAVA
  void metodoDefault(){
        System.out.println("Metodo Default");
  }
```  

En mi **ClaseHija** que *extends* de **Clase1** :

```JAVA
public ClaseHija {   //en el constructor puedo acceder al constructor de la super
        super();
        this.atributoDefault = "Modificacion atributo default";  //se puede acceder al atributo  default de la clase padre
        System.out.println("atributo Default = " + this.atributoDefault);
        this.metodoDefault();  //tambien se puede acceder a los metodos default de la clase padre
}
```

Perp si mi ClaseHija NO extiende de Clase1, no podría acceder a nada


En mi **Clase TestModificadoresAccesso** tengo importadas **Clase1** y **ClaseHija**:

Esta clase no es hija de la  Clase1, pero SI está DENTRO DEL MISMO PAQUETE.

-Puedo instanciar un objeto de tipo Clase1 ->

```JAVA
import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresAcceso {
        public static void main( String [] args) {
                Clase1 clase1 = new Clase1();
                clase1.atributoDefault = "Cambio desde la prueba";  //Puedo acceder al atributo por default y modificarlo
                System.out.println("clase1 atributo default = " + clase1.atributoDefault);
                clase1.metodoDefault();   //tambien puedo invocar el metodoDefault()
       }
 }
```

En vez de usar PROTECTED para seguridad podemos usar DEFAULT y sólo las clases del mismo paquete van a poder acceder.

---

### Modificador de acceso PRIVATE:

-No funciona en clases

En mi **Clase1** :

-tengo un atributo privado -> no se va a poder modificar desde otra clase, sin importar si esta en el mismo paquete o es clase hija, para poder acceder y modificarlo se hace mediante **get** y **set**

-tengo un constructor privado -> es el constructor vacio, lo que hace que NO se puedan crear objetos usando el constructor vacio, solo se usa dentro de la misma clase

-tengo metodo privado

-debo agregar un CONSTRUCTOR PUBLICO para poder acceder desde la ClaseHija

```JAVA
class Clase1{   //una clase no puede ser PRIVATE

        private String atributoPrivado = "Valor atributo privado";  //atributo privado no se va a poder modificar desde otra clase
        
        private Clase1() { //constructor privado
                System.out.println("Constructor privado);
        }
        
        //Constructor publico que agrego para poder acceder desde la clase hija
        public Clase1(String argumento) {
                this();
                System.out.println("Constructor publico");
        }
        
        private void metodoPrivado() {
                 System.out.println("Metodo privado");
        }
        
        //get y set para poder desde la clase hija acceder al atributo privado
        public String getAtributoPrivado() {
                return atributoPrivado;
        }
        
        public void setAtributoPrivado(String atributoPrivado) {
                this.atributoPrivado = atributoPrivado;
        }

}
```


En mi **ClaseHija**:


```JAVA
import paquete1.Clase1;

public class ClaseHija extends Clase1 {

        public ClaseHija() {
                //super(); -> no puedo acceder si no tengo el constructor publico en mi clase padre
                super("Publico");  // porque uso el constructor publico
                //this.atributoPrivado  -> no puedo acceder
                //this.metodoPrivado(); -> no puedo acceder
        }
}

```

Desde la clase hija puedo acceder al CONSTRUTOR PUBLICO de la clase padre.


En mi **clase TestModificadoresAcceso** :

Solo puedo crear un nuevo objeto instanciado de Clase1 usando su constructor publico

Si quiero acceder al atributo privado no voy a poder, lo que tengo que hacer es agregar los metodos get y set en Clase1 para ese atributo privado.

```JAVA
import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresAcceso {

        public static void main( String [] args) {
        
                Clase1 clase1 = new Clase1("Publico");   //debo pasar parametro para usar el constructor publico
                clase1.setAtributoPrivado("cambio valor ");  //mediante el set voy a modificar el atributo privado
                System.out.println("clase 1 = " + clase1.getAtributoPrivado());  //para acceder al valor del atributoPrivado uso el get
        
       }
 }
```

Lo que voy a ver por consola es:

Constructor privado

Constructor publico

-Primero al ejecutarse el constructor publico manda a llamar al constructor privado con **this()** y posteriormente se ve el mensaje del constructor publico


---
