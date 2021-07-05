package operadorAritmetico;


public class OperadorAritmetico {

    public static void main(String[] args) {
        //Declaro mis variables de tipo entero y le asigno valor
        int a = 3;
        int b = 2;
        //Declaro mi variable resultado, sin inicializarla
        int resultado;
        //Calculo el resultado como la suma de ambos numeros
        resultado = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
        
        //Calculo el resultado como la resta de ambos numeros
        resultado = a - b;
        System.out.println("La resta de " + a + " y " + b + " es: " + resultado);
        
        //Calculo el resultado como la multiplicacion de ambos numeros
        resultado = a * b;
        System.out.println("La multiplicacion de " + a + " y " + b + " es: " + resultado);
        
        //Como no se puede dividir por 0, con un if/else debo asegurarme que b no es 0
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            //Calculo la division
            resultado = a / b;
            System.out.println("La división de " + a + " y " + b + " es : " + resultado);
        }
        
        //Calculo el resultado como el modulo de ambos numeros
        resultado = a % b;
        System.out.println("El módulo de " + a + " y " + b + " es: " + resultado);
        
        // Para practicar con modulo veo si a es de tipo par o impar
        
        if ( a % 2 == 0) {
            System.out.println( a + " es número par");
        } else {
            System.out.println( a + " es número impar");
        }
        
    }
    
}
