

import src.iphone.AparelhoTelefonico;
import src.iphone.NavegadorInternet;
import src.iphone.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música...");
    }

    @Override
    public void stop() {
        System.out.println("Parando música...");
    }

    @Override
    public void nextTrack() {
        System.out.println("Próxima faixa...");
    }

    @Override
    public void previousTrack() {
        System.out.println("Faixa anterior...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada...");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página...");
    }

    @Override
    public void navegarParaFrente() {
        System.out.println("Navegando para frente...");
    }

    @Override
    public void navegarParaTras() {
        System.out.println("Navegando para trás...");
    }
}

