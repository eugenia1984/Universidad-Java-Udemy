package domain;

public enum TipoEscritura {  //es una enumeracion
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){ //va en mayuscula como el nombre dle enum
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
}
