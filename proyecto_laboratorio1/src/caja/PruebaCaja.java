/*
Crear una clase de prueba para crear un objeto de tipo caja que tenga como 
valores: 
ancho = 2
alto = 2  
profundo = 6  
Y que mande a imprimir el volumen de la caja según los valores proporcionados 
anteriormente. 
 */
package caja;


public class PruebaCaja {
    
    public static void main(String[] args) {
        
        //declaro en variables los valores indicados
        int medidaAncho = 2;
        int medidaAlto = 2;
        int medidaProfundo = 6;
        int resultado; // esta la voy a usar para mostrar el volumen
        
        //instancio una nueva caja
        Caja cajaNueva = new Caja();
        
        //La paso los valres de las varaibles a sus atributos
        cajaNueva.ancho = medidaAncho;
        cajaNueva.alto = medidaAlto;
        cajaNueva.profundo = medidaProfundo;
        
        resultado = cajaNueva.calcularVolumen();
        
        System.out.println("El volumen de una caja con : \n"+  medidaAncho + " de ancho, " +
                medidaAlto + " alto, " + medidaProfundo + " profundo. \nEs de : " + resultado);
        
    }
    
}
