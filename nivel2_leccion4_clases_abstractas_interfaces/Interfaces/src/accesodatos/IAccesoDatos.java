package accesodatos;


public interface IAccesoDatos {
    //atributo CONSTANTE ->  public static final, lo declaro y asigno valor
    int MAX_REGISTRO = 10;
    
    //metodo public abstract
    void insertar();    
    
    void listar();
    
    void actualizar();
    
    void eliminar();

}
