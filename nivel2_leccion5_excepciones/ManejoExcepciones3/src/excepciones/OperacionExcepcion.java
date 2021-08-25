package excepciones;
//va a ser del tipo uncheckException por extender de RuntimeException
public class OperacionExcepcion extends RuntimeException { 
    //se manda un mensaje que se envia a la clase Excepcion(clase padre)
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
}
