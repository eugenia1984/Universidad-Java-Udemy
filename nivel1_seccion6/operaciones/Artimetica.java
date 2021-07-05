package operaciones;

public class Artimetica {
    
    //Atributos al ser primitivos su valor por default es 0
    int a;
    int b;
    
    //Metodo
    public void sumar(){
        //La varaible resultado es local a este metodo
        int resultado = a + b;
        System.out.println("resultado : " + resultado);
    }
    public int sumarConRetorno() {
        return a + b;
    }
}
