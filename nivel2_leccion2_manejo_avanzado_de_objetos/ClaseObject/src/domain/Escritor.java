package domain;

public class Escritor extends Empleado{  //es clase hija de empleado
    //Atributo de tipo ENUM
    final TipoEscritura tipoEscritura;  
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo); //mando a llamar al constructor de la clase padre
        this.tipoEscritura = tipoEscritura;
    }
    
    //Metodo para sobreescribir el metodo de la clase padre
    @Override
    public String obtenerDetalles(){
    //con super() accedo al metodo de la clase padre y luego concateno lo propio
    //de mi clase Escritor
        return super.obtenerDetalles() + ", tipo escritura = " + tipoEscritura.getDescripcion();
    }
    
    //ToSting para que en vez de imprimir la referencia en memoria 
    //me muestre los atributos y con super muestro los metodos de la clase padre
    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura = " + tipoEscritura + '}' + " " + super.toString();
    }
    
    //metodo que me va a devoler la enumeracion TipoEscritura
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
}
