
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
    
    //CONVERSION DE TIPO
    public static void determinarTipo(Empleado empleado){
        //Siempre empiezo preguntando si es instanceOf de CLASE HIJA
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
    //Variable de tipo EMPLEADO convertida a TIPO GERENTE
            Gerente gerente = (Gerente)empleado;
    //con la variable empleado accedo a los atributos y metodos de la clase hija
            gerente.getDepartamento();
        } 
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
             //Gerente gerente = (Gerente)empleado;
            //gerente.getDepartamento();
            //Esto me daria error porque ya es de tipo hija, no necesito castear
        } 
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
    
}
