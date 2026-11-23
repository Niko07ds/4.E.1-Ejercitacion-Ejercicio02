package ejercicio02;

/**
 * Ventana flotante de miniatura.
 */
public class FloatingThumbnail implements PlayerObserver {

    @Override
    public void onPlayerChanged(PlaybackState state, String songTitle) {
        System.out.println("Miniatura flotante: " + songTitle + " - " + state.getLabel());
    }
}
