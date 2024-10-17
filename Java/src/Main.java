public class Main {

    public static void main(String[] args) {

        Heroi Juninho = new Heroi("Juninho", 25, TipoHeroi.MAGO);
        Heroi Alberto = new Heroi("Alberto", 34, TipoHeroi.GUERREIRO);

        Juninho.atacar();
        Alberto.atacar();
    }
}
