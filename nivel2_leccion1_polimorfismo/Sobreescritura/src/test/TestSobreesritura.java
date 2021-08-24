
package test;

import domain.*;


public class TestSobreesritura {
    
    public static void main(String[] args) {
        
        //creo un objeto de tipo clase Empleado(CLASE PADRE)
        Empleado empleado = new Empleado("Juan",5000);
        //Voy a ver solo los atributos de la clase PADRE
        //System.out.println("Empleado: "+ empleado.obtenerDetalles());
        imprimir(empleado);
        //creo un objeto de tipo clase genrente(CLASE HIJA)
        Gerente gerente = new Gerente("Sandra",10000,"Contabilidad");
        //Voy a ver los atributos de la clase padre e hija
        //System.out.println("Gerente: " + gerente.obtenerDetalles()); 
        imprimir(gerente);
    }
    
    //POLIMORFISTO
    //Dependiendo de la referencia del objeto al momento de ejecutar el programa
    //Se utiliza el metodo de la clase padre o hija
    //Recibe un tipo de la CLASE PADRE
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
