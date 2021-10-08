package mx.com.gm.peliculas.excepciones;
//Del tipo EXCEPTIOn para que el compilador nos marque error si no 
//manejamos a este tipo de excepciones
public class AccesoDatosEx extends Exception{
    
    public AccesoDatosEx(String mensaje){
        super(mensaje);
    }
    
}
