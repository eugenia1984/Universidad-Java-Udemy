/*
Crear una clase llamada Caja con las siguientes características:>
-Tener 3 atributos de tipo entero (ancho, alto, profundo). 
-Tener 2 constructores, uno vacío y uno con 3 argumentos, uno por cada atributo de la clase.  
-Tener el método que calcule el volumen de la caja: vol = ancho x alto x profundo 
 */
package caja;

public class Caja {
    
    // Atributos
    int ancho;
    int alto;
    int profundo;

    //Constructor vacío
    public Caja() {
    }
    
    //constructor con tres argumentos
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    //Metodo que calcula el volumen
    public int calcularVolumen(){
        return ancho * alto * profundo;
    }
    
        
        
  
}
