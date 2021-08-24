package domain;


public abstract class FiguraGeometrica { //debe ser clase ABSTRACT por tener metodo ABSTRACT
    private String tipoFigura;  //es protected se HEREDA a las hijas
    
    //constructor de la clase
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    //Metodo abstracto, no va con {}
    public abstract void dibujar();

    //get & set
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura = " + tipoFigura + '}';
    }
    
    
}
