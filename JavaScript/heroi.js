class heroi {
    constructor(nome, idade, tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;

        switch (this.tipo) {
            case "mago":
                this.tipoAtaque = "magia";
                break;
            case "guerreiro":
                this.tipoAtaque = "espada";
                break;
            case "monge":
                this.tipoAtaque = "artes marciais";
                break;
            case "ninja":
                this.tipoAtaque = "shuriken";
                break;
        }
    }

    atacar() {
       return console.log(`O ${this.tipo} ${this.nome} atacou usando ${this.tipoAtaque}`);
    }
}

const juninho = new heroi("Juninho", 25, "mago");
const alberto = new heroi("Alberto", 34, "guerreiro");

juninho.atacar();
alberto.atacar();