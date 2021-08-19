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



:computer: [ver Modificadores Acceso](https://github.com/eugenia1984/Universidad-Java-Udemy/tree/main/nivel1_leccion12_modificadores_acceso/ModificadoresAccesoProtected)

