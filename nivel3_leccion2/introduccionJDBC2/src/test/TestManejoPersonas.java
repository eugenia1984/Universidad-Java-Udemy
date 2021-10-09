
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;


public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
               
        //Hago la prueba de insertar una nueva persona
        //creo un nuevo objeto de tipo persona y lo INSERTO en mi BD
        //con el constructor que tiene todos los parametros menos el id_persona
        //Persona personaNueva = new Persona("Maria", "Sanchez", "msanchez@gmail.com","541145678956");
        //personaDAO.insertar(personaNueva);
        
        //Hago la prueba de modificar una persona existente
        //Persona personaModificar = new Persona(3, "Mirta", "Sanchez", "m.sanchez@gmail.com","541112345678");
        //personaDAO.actualizar(personaModificar);
        
        //hago la prueba de eliminar un registro
        Persona personaEliminar = new Persona(1);
        personaDAO.eliminar(personaEliminar);
        
        //recupero todos los objetos de tipo persona
        List<Persona> personas = personaDAO.seleccionar();
        //imprimo le listado con un foreach
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
        /*
         * Puedo usar la FUNCION LAMBDA
         * personas.forEach(persona->) {
         *     System.out.println("persona = " + persona);
         * }
        */
    }
}
