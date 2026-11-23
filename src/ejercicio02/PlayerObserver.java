package ejercicio02;

/**
 * Interfaz que implementan todas las vistas del reproductor.
 * Las vistas no consultan al reproductor: reaccionan a esta notificación.
 */
public interface PlayerObserver {

    void onPlayerChanged(PlaybackState state, String songTitle);
}
