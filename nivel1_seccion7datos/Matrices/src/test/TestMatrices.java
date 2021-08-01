package test;

import domain.Persona;

public class TestMatrices {
    
    public static void main(String[] args) {
        
        int edades[][]= new int[3][2];
        
//Ejemplo de como asignar un valor manualmente
///primer fila    
    edades[0][0] = 10;
    edades[0][1] = 2;
///segunda fila    
    edades[1][0] = 8;
    edades[1][1] = 23;
///tercer fila    
    edades[2][0] = 4;
    edades[2][1] = 90;
    
/* Iterar los elementos con FOR ANIDADOS   
        for (int fila = 0; fila < edades.length; fila++) { ///para recorrer filas
            
            for (int columna = 0; columna < edades[fila].length; columna++) { ///para recorrer columnas
                System.out.println("edades : " + fila + " -  " + columna + " : " + 
                        edades[fila][columna]);
            }
        }

    }
*/

//Sintaxis simplificada en matriz
    String frutas[][] = {{"Naranja", "Limón"}, {"Frutillas", "Arándanos"}};
    
/* For anidados para mostrarla
    for (int f = 0; f < frutas.length; f++) { 
            
        for (int columna = 0; columna < frutas[f].length; columna++) { 
            System.out.println("Frutas : " + f + " -  " + columna + " : " +  frutas[f][columna]);
        }
    }
*/

//Llamo al método imprimir() para ver el arreglo de frutas
    System.out.println("Matriz frutas: ");
    imprimir(frutas);
    System.out.println("-----------------------");

//creo una matriz de objetos de tipo persona

    Persona personas [][] = new Persona[2][3];
//Les asigno los valores a la primer fila
    personas[0][0] = new Persona("Juan"); 
    personas[0][1] = new Persona("Ana"); 
    personas[0][2] = new Persona("Mara"); 
//Les asigno los valores a la segunda fila
    personas[1][0] = new Persona("Juana"); 
    personas[1][1] = new Persona("Analia"); 
    personas[1][2] = new Persona("Maria");  
    
//Llamo mi método imprimir() para ver el arreglo de Persona  
    System.out.println("Matriz personas : ");
    imprimir(personas);

  }
    
  //metodo para imprimir mi matriz  
  public static void imprimir(Object matriz[][]) {
      for (int i = 0; i < matriz.length; i++) { 
            
        for (int j = 0; j < matriz[i].length; j++) { 
            System.out.println("Matriz : " + i + " -  " + j + " : " +  matriz[i][j]);
        }
    }
  
  }  

}
