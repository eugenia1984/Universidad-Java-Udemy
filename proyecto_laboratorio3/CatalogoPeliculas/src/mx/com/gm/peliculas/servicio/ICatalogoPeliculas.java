/*
 * Es la CAPA DE SERVICIO o LOGICA DE NEGOCIO
 * Va a tener los metodos que finalmente VA A UTILIZAR EL USUARIO
 * Tiene que ver con el uso de la aplicacion 
 */
package mx.com.gm.peliculas.servicio;

public interface ICatalogoPeliculas {
    //constante public static final
    //va a ser el nombre del archivo
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
}
