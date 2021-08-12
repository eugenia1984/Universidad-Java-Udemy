package mx.com.gm.mundopc;

public class Orden {
    
    //Atributos
    private final int idOrden;
    private Computadora computadoras[]; //Relacion de compocion con clase Computadoras
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras; //para saber cuantos objetos Computadoras se agregaron
    
    //Metodo orden para inicializar las variables contadorOrdenes y MAX_COMPUTADORAS
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //Metodo Agregar computadora
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){ //para que no supere las 10 computadoras
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    //metodo mostrar orden
    public void mostrarOrden(){
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadoras de la orden #:" + this.idOrden);
        //Itero el arreglo de las computadoras
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
