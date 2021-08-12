package mx.com.gm.mundopc;

public class Computadora {
    //Atributos
    private final int idComputadora;
    private String nombre;
    ///Agregamos de las otras clases
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
    //Constructores
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this(); //para inicializar contadorComputadoras
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //Getters y Setters
    public int getIdComputadora() {
        return idComputadora;
    }
   //No tengo setIdComputadora porque ya fue inicializado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    //toString
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora = " + idComputadora + 
                ", nombre = " + nombre + ", monitor = " + monitor + 
                ", teclado = " + teclado + ", raton = " + raton + '}';
    }
    
}
