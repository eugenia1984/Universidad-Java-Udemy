
package test;

import domain.*;


public class TestInstanceOf {
    
    public static void main(String[] args) {
        
        //creo un objeto de tipo clase Empleado(CLASE PADRE)
        Empleado empleado = new Empleado("Juan",5000);
        determinarTipo(empleado);
        //creo un objeto de tipo clase genrente(CLASE HIJA)
        Gerente gerente = new Gerente("Sandra",10000,"Contabilidad");
    }
    
    //INSTANCE OF -> determino el tipo por tiempo de ejecucion, ver de que tipo
    //es la referencia a la cual está apuntando la memoria, si es new Gerente/Empleado
    public static void determinarTipo(Empleado empleado){
        //Siempre empiezo preguntando si es instanceOf de CLASE HIJA
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
    
}
