public class MediaAdapter implements MediaPlayer {

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        System.out.println("Reproduzindo MP4: " + nome);
    }
}
