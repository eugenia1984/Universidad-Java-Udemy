
package genericos;

//el tipo del atributo no lo conozco hasta que lo utilizo por eso lo nombro con T de tipo   
public class ClaseGenerica<T> {
    private T objeto;  //es tipo generico
    
    public ClaseGenerica(T objeto){  //constructor que recibe variable de tipo generico
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){  //mando a imprimir al tipo de objeto
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName() );
    }
    
}
