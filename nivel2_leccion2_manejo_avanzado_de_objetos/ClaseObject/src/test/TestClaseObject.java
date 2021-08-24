package test;

import domain.Empleado;

public class TestClaseObject {

    public static void main(String[] args) {
        //Creo dos variables que son instancia de la clase empleado
        Empleado empleado1 = new Empleado("Juan", 6000);
        Empleado empleado2 =  new Empleado("Juan", 6000);
        
        //aunque tengamos los mismos valores en los atributos, al utiliar new
        //para crear cada uno de los objetos entonces se encuentran en diferente
        //referencia en memoria
        //Tenemos que ver si dos ejemplos son iguales
        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        //Veo si los dos son iguales con equals y hashcode de la clase Empleados
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashcode es igual");
        } else {
            System.out.println("El valor hashcode es distinto");
        }
    }
    
}
