/*
CHAR = un solo caracter. Son los caracteres uniocode.
 */

public class Char {
    public static void main(String args[])  {
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        // caracter unicode
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; // Para hacer una conversion
        System.out.println("varCharDecimal = " + varCharDecimal);
        //simbolo
        char varSimbolo = '!';
        System.out.println("varSimbolo = " + varSimbolo);
        //un tipo char puede convertirse a entero
        int VaraibleEnteraSimbolo = '!';
        System.out.println("VaraibleEnteraSimbolo = " + VaraibleEnteraSimbolo);  //Pero me imprime 33, se convierte a su codigo decimal
                
    }
    
}
