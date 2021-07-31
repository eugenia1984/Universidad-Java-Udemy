# Final

Uso de la palabra final en Java, tiene distintos significados dependiendo donde se aplica: <br>

-**en variables** : evita cambiar el valor que alamcena la variable. Es una CONSTANTE cuando se combina con el modificador de acceso *static*. <br>
Por ejemplo Math.PI. <br>

Si por ejemplo defino: <br>
```
final int miVariable = 10;
```
Al tener *final* no puedo reasignarle un nuevo valor, si lo intento voy a tener un error. <br>

💻 ver la carpeta **PalabraFinal** con el proyecto *PalabraFinal* y el paquete *test* con su clase *TestFinal.java*. <br>

-**en métodos**: evita que se modificque la definición de un método desde una subclase.E comportamiento en al clase **hija** no podrá modificar el comportamiento en la clase **padre**.<br>

-**en clases**: evita que se cree una subclase. No va a tener clases hijas.<br>

💻 ver la carpeta **PalabraFinal** con el proyecto *PalabraFinal* y el paquete *domain* con su clase *Persona.java*. <br>
---


