/*
 * Representa mi tabla PERSONa de la base de datos, es mi CLASE ENTIDAD
 */
package domain;

public class Persona {
    //atributos que coinciden con las columnas de mi base de datos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    //constructores
    public Persona() {
    }
    //constructor con el parámetro idPersona (sobrecarga de constructores)
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }
    //constructor para insertar nuevo registro (sobrecarga de constructores)
    //sin PK porque es autoincremental
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    //constructor con todos los atributos para modificar (sobrecarga de constructores)
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    //getters y setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //toString

    @Override
    public String toString() {
        return "Persona{" + "idPersona = " + idPersona + ", nombre = " + nombre 
                + ", apellido = " + apellido + ", email = " + email 
                + ", telefono = " + telefono + '}';
    }
    
}
