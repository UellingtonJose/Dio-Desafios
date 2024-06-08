public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Minha Música Favorita");

        // Testando funcionalidades do aparelho telefônico
        meuIphone.ligar("000000000");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades do navegador de internet
        meuIphone.exibirPagina("https://www.dio.me/");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
