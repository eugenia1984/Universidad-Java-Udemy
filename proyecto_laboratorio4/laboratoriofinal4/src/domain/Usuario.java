package domain;


public class Usuario {
    //atributos
    private int idUsuario; //id_usuario en mi bd
    private String userName; //usuario en mi bd
    private String password;  //password en mi bd
    
    //constructor vacio
    public Usuario() {
    }
    //constructor con los tres atributos (sobrecarga de constructores)
    public Usuario(int idUsuario, String userName, String password) {
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.password = password;
    }
    //constructor con parametros sin idUsuario (sobrecarga de constructores)
    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    //constructor solo con id
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    //getters y setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //toString

    @Override
    public String toString() {
        return "usuario{" + "idUsuario = " + idUsuario + ", userName = " 
                + userName + ", password = " + password + '}';
    } 
    
}
