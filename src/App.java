public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        
        cliente.reproducir("mp3", "cancion.mp3");
        cliente.reproducir("mp4", "video.mp4");
        cliente.reproducir("vlc", "pelicula.vlc");
        cliente.reproducir("avi", "archivo.avi");
    }
}
