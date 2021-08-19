
package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1{  //extiende (hereda) de Clase1
    
    public ClaseHija(){
    //Se puede mandar a llamar al constructor protegido de la clase padre
        super();
    //en la clase hija con .this accedo al atributo protected de la clase padre    
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("atributo protegido : " + this.atributoProtected);
    //se puede tambien acceder al metodo protegido de la clase padre
        this.metodoProtected();
    }
    
}
