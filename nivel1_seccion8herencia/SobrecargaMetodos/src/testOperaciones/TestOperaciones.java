package testOperaciones;

import operaciones.Operaciones;

public class TestOperaciones {
    
    public static void main(String[] args) {
        
        int resultado = Operaciones.sumar(1, 2);
        System.out.println("resultado = " + resultado);
        
        System.out.println("-------------------------");
        
        double resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado2 = " + resultado2);
    }
    
}
