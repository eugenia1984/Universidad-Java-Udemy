
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;


public class VentasTest {
    
    public static void main(String[] args) {
        
    //creo mi primer objeto producto
        Producto producto1 = new Producto("Camisa", 50.0);
    //Creo mi segundo objeto producto
        Producto producto2 = new Producto("Pantalón", 100.0);
        
    //Como ya tengo mis productos creados los puedo agregar a la orden
        Orden orden1 = new Orden();
    //Agrego los productos    
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
    //Muestro la orden
        orden1.mostrarOrden();
        
    //Creo una nueva orden con el mismo objeto pantalon 
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
        
    }
}
