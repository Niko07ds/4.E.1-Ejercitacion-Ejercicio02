package ejercicio02;

public class Main {

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        PlayerObserver controlBar = new BottomControlBar();
        PlayerObserver thumbnail = new FloatingThumbnail();
        PlayerObserver widget = new HomeWidget();

        System.out.println("Registrando las tres vistas en el reproductor");
        player.addObserver(controlBar);
        player.addObserver(thumbnail);
        player.addObserver(widget);

        System.out.println();
        System.out.println("El usuario selecciona una canción");
        player.changeSong("Bohemian Rhapsody");

        System.out.println();
        System.out.println("El usuario pausa el audio");
        player.pause();

        System.out.println();
        System.out.println("El usuario intenta pausar nuevamente");
        player.pause();

        System.out.println();
        System.out.println("El usuario reanuda la reproducción");
        player.resume();

        System.out.println();
        System.out.println("El usuario cambia de canción");
        player.changeSong("Imagine");

        System.out.println();
        System.out.println("Se cierra la ventana flotante (se desuscribe la miniatura)");
        player.removeObserver(thumbnail);

        System.out.println();
        System.out.println("El usuario detiene el reproductor");
        player.stop();
    }
}
