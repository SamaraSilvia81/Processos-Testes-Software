package entities;

public class Gato extends Animal {
    private String cor;

    public Gato(){

    }

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String fazerBarulho(){
        return "Miau miau";
    }
}
