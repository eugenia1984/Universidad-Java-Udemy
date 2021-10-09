package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;


public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();
        
        //Ejecutando el listado de usarios
        //Lo asigno a una lista de tipo Usuario
        List<Usuario> usuarios = usuarioJdbc.select();
        //recorro la colecion
        for(Usuario usuario : usuarios){
            //mando a imprimir el objeto
            System.out.println("Usuario: " + usuario);
        }
        
        //Insertamos un nuevo usuario
        Usuario usuarioNuevo = new Usuario("carlos", "123");
        usuarioJdbc.insert(usuarioNuevo);
        
        //modificamos un usuario
        Usuario usuarioModificado = new Usuario (2, "carlos", "123456");
        usuarioJdbc.update(usuarioModificado);
        
        //eliminamos un usuario
        usuarioJdbc.delete(new Usuario(1));
    }
            
}
