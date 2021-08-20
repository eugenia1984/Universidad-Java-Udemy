
package test;

import domain.Gerente;


public class TestSobreesritura {
    
    public static void main(String[] args) {
        
        //creo un objeto de tipo clase Gerente (clase hija)
        Gerente gerente1 = new Gerente("Juan", 5000 ,"Sistemas");
        System.out.println("Gerente1 = " + gerente1.obtenerDetalles());
    }
    
}
