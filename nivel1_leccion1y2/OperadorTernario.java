package operadorTernario;

public class OperadorTernario {


    public static void main(String[] args) {
        int numero = 8;
        String resultado = (numero % 2 == 0)? "es numero par" : " es numero impar";
        System.out.println("8 : " + resultado);
        
    }
    
}
