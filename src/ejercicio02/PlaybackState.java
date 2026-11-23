package ejercicio02;

/**
 * Estados posibles del reproductor multimedia.
 */
public enum PlaybackState {
    PLAYING("Reproduciendo"),
    PAUSED("Pausado"),
    STOPPED("Detenido");

    private final String label;

    PlaybackState(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
