/*
TIPOS PRIMITIVOS ENTEROS
-byte : 8 bits . -128 al 127
-short : 16 bits . -32768 al 32767
-int : 32 bits .  -2147483648 al  2147483647
-long : 64 bits . -9223372036854775808 al  9223372036854775807
 */
public class Enteros {
    
    public static void main(String args[])  {
    byte numeroByte = 10;
    byte numeroByte2 = (byte)129;
    
    System.out.println("Valor variable numeroByte2 : " + numeroByte2);  //-127
    System.out.println(" Valor minimo byte : " + Byte.MIN_VALUE );  //-128
    System.out.println(" Valor maximo byte : " + Byte.MAX_VALUE );  //127
    
    //Short
    short numeroShort = 32000;
    System.out.println("numeroShort = " + numeroShort);
    System.out.println(" Valor minimo short : " + Short.MIN_VALUE );  //-32768
    System.out.println(" Valor maximo short : " + Short.MAX_VALUE );  //32767
    
    //Int
    System.out.println(" Valor minimo int : " + Integer.MIN_VALUE );  //  -2147483648
    System.out.println(" Valor maximo int : " + Integer.MAX_VALUE );  // 2147483647
        
    //Long
    System.out.println(" Valor minimo long : " + Long.MIN_VALUE );  //  -9223372036854775808
    System.out.println(" Valor maximo long : " + Long.MAX_VALUE );  // 9223372036854775807
    
    }
}
