package mx.com.gm.mundopc;

public class Monitor {
    //Atributos
    private final int idMonitor;  //FINAL es un atributo privado
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    //Constructor para inicializar mi contador privado solo se manda a llamar 
    //dentro de la clase
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this(); //Llamo al constructor vacio para inicializar contadorMonitores
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    //Getters y Setters
    public int getIdMonitor(){
        return this.idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    //toString
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor = " + idMonitor + ", marca = " + marca +
                ", tamanio = " + tamanio + '}';
    }
    
    
}
