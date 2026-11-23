package ejercicio02;

/**
 * Barra inferior de control de la aplicación.
 */
public class BottomControlBar implements PlayerObserver {

    @Override
    public void onPlayerChanged(PlaybackState state, String songTitle) {
        System.out.println("Barra inferior de control: [" + state.getLabel() + "] " + songTitle);
    }
}
