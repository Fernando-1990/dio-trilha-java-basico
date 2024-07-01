import dispositivo.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone cel = new Iphone();

        cel.tocar();
        cel.ligar();
        cel.iniciarCorreioVoz();
        cel.atender();
        cel.adicionarNovaAba();
        cel.atualizarPagina();
        cel.exibirPagina();
        cel.pausar();
        cel.selecionarMusica();
    }
}
