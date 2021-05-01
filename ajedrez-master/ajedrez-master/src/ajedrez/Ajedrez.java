package ajedrez;

import vista.VistaTablero;


public class Ajedrez {


    public static void main(String[] args) 
    {
        Tablero tablero = new Tablero();
        VistaTablero juego = new VistaTablero(tablero);       
        juego.setVisible(true);
        
        
    }

    
    
    
}
