# Nivel 2 : Laboratorio final

## Consigna

En este laboratorio final vamos a crear un ejercicio que simule un catálogo de películas. 

Para este ejercicio, vamos a almacenar la información del catálogo de películas en un archivo de texto, en una
carpeta definida por nosotros, por ejemplo en la carpeta: c:\catalogoPeliculas\películas.txt

Vamos a crear varios paquetes, cada uno con tareas específicas a desarrollar en el programa.

##  DIAGRAMA DE CLASES:

```

cpjlaboratoriofinal
--------------------
CPJLaboratorioFinal


mx.com.gm.peliculas.domain             mx.com.gm.peliculas.negocio               mx.com.gm.peliculas.datos
-------------------------              ---------------------------               ------------------------
Pelicula                                   CatalogoPeliculas                              AccesoDatos
                                                 |                                           |
                                          CatalogoPeliculasImpl                        AccesoDatosImpl
                                          
                                          
                               mx.com.gm.peliculas.excepciones
                             -------------------------------------
                                             AccesoDatosEx
                                                   |
                                         ---------------------
                                         |                   |
                                   EscrituraDatosEx    LecturaDatosEx


```

## Paquetes:

1. Crear un paquete de excepciones, similar a la lección de excepciones vistas en el curso, según se
muestra en el diagrama de clases.

2. Crear un paquete mx.com.gm.películas.domain que incluya una clase llamada Pelicula. Las clases almacenadas en este paquete, se conoce como las clases del dominio del problema.

3. Crear un paquete llamado mx.com.gm.películas.datos la cual incluye una interface y una clase que implementa dicha interface. El objetivo de estas clases es agregar la funcionalidad para interactuar con el archivo donde se va a guardar la información del catálogo de películas.

4. Crear el paquete llamado mx.com.gm.peliculas.negocio el cual incluye las clases para definir la uncionalidad de nuestra aplicación, también conocido como las reglas de negocio de la aplicación.

5. Finalmente crearemos la clase CPJLaboratorioFinal, que significa CursoProgramacionJavaLaboratorioFinal, el cual incluye un menú de opciones para escoger la opción a procesar en el programa.


A continuación veremos a más detalle cada uno de los paquetes de la aplicación Catalogo de Peliculas a desarrollar.

## PELICULA.JAVA

| mx.com.gm.peliculas.domain.Pelicula |
| ----------------------------------- |
| -nombre: String |
| +Pelicula() |
| +Pelicula(nombre: String) |
| +getNombre(): String |
| +setNombre(nombre String) |
| +toString(): String |
| REsponsabilities -- representa los objetos película utilizados en la aplicación catálogo de películas |


Esta clase nos servirá para representar el objeto Pelicula. 

En esta aplicación dejamos simple la definición de este objeto, sin embargo podría tener más atributos y hacer más compleja esta aplicación, pero el objetivo es que podamos desarrollar esta aplicación con la estructura planteada, y no agregar más complejidad de la necesaria para aplicar los conceptos estudiados a lo largo de este curso.

Por ello este objeto se debe codificar con lo indicado en el diagrama de clase mostrado.

## ACCESODATOS.JAVA

| mx.com.gm.peliculas.datos:AccesoDatos |
| ------------------------------------- |
| +existe(nombreArchivo: String): boleean |
| +listar(nombre: String): List<Pelicula> |
| +escribir(pelicula: Pelicula, nombreArchivo: String, anexar: boolean): void |
| +buscar(nombreArchivo: String, buscar: String): String) |
| +crear(nombreArchivo: String): void |
| +borrar(nombreArchivo: String): void |
| Responsabilities --contiene las operaciones a ejecutar en el archivo de peliculas.txt |
  
  

Esta interfaz define los métodos para interactuar con el archivo que administrará el
catálogo de películas. La clase AccesoDatosImpl es la que finalmente se encargará de
agregar el comportamiento de cada uno de los métodos descritos.
  
  A partir de este proyecto empezaremos a separar los paquetes y clases según la
funcionalidad de cada una de ellas. En el caso del paquete de acceso a datos, su función
es definir la forma en que se interactúa con el archivo que es donde se almacenará la
información.
  
  Sin embargo, el uso de interfaces y su implementación empieza a tomar importancia,
debido a que en el curso de Java con JDBC, en lugar de trabajar con la implementación
para un guardar la información en un archivo, agregaremos la implementación pero
escribiendo a una base de datos. Así que por ello es importante definir la interface que es
la que contiene los métodos que se utilizarán por otras clases en la aplicación, pero la
implementación podemos definir cual se va a utilizar, si por ejemplo una que guarde la
información en un archivo o alguna otra implementación que guarde la información en
base de datos.
  
  
  Por último, cabe mencionar que la implementación de esta interfaz es completamente
técnica respecto al uso del manejo de archivos, por lo que a diferencia del paquete de
negocios que veremos a continuación, el paquete de datos, realiza las tareas más
técnicas que tienen que ver con la manipulación directa del archivo, en cambio, el
paquete de negocios se encarga más de definir las operaciones y funcionalidad desde el
punto de vista de lo que necesita realizar la aplicación, pero de alguna manera no le
interesa si la información se almacena o proviene de un archivo, ya que de eso se
encargará precisamente el paquete de datos.
  
 ## CATALOGOPELICULAS.JAVA
  
  
  | mx.com.gm.peliculas.negocio::CatalogoPeliculas |
  | ---------------------------------------------- |
  | +agregarPelicula(nombrePelicula: String, nombreArchivo: String) void|
  | +listarPeliculas(nombreArchivo: String) void |
  | +buscarPelicula(nombreArchivo: String, buscar: String) void |
  | +iniciarArchivo(nombreArchivo: String) void |
  | Responsabilities --contiene las oepraciones necesarias de la aplicacion CatalogoPeliculas |
  
  
  | mx.com.gm.peliculas.negocio:CatalogoPeliculasImpl |
  | ------------------------------------------------- |
  | datos: AccesoDatos |
  | +CatalogoPeliculasimpl() |
  | +listarPelicula(nombrePelicula: String, nombreArchivo: String) void |
  | +buscarPelicula(nombreArchivo: String, buscar: String) void |
  | +iniciarArchivo(nombreArchiv: String) void |
  
  
  El paquete de mx.com.gm.películas.negocio contiene las clases que
implementarán las reglas de negocio de nuestra aplicación. Y a su vez este es el
paquete que será el intermediario entre la interfaz con el usuario (método main) y
el guardado de la información (paquete de datos).
  
  
  Similar al paquete da datos, este paquete hemos agregado también una interfaz y
una implementación. De esta manera la interfaz de usuario (método main) hará
uso de la interface, y será la implementación de CatalagoPeliculasImpl.java quien
finalmente ejecutará las tareas que sean necesarias para esta aplicación.
  
  
  A su vez la implementación del catálogo de películas será quien utilice la interface
de AccesoDatos.java, por lo que al hacer uso de interfaces es que en cualquier
momento podríamos cambiar la implementación y afectaríamos lo menos posible al
código que ya hemos programado. A esta característica se le conoce como bajo
acomplamiento, ya que un cambio en un componente o una clase afecta lo menos
posible a otra clase, así que es sólo una de las muchas ventajas de programar
utilizando interfaces y no utilizar directamente la implementación de la
funcionalidad que necesitamos.
  
  
 ## CLASE MAIN
  
  
  | cpjlaboratoriofinal: CPGLaboratorioFinal |
  | ---------------------------------------- |
  | scanner: java.util.Scanner |
  | opcion: int |
  | nombreArchivo: String |
  | catalogoPeliculas: CatalogoPeliculas |
  | +main(args: String[]) void |
  | Responsabilities --contiene el menu que permite al usuario seleccionar la acción a ejecutar sobre el catálogo de películas |
  
  Esta clase representa la inteface con la que el usuario interactua. Esta clase solicita via consola la acción
requerida por parte del usuario, y solicita opciones como:
  
1.- Iniciar catalogo películas
  
2.- Agregar película
  
3.- Listar Películas
  
4.- Buscar Película
  
0.- Salir
  
  Y dependiendo de la opción elegida por el usuario es la acción que se ejecuta.
  
  Esta clase se apoya de la clase Catalogopeliculas para realizar las operaciones que necesita esta
aplicación.
  
  A su vez la variable opción es la que se encargará de almacenar la opción seleccionada por parte del
usuario
  
  Y el nombre del archivo indica la ruta donde se almacenará el archivo. Por ejemplo, la cadena Java que
se puede utilizar si estamos en Windows es:
  
```  
"c:\\catalogoPeliculas\\peliculas.txt“
```  
  
Sin embargo si es otro sistema operativo, como MacOS, la ruta podría ser:
  
```    
“/Volumes/gm/catalogoPeliculas/películas.txt “
```  
  
Debemos recordar que la carpeta sobre la que vayamos a trabajar ya debe estar creada y en caso necesario debe
tener permisos de escritura, esto es particular de los requerimientos de cada sistema operativo.
  
## SALIDA DEL PROGRAMA
  
  
  Según hemos comentado, las opciones que muestra el menú de opciones para el usuario son:
  
1.- Iniciar catalogo películas
  
2.- Agregar película
  
3.- Listar Películas
  
4.- Buscar Película
  
0.- Salir
  
  
  Y como vemos, dependiendo de la opción elegida por el usuario es la acción que se ejecuta. Así
que este es el menú que debemos programar para que el usuario pueda interactuar con la
aplicación.
  
Así que tenemos todo listo para comenzar a realizar la aplicación de Catálogo de Películas,
manos a la obra y te deseamos el mayor éxito en la realización de tu práctica final.
