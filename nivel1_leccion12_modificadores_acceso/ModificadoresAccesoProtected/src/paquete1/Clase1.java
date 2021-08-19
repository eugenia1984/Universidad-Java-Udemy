package paquete1;


public class Clase1 {  
//Mi clase va a seguir PUBLIC porque el modificador PROTECTED no está permitdo 
//a nivel de clases
    
//tengo un atributo PROTECTED, al cual voy a poder acceder desde las clases 
//hijas y si estoy dentro del mismo paquete
    protected String atributoProtected = "Valor atributo protected";
    
    
//Agrego un constructor publico porque si solo tengo el protected no voy a 
//poder instanciar objetos
    public Clase1(String arg) {
        System.out.println("Constructor public");
    }
//constructor protected -> desde otra clase, sin restriccion puedo acceder a este constructor
    protected Clase1() {
        System.out.println("Constructor protected");
    }
    

//un metodo public se va a poder acceder desde otra clase
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }

    
}
