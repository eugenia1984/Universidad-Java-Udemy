package operadorDeAsignacion;


public class OperadorDeAsignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaro las variables
        int a = 3;
        int b = 2;
        //Operador de asignacion
        int c = a + 5 - b;  //3+5-8 = (3+5)-8
        System.out.println("c = " + c);
        a+=1; //a = a + 1
        System.out.println("a = " + a);
        a+=3;  // a = a + 3
        System.out.println("a = " + a);

        a-=2;  //a = a -2
        System.out.println("a = " + a);
        
        a*=4;  //a = a * 4
        System.out.println("a = " + a);
        
        a%=1; //a = a % 1
         
    }
    
}
