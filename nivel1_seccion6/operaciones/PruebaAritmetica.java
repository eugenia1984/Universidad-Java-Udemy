package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Artimetica aritmetica1 = new Artimetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde la prueba : " + resultado);
    }
}
