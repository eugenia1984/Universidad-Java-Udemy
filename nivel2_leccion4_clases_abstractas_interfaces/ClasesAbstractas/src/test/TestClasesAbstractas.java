package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;


public class TestClasesAbstractas {


    public static void main(String[] args) {
    //Intento crear un objeto de una clase abstracta -> NO SE PUEDE
    //FiguraGeometrica figura = new FiguraGeometrica();
    //veo el mensaje de que una figura geometrica no puede ser instanciada
        
    //creo objeto de la clase hija y aplico polimorfismo y upcasting asigno
    //un tipo hijo RECTANGULO a un tipo padre FIGURAGEOMETRICA, no tengo que hacer:
    //FiguraGeometrica figura = (FiguraGeometrica) new Rectangulo("Rectangulo");
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
    //el metodo dibujar esta en las dos clases, entonces se toma el de la clase
    //de menor jerarquia, de la hija
        figura.dibujar();
    }
    
}
