package excepciones;

public class OperacionExcepcion extends Exception { //va a ser del tipo checkException
    //se manda un mensaje que se envia a la clase Excepcion(clase padre)
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
}
