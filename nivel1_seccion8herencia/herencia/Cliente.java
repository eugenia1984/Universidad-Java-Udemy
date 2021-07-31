package herencia;

import herencia.Persona;
import java.util.Date;

public class Cliente extends Persona{

    //Atributos
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    //constructores
     public Cliente(Date fechaRegistro, boolean vip, String nombre, 
             char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion); 
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
     
    //Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    //toString

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + 
                fechaRegistro + ", vip=" + vip + ",  " + super.toString();
    }
    
   
    

   
}
