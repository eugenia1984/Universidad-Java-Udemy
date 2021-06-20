/*
BOOLEAN = true o false.
Valores de tipo bandera, si está en verde (true) podemos continuar, si está en rojo (false) no.
 */
public class Boolean {
    
    public static void main( String args[]) {
    
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        //varBoolean ya se entiende que es true, es como poner varBoolean ==true
        if (varBoolean) {
            System.out.println("La bandera es verdadera. ");
        } else {
            System.out.println("La bandera es falsa.");
        }
        
        //Otro ejemplo de algoritmo viendo si una persona es mayor de eddad
        int edad = 30;
        boolean esAdulto = edad >= 18; 
        if (esAdulto) {
            System.out.println("Tiene : " + edad + " Es meyor de edad");
        } else {
            System.out.println("Tiene: " + edad + "Es menor de edad");
        }
        
    }
}
