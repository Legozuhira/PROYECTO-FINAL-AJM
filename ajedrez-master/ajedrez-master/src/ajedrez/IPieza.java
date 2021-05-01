
package ajedrez;


public interface IPieza 
{
    Movimientos getMovimientosPosibles();
    boolean esMovimientoPosible(Posicion nuevoDestino);
    void actualizarPosicion(Posicion nuevaPosicion);
}
