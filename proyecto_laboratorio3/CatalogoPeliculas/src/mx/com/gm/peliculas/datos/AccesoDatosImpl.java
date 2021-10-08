/*
 * Es la clase hija que va a IMPLEMENTAR los métodos de su clase padre, que es
 * una INTERFACE por lo cual tiene sus métods abstractos, en esta clase VOY A 
 * SABER COMO SE IMPLEMENTAN? Que hace cada método?
 * Se cumple con el contrato definido en la interface
 */
package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos{ //Es para el manejo de ARCHIVOs

    @Override
    public boolean existe(String nombreRecurso) {
        //creo la variable archivo de tipo File
        File archivo = new File(nombreRecurso);
        //el metodo .exist() devuelve un booleano -> true si existe
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
       //creo la variable archivo de tipo File
        File archivo = new File(nombreRecurso);
        //variable que va a almacenar la lista de peliculas
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            //Leo cada una de las lineas del archivo, cada uno es una String
            //Utilizamos la clase BUFFERREADER con la variable, creamos el objeto
            //BUFFEREDREADER y a la vez creamos el objeto FILEREADER el cualque no lee lineas
            //completas por lo que nos apoyamos de BUFFEREDREADER para leer lineas completas
            //y le pasamos el objeto de archivo
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //La variable linea va a guardar cada una de las entradas - peliculas-
            String linea = null;
            //El metodo .readLine(9 puede lanzar excepcion, asi que agrego un catch
            linea = entrada.readLine();
            //revisamos si la linea es distinta a null comenzamos a leerlas y 
            //regresamos lista de objetos de tipo pelicula
            while( linea != null ){
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                //vuelvo a leer nueva linea, si no es nulo, creo objeto de tipo pelicula 
                //y la agrego a la ArrayList - lista de peliculas -
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            //Si tenemos problemas no estamos lanzando una excepcion del APi de Java
            //sino que usamos nuestra propia Excepcion
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " +ex.getMessage());
        } catch (IOException ex) {
            //Si tenemos problemas no estamos lanzando una excepcion del APi de Java
            //sino que usamos nuestra propia Excepcion
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " +ex.getMessage());
        }
        //retorno le listado de peliculas
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreRecurso);
        //como puede arrojar error, envuelvo en bloque try - catch
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito información al archivo: " + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al listar pelicula: " +ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
      File archivo = new File(nombreRecurso);
      //variable donde almaceno el resultado
      String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();
            //variable para saber mi indice
            int indice = 1;
            while( entrada != null ) {
                if ( buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula "+linea+" encontrada en el indice "+indice;
                    break;
                }
                //si no se encuentra en la primer linea, leo la siguiente e incremento indice
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas " +ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas " +ex.getMessage());
        }
      return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreRecurso);
            salida = new PrintWriter(new FileWriter(archivo));
            salida.close(); //ahora se crea el archivo
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear archivo " +ex.getMessage());
        } finally {
            salida.close();
        }
    }

    @Override
    public void borrar(String nombreRecurso) {
        File archivo = new File(nombreRecurso);
        if ( archivo.exists() ) {
            archivo.delete();
            System.out.println("Se ha borrado el archivo");
        }
    }
    
}
