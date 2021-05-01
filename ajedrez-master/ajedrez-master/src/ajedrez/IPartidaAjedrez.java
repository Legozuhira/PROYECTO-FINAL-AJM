
package ajedrez;

public interface IPartidaAjedrez {
    static enum Color {Blancas, Negras};

    Jugador empezar();
    void guardarMovimiento(String nombre, Movimientos mov);
}
