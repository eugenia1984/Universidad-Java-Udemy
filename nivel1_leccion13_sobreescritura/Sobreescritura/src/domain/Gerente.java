/*
 Es clase hija de la clase Empleado
 */
package domain;

public class Gerente extends Empleado { //porque hereda de empleado
    //atributo propio de esta clase hija
    private String departamento;
    
    //constructor de la clase Gerente (clase hija)
    public Gerente(String nombre, double sueldo, String departamento){
        //llamo al constructor de la clase padre con sus satributos como parametros
        super(nombre, sueldo);
        //inicializo el valor del atributo departamento
        this.departamento = departamento;  
    }
    
    //Modifico el metodo del padre para que muestre departamento
    @Override
    public String obtenerDetalles(){
        //con super() accedo al metodo de la clase padre
        //agrego el atributo d ela clase hija
        return super.obtenerDetalles() + ", departamento = " + this.departamento;
    }
}
