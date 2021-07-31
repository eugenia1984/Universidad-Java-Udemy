
package domain;


public class Empleado extends Persona{ 
///extends Persona no sería posible si Persona tiene FINAL
    /*
    ///No puedo sobreescribir un metodo que tiene FINAL en su calse padre
    public void imprimir(){
        System.out.println("Método imprimir desde clase hija");
    }
    */
    
    //Le puedo agregar: @Override
    public void imprimir(){
        System.out.println("Método imprimir desde clase hija");
    }
    
}
