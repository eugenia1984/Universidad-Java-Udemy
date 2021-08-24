# Polimorfismo

Hay que tener una **clase padre**, una **clase hija** y el concepto de **sobreescritura**.

**POLIMORFISMO** -> multiples comportamientos

Dependiendo de la referencia del objeto al momento de ejecutar el programa, se utiliza el metodo de la clase padre o hija. Este nuevo metodo va a recibir por parametro a  un tipo de la CLASE PADRE, ya que un OBJETO DE CLASE PADRE PUEDE APUNTAR A OBJETOS DE CLASE HIJA.

Por eso cuando invoco al método y paso un objeto de la clase padre como parametro, el metodo va a hacer lo que está determinado en la clase padre. Pero cuando a ese mismo método le paso un objeto de la clase hija como parametro, el metodo va a hacer lo que esté determinado en la clase hija. Tenemos multiples comportamiento dependiedno de a que tipo de objeto (clase padre o hija) esté apuntando en memoria.

Se pueden crear metodos genéricos, donde se puedan imprimir distintos tipos de datos, tanto de clases hijas como de clases padres.

No necesitamos tener varios metodos, con uno solo podemos imprimir datos tanto de padre como de hija. 

Un METODO GENERICO que en tiempo de ejecucion HACE REFERENCIA A LA CLASE QUE ESTA APUNTANDO EN MEMORIA.

Para poder aplicar el polimorfismo **ambos metodos deben llamarse igual**

---

Diagrama que explica el polimorfismo con el ejemplo que hice en codigo:

| OBJETO TIPO EMPLEADO |
| -------------------- |
| -nombre |
| -sueldo |
| obtenerDetalles() |

*El objeto tipo GERENTE es HIJO del objeto tipo EMPLEADO

| OBJETO TIPO GERENTE |
| ------------------- |
| -nombre |
| -sueldo|
| obtenerDetalles() -heredado de EMPLEADO, está csulto y se accede con **super** |
| obtenerDetalles() -sobreescrito por Gerente, es el que se ejecuta |

---

:computer: [**ver ejemplo**](https://github.com/eugenia1984/Universidad-Java-Udemy/edit/main/nivel2_leccion1_polimorfismo/Sobrrescritura)
