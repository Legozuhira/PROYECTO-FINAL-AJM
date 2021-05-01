
package ajedrez;

public interface ITablero {
    boolean esMovimientoPosible(Movimiento mov, Pieza pieza);
    Pieza ejecutarMovimiento(Movimientos mov);
    void colocarPiezas();
    boolean jugadorHaceJaqueMate(Jugador jug);
    
}
