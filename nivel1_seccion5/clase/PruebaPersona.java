package clase;

public class PruebaPersona {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();  //instancio mi objeto
        persona1.nombre = "Maria Eugenia";
        persona1.apellido = "Costa";
        persona1.desplegarInformacion();
        
        //instancio un nuevo objeto
        Persona persona2 = new Persona();
        persona2.nombre = " Ana";
        persona2.apellido = "Baez";
        persona2.desplegarInformacion();
    }
    
}
