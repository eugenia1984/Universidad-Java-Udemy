package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        //creo una varaible de tipo EMPLEADO(clase padre)
        Empleado empleado;
        
        //Asigno una nueva referencia con los atributos de la clase padre
        //empleado = new Empleado("Juan",5000);  
        
        //Asigno una nueva referencia con los atributos de la clase hija
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        
        System.out.println("empleado = " + empleado);
        //para ver el polimorfismo se ve el metodo de la clase hija
        System.out.println(empleado.obtenerDetalles());
        
        //metodo getTipoEscritura() solo definido dentro de la clase de tipo Escritor
        // no puedo hacer : empleado.getTipoEscritura();
        //DOWNCASTING de tipo padre a tipo hijo
        //Debo hace CONVERSION -> lo asigno a variable o envuelvo entre ()
        //asignando a variable -> 
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        //lo envuelvo entre () ->
        //((Escritor)empleado).getTipoEscritura(); 
        
        //UPCASTING no debo hacer conversion
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles()); 
    }
}
