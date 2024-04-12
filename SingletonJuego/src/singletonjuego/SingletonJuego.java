package singletonjuego;

public class SingletonJuego {

    public static void main (String[] args){
        
    Datos unicaInstancia = Datos.getInstance();
    
    unicaInstancia.setMaxIntentos(2);
    unicaInstancia.setRondas(10);
    unicaInstancia.setAlias("Kike");
        
    }
    
}
