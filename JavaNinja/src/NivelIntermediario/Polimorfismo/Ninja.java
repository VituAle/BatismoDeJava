package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha{

    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja() {
    }

    public void HabilidadeEspecial(){

        System.out.println(" Meu nome é: " + nome + " E esse é meu ataque especial. ");
    }

    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println(" Meu nome é: " + nome + " E essa é minha estrategia");
    }

    ;
}
