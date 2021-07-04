/*
FLOAT: 32 bits . Default: 0.0 . Del 3.4028235E38 al 1.4E-45
DOUBLE. 64 bits . Default: 0.0.Desde 1.7976931348623157E308 al  4.9E-324. Tienen un . para indicar cuando comienza el decimal.
 */
public class FloatDouble {
     public static void main(String args[])  {
         
        //Float
        System.out.println("Valor minimo tipo float : " + Float.MAX_VALUE);  // 3.4028235E38
        System.out.println("Valor maximo float : " + Float.MIN_VALUE);  // 1.4E-45
        
        //Double
        System.out.println("Valor minimo tipo double: " + Double.MAX_VALUE);//  1.7976931348623157E308
        System.out.println("Valor maximo double: " + Double.MIN_VALUE); //  4.9E-324
     }
}
