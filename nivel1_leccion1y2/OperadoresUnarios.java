package operadoresUnarios;

public class OperadoresUnarios {

    public static void main(String[] args) {
        int a = 3;
        int b = -a; //operador unario de cambio de signo
        System.out.println("a = " + a);
        System.out.println("b =  " + b);
        boolean c = true;
        boolean d = !c;  //operador unario de negacion
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        int e = 3; //coo se autoincremento, cambio su valor
        int f = ++e;  //preincremento, 1ro incremento y 2do uso su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        int g= 5;
        int h = g++; //postincremento 1ro uso su valor y do autoincremento
        System.out.println("g = " + g);  //teniamos pendiente un incremento
        System.out.println("h = " + h);
        int i =2;
        int j = --i; //predecremento 1ro decremento y 2do asigno
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        int k = 4;
        int l = k--; // 1ro de usa el valor de la variable y queda pendiente el decremento
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
    
}
