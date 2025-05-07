public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void buscar(String termo) {
        System.out.println("Buscando por: " + termo);
    }
}
