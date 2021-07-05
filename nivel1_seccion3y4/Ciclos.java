
package ciclos;


public class Ciclos {


    public static void main(String[] args) {
        
        // EJEMPLO DE WHILE
        System.out.println("-------Ejemplo de While-----------");
        int contador= 0;
        while(  contador < 3) {
            System.out.println("Contador : " + contador);
            contador++;  //Luego de imprimirlo lo aumento en un valor
        }
        System.out.println("-------Ejemplo de Do While-----------");
        
        //EJEMPLO DE DO WHILE
        int contador2 = 0;
        do {            
             System.out.println("Contador : " + contador2);
            contador2++;  //Luego de imprimirlo lo aumento en un valor
        } while (contador2 < 3);
        System.out.println("--------Ejemplo de For ----------");
        
        //EJEMPLO DE FOR
        for (int contador3 = 0; contador3 < 3; contador3++) {
            System.out.println("Contador : " + contador3);
        }
        
    }
    
}
