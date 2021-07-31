package herencia;
///EXTENDS me indica que hereda de persona
public class Empleado extends Persona{

    //Atributos
    private int idEmpleado;
    private double sueldo;
    //la uso para incrementar en uno por cada empleado que creo
    private static int contadorEmpleado; 

    //constructores
     public Empleado(String nombre, double sueldo) {
       super(nombre);
       this.idEmpleado = ++Empleado.contadorEmpleado; 
       this.sueldo = sueldo;
    }
    
    /*
    Constructor que tiene los atributos de la clase padre
    por eso utiliza la palabra reserva SUPER
    public Empleado(String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
    }
    */
     
     //Getters y Setters

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
     
    //Sobreescribo el comportamiento heredado de la clase padre

    @Override
    public String toString() {
        return "Empleado{ " + "idEmpleado = " + idEmpleado 
                +", sueldo = " + sueldo + ", "+ super.toString()+  '}';
    }
    /*
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{id Empleado =").append(idEmpleado);
        sb.append(", sueldo=").append(this.getSueldo());
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    */
    
}
