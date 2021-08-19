
package test;

import paquete1.Clase1;
import paquete2.ClaseHija;


public class TestModificadoresAcceso {
    
    public static void main(String[] args) {
        
        //No voy a poder utilizar el constructor de la clase porque es PROTECTED
        //Por eso agregue otro constructor PUBLIC
        Clase1 clase1 = new Clase1("Publico");
        
        
        System.out.println("clase1: " + clase1);
        //System.out.println("clase1: " + clase1.....);  no puedo acceder al atributo protected, una subclase si accede
        //clase1.metodoProtected();      no puedo acceder a un metodo protected, una subclase si accede
        
        System.out.println(" ------------------- ");
        
        //Instancio un nuevo objeto de la ClaseHija
        ClaseHija claseHija = new ClaseHija();
        System.out.println("Clase Hija: " + claseHija);

    }
    
}
