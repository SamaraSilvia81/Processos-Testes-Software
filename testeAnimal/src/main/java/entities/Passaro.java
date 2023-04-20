package entities;

public class Passaro extends Animal{
    private String tipo;

    public Passaro(){

    }

    public Passaro(String nome, int idade, String tipo) {
        super(nome, idade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String fazerBarulho(){
        return "Cantando";
    }
}
