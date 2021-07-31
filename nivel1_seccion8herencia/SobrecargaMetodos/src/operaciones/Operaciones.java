package operaciones;


public class Operaciones {
    
//Es static para no tener que instanciar objetos de la clase    
    public static int sumar(int a, int b) {
        System.out.println("sumar(int a, int b)");
        return a+b;
    }
    
    public static double sumar(double a, double b){
        System.out.println("sumar(double a, double b)");
        return a+b;
    }

}
