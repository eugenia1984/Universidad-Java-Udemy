
package mx.com.gm.ventas;


public class Orden {
   
//Atributos
    private int idOrden;
    private Producto productos[];  //Arreglo que va a tener los productos de nuestra orden
    private static int contadorOrdenes;
    private int contadorProductos;  //para saber cuantos productos tiene el arreglo
    private static final int MAX_PRODUCTOS = 10;
    
//constructor vacio que incializa el idOrden y el arreglo de productos
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];  
    }
    
//Método para agregar productos
    public void agregarProducto(Producto producto) {
     
//Verifico que no tenga más de 10 productos que es el maximo        
        if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos : " + Orden.MAX_PRODUCTOS);
        }
        
    }
    
//Metodo para calcular el total
    public double calcularTotal() {
        double total = 0;
        
        for (int i = 0; i < contadorProductos; i++) {
            //Lo mismo en dos lineas:
            //Producto producto = this.productos[i];
            //total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        
        return total;
    }
    
//Metodo para mostrar la orden    
    public void mostrarOrden() {
        System.out.println("Id orden: " + this.idOrden);
    //Calculo y muestro el total de la orden
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $ " + totalOrden);
    //muestro los productos de la orden
        System.out.println("Producto de la orden : ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
}
