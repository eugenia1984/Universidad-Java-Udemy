package test;

import herencia.Cliente;
import herencia.Empleado;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
//Si en la clase Empleado no tengo atributos ni metodos        
//Voy a ver todos los atributos de la clase Persona
//nombre, genero, edad, direccion
//porque los hereda de su clase padre
        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Rivadavia 20, Buenos Aires");
        System.out.println("cliente1 = " + cliente1);
    }
    
}
