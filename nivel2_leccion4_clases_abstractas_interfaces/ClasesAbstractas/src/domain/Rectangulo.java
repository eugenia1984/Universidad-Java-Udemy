package domain;


public class Rectangulo extends FiguraGeometrica{ //es hija de figura geometrica

    //constructor
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    //implemento el metodo de la clase padre, pero no sobreescribo porque la 
    //clase madre no tiene definido el comportamiento, aca lo implemento por 
    //primera vez, por eso tengo el circulo con la I de implements
    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
    
}
