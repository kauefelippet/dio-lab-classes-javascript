public class Heroi {

    private String nome;
    private int idade;
    private TipoHeroi tipo;
    private String tipoAtaque;

    public Heroi(String nome, int idade, TipoHeroi tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;

        switch (this.tipo) {
            case MAGO: this.tipoAtaque = "magia";
            break;

            case GUERREIRO: this.tipoAtaque = "espada";
            break;

            case MONGE: this.tipoAtaque = "artes marciais";
            break;

            case NINJA: this.tipoAtaque = "shuriken";
            break;
        }
    }

    public void atacar() {
        System.out.printf("\nO %s %s atacou o alvo utilizando sua %s", tipo, nome, tipoAtaque);
    }
}