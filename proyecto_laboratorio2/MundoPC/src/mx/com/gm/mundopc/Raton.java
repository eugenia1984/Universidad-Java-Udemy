package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada{  ///Hereda de DispositivoEntrada
    
    //Atributos
    private final int idRaton;
    private static int contadorRatones;
    
    //Constructor
    public Raton(String tipoEntrada, String marca){
    ///Llamo al contructor que hereda de la super clase DispositivoEntrada
        super(tipoEntrada, marca); 
    ///El atributo contadorRatones es propio de la clase Raton
        this.idRaton = ++Raton.contadorRatones;
    }
    
    //ToString
    @Override
    public String toString() { 
    ///super.toString() para los atributos heredados de la super clase
        return "Raton { " + "idRaton = " + idRaton + ", " + super.toString() +'}';
    }
    
}
