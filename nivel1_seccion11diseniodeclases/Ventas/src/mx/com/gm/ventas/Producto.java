
package mx.com.gm.ventas;


public class Producto {
    
    //Atributos
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //constructor vacío privado (solo se usa dentro de la clase)
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio) {
    //para llamar al consructor vacío e inicializar contadorProductos    
        this();  
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //toString
    @Override
    public String toString() {
        return "Producto{ " + "idProducto = " + idProducto + ", nombre = " + 
                nombre + ", precio = " + precio + '}';
    }

   
    
}
