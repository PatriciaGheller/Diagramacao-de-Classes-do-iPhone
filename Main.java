public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Teste das funcionalidades do iPhone
        iphone.play();
        iphone.fazerChamada("123-456-7890");
        iphone.abrirPagina("https://www.example.com");
        iphone.pause();
        iphone.receberChamada("987-654-3210");
        iphone.navegarParaFrente();
        iphone.stop();
        iphone.encerrarChamada();
        iphone.fecharPagina();
        iphone.previousTrack();
    }
}