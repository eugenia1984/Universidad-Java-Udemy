
package test;

import domain.Persona;


public class TestBloquesInicializacion {
    
    public static void main(String[] args) {
        
        //creo una varaible del tipo Persona
        Persona persona1 = new Persona();   
  
        //Vemos en el orden en que se ejecutan los bloques
        //Ejecucion bloque estático
        //Ejecucion de bloque no estático
        //Ejecucion del constructor
        
        //mando a imprimir la cvariable persona sin tneer el metodo toString 
        //me da el espacio en memoria al que esta apuntando
        //Pero como agregue el metodo toString ahora imprimi el idPersona
        System.out.println("Persona1 : " + persona1);
        System.out.println("");
        
         Persona persona2 = new Persona();
        //como ya esta cargada la clase en memoria ahora NO de ejecuta el BLOQUE ESTATICO
        //mando a imprimir el segundo objeto instanciado para ver que se
        //incremento el idpersona
        System.out.println("Persona2 : " + persona2);
    }
    
}
