package ejercicio02;

/**
 * Widget de la pantalla principal.
 */
public class HomeWidget implements PlayerObserver {

    @Override
    public void onPlayerChanged(PlaybackState state, String songTitle) {
        System.out.println("Widget de la pantalla principal: " + state.getLabel() + " | " + songTitle);
    }
}
