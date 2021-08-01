
package test;


public class TestArreglos {
    
    public static void main(String[] args) {
        
//Arreglo de tipo entero con dimensión 3
        int edades[] = new int[3];
        System.out.println("Arreglo edades, su lugar en memoria: " + edades);
        
//Para acceder a los elementos del arreglo y modificarlos
        edades[0] = 10;
        System.out.println("El primer índice del arreglo edades: " + edades[0]);
//Agrego los demás valores de mi arreglo edades y los imprimo
        edades[1]= 32;
        System.out.println("El segundo índice del arreglo edades: " + edades[1]);
        edades[2]=2;
        System.out.println("El tercer índice del arreglo edades: " + edades[2]);
        
//Con un FOR recorro mi arreglo 
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Arreglo edades con índice : " + i + ",  valor: " + edades[i]);
        }
    }
    
//Nuevo arreglo con sintaxis resumida
    String frutas[] = {"Naranja", "Banana", "Uva"};
//Mando por consola mi arreglo de frutas
    //for (int i = 0; i < frutas.length; i++) {
    //        System.out.println("Arreglo frutas, indice: " + i);
    //} 
}
