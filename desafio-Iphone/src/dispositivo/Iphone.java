package dispositivo;

import recursos.internet.NavegadorNaInternet;
import recursos.musica.ReprodutorMusical;
import recursos.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {


    @Override
    public void tocar() {
        System.out.println("Tocando uma musica...");

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Págiona atualizada com sucesso!");

    }

    @Override
    public void ligar() {
        System.out.println("ligando...");

    }

    @Override
    public void atender() {
        System.out.println("atendendo...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando o correio por voz...");
    }
}

