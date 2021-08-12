/*
Ejemplo de ENUM con atributos, en este caso los continentes tiene como atributo
la cantidad de paises que tiene cada uno.
Pro estos atributos son private y estan encapsulados, por medio de un método getPaises
recupero el valor, no puedo usar setPaises porque es uun atributo que NO debe modificarse

Por cada valor de la enumeracion puedo tneer más atributos, siempre que los tenga
en el constructor y en su getAtributo
*/
package enumeracion;


public enum Continentes {
    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int paises; 
    //es FINAL porque una vez que le asigno valor no quiero se modifique
    
    //Constructor del mismo nombre que la enumeracion
    Continentes(int paises) {
        this.paises= paises;
    }
    
    public int getPaises() {
        return this.paises;
    }
}

