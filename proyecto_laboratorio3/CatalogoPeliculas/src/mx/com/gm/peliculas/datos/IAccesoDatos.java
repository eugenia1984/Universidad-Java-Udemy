/*
 * Es la CAPA DE DATOS, la capa de datos logica, luego puede ser acceso a datosÇ
 * ya sea archivo o database.
 * Es la INTERFAZ, donde solo DEFINO el comportamiento
 * SE QUE VA A HACER, pero NO SE EL COMO
 * Tiene los métodos pero no tiene la forma en que se ejecuta la información, eso
 * está en la clase IAccesoDatos Impl (Impl por implementation) 
 */
package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx; //import mx.com.gm.peliculas.excepciones.*

public interface IAccesoDatos {
    //chequeo si existe ya el archivo en mi disco duro
    //si ya existe -> true
    //si no existe -> false
    //Su tipo de excepcion es de una clase hija
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    //Lista pero de objetos tipo pelicula - colecciones
    //Su tipo de excepcion es de una clase hija
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
    //Su tipo de excepcion es de una clase hija
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    //metodo para buscar una pelicula
    String buscar(String nombrerecurso, String buscar) throws LecturaDatosEx;
    //metodo para crear el recurso - el archivo 
    void crear(String nombreRecurso) throws AccesoDatosEx;
    //metodo borrar
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
