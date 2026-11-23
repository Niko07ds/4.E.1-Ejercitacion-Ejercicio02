package ejercicio02;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Motor de reproducción (sujeto observable). Encapsula la gestión de la
 * lista de observadores usando una colección segura ante modificaciones
 * concurrentes, de modo que una vista pueda desuscribirse mientras se notifica.
 */
public class MediaPlayer {

    private final CopyOnWriteArrayList<PlayerObserver> observers = new CopyOnWriteArrayList<>();
    private PlaybackState state = PlaybackState.STOPPED;
    private String songTitle = "Sin canción";

    public void addObserver(PlayerObserver observer) {
        if (observer != null) {
            observers.addIfAbsent(observer);
        }
    }

    public void removeObserver(PlayerObserver observer) {
        observers.remove(observer);
    }

    /**
     * Cambia la canción actual y comienza a reproducirla.
     */
    public void changeSong(String songTitle) {
        this.songTitle = songTitle;
        this.state = PlaybackState.PLAYING;
        notifyObservers();
    }

    public void pause() {
        if (state != PlaybackState.PLAYING) {
            System.out.println("Reproductor: no se puede pausar porque no se está reproduciendo nada");
            return;
        }
        state = PlaybackState.PAUSED;
        notifyObservers();
    }

    public void resume() {
        if (state != PlaybackState.PAUSED) {
            System.out.println("Reproductor: no se puede reanudar porque no está pausado");
            return;
        }
        state = PlaybackState.PLAYING;
        notifyObservers();
    }

    public void stop() {
        state = PlaybackState.STOPPED;
        notifyObservers();
    }

    private void notifyObservers() {
        for (PlayerObserver observer : observers) {
            observer.onPlayerChanged(state, songTitle);
        }
    }

    public PlaybackState getState() {
        return state;
    }

    public String getSongTitle() {
        return songTitle;
    }
}
