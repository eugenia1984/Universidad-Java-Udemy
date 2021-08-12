package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada { ///Hereda de la super clase DispositivoEntrada

    //Atributos
    private final int idTeclado;
    private static int contadorTeclados;

    //constructor
    public Teclado(String tipoEntrada, String marca) {
    ///Constructos de la clase SUPER
        super(tipoEntrada, marca);
    ///Los atributos particulares de Teclado
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    
    //ToString
    @Override
    public String toString() {
    ///super.toString() para los atributos heredados de la clase super
        return "Teclado{" + " idTeclado = " + idTeclado + ", " + super.toString() + '}';
    }
}
