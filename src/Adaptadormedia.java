public class Adaptadormedia implements Reproductor{
    
    private Reproductoravanzado reproductoravanzado;

    public Adaptadormedia(String tipoAudio){
        if(tipoAudio.equalsIgnoreCase("vlc")){
            reproductoravanzado = new Reproductoravanzado();
        }else if(tipoAudio.equalsIgnoreCase("mp4")){
            reproductoravanzado = new Reproductoravanzado();
        }        
    }

    @Override
    public void reproducir(String tipoAudio, String nombreArchivo){
        if(tipoAudio.equalsIgnoreCase("vlc")){
            reproductoravanzado.reproducirVlc(nombreArchivo);
        }else if(tipoAudio.equalsIgnoreCase("mp4")){
            reproductoravanzado.reproducirMP4(nombreArchivo);
        }   
    }
}
