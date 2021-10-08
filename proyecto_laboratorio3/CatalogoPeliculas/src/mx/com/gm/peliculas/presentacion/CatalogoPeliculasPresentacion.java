/*
 * Es la CAPA DE PRESENTACION donde se interactua con el usuario
 * Ya no vamos a interactuar con la CAPA DE DATOs, de ello se encarga la clase
 * CatalogoPeliculasImpl
 * Ya no se interactua a bajo nivel, sino en CAPA DE NEGOCIO
 *
 * BAJO ACOPLAMIENTO -> la menor cantidad de relaciones entre las clases, x ej. 
 * la CAPA DE PRESENTACION no se comunica directamente con la capa de datos, 
 * sino que solamente con la CAPA DE NEGOCIO
 * 
 * ALTA COHESION -> cada clase se encarga de realizar su tarea y no más, x ej
 * la capa de datos se comunica con el archivo, la capa de negocio de realizar
 * las operaciones de la aplicacion y la capa de presentacion muestra la informacion
 * al usuario y captura la informacion del usuario
 */
package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.*;

public class CatalogoPeliculasPresentacion {
    
    public static void main(String[] args) {
        //se va a mostrar un menu con opciones, creo la variable opcion
        //mientras no presione de opcion 0, el programa continua
        int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        while(opcion != 0 ){
            System.out.println("Elije una opcion: \n"
                +"1. Iniciar catalogo de peliculas\n"
                +"2. Agregar pelicula\n"
                +"3. Listar peliculas\n"
                +"4. Buscar pelicula\n"
                +"0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
        }
        //SWITCH para procesar cada una de las opciones elejidas
        switch (opcion) {
            case 1:
                catalogo.iniciarCatalogoPeliculas();
                break;
            case 2:
                System.out.println("Ingrese el nombre de la pelicula: ");
                String nombrePelicula = scanner.nextLine();
                catalogo.agregarPelicula(nombrePelicula);
                break; 
            case 3:
                catalogo.listarPeliculas();
                break;
            case 4:
                System.out.println("Ingrese la pelicula a buscar");
                String buscar = scanner.nextLine();
                catalogo.buscarPelicula(buscar);
                break;  
            case 0:
                System.out.println("Adios!");
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
    
    
}
