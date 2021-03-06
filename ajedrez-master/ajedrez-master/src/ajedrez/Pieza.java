

package ajedrez;

import java.util.ArrayList;


public abstract class Pieza implements IPieza {
    public Posicion posicion;
    public Color color;
    
    //implementacion del constructor de la clase Pieza
    /* El contructor va a recibir la posicion
     * de la pieza al crearla y su color
     */
    public Pieza(Posicion pos, Color col){
        this.posicion = pos;
        this.color = col;
    }
    
    @Override
    public void actualizarPosicion(Posicion nuevaPosicion) {
        posicion.setColumna(nuevaPosicion.columna);
        posicion.setFila(nuevaPosicion.fila);
    }
    
    public void MostrarTodas()
    {
        
    }
    public String tipoPieza(){
        return null;
    }
    
    @Override
    public String toString(){
        return null;    
    }
}
