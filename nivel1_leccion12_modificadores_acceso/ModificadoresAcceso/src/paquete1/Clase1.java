package paquete1;


public class Clase1 {  
//modificador de acceso PUBLIC en la clase (puede ser  utilizada en otra clase 
//del mismo paquete o paquete externo)
    
//tengo un atributo publico, al cual voy a poder acceder desde otra clase
    public String atributoPublico = "Valor atributo publico";
    
//constructor publico -> desde otra clase, sin restriccion puedo acceder a este constructor
    public Clase1() {
        System.out.println("Constructor publico");
    }
    
//un metodo public se va a poder acceder desde otra clase
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }

    
}
