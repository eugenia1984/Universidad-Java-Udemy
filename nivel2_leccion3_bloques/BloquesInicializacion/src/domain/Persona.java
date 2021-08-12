
package domain;


public class Persona {
    
    //Defino algunos atributos de la clase
    private final int idPersona;
    private static int contadorPersona;
    
    //Bloque de inicialiacion estatico -> se ejecuta una sola vez
    //Se ejecuta al cargar al clase en memoria
    //Dentro no puedo utilizar .this
    static {
        System.out.println("Ejecucion bloque estático");
        ++Persona.contadorPersona;  //Para incrementar la variable
        //idPersona = 10; como es final no se puede inicializar
    }
    
    //bloque de inicializacion NO estático -> se ejecuta cada vez que se instancia un nuevo objeto de la clase
    //se ejecuta antes del constructor de la clase
    //Dentro si puedo utilizar .this
    {
        System.out.println("Ejecucion de bloque no estático");
        this.idPersona = Persona.contadorPersona++;
    }
    //Constructor de clase
    //cuando se llame a este constructor ya se ejecutaron los dos bloques anteriores
    //estático y no estático
    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        return "Persona{" + "idPersona = " + idPersona + '}';
    }
    
    
}
