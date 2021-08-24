package test;

import accesodatos.IAccesoDatos;
import accesodatos.*;

public class TestInterfaces {


    public static void main(String[] args) {
        //defino una variable de tipo INTERFACE
        //NO voy a poder crear objetos de tipo IAccesoDatos (interface)
        //si puedo apuntar a un objeto que implemente la interface como
        //Implementacion MySql o ImplementacionOracle
        IAccesoDatos datos = new ImplementacionMySql();
        //aplico polimorfismo, se implementa el metodo dle objeto al cual apunta
        //la interface, es decir a ImplementacionMYSql
        //datos.listar();
        imprimir(datos);
        
        //reutilizo la variable pero ahora apunto a la clase ImplementacionOracle
        //Y voy a llamar al metodo listar de la clase ImplementacionOracle
        datos = new ImplementacionOracle();
        imprimir(datos);
    }
    
    //metodo generico que llama a listar desde una interfaz
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
   }
    
}
