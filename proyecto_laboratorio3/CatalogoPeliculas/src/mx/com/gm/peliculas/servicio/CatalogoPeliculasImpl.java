/*
 * Va a IMPLEMENTAR ICatalogoPeliculas, va a customizar los metodos heredados
 */
package mx.com.gm.peliculas.servicio;

import java.util.ArrayList;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
    
    //atributo para tener acceso a la capa de datos
    private final IAccesoDatos datos;
    
    //constructor vacio
    public CatalogoPeliculasImpl() {
        //inicializo la variable datos
        this.datos = new AccesoDatosImpl();
    }
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        //voy a convertir el String a objeto de tipo pelicula
        Pelicula pelicula = new Pelicula(nombrePelicula); 
        //varaible para saber si vamos a anexar informacion ala rchivo o si se sobreescribe
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            //tenia variable tipo var, ver si es ArrayList
            ArrayList<Pelicula> peliculas = (ArrayList<Pelicula>) this.datos.listar(NOMBRE_RECURSO);
            for(Pelicula pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos en le método buscarPelicula");
            ex.printStackTrace(System.out);
        }
        //si no se encuentra la pelicula se manda a imprimir el valor de null, por eso se incializo en null
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if( this.datos.existe(NOMBRE_RECURSO) ){
                //Si ya existe lo borro y lo creo
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {  //si no existe lo creo
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }
    
}
