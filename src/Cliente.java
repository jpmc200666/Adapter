public class Cliente implements Reproductor{
    private Adaptadormedia adaptadormedia;

    @Override
    public void reproducir(String tipoAudio, String nombreArchivo){
        if(tipoAudio.equalsIgnoreCase("mp3")){
            System.out.println("Reproduciendo archivo mp3: " + nombreArchivo);
        }else if(tipoAudio.equalsIgnoreCase("vlc") || tipoAudio.equalsIgnoreCase("mp4")){
            adaptadormedia = new Adaptadormedia(tipoAudio);
            adaptadormedia.reproducir(tipoAudio, nombreArchivo);
        } else {
            System.out.println("Formato no soportado" + tipoAudio);
        }
    }

}
