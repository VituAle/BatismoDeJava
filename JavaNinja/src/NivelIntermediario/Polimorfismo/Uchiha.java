package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.println(" Meu nome é: " + nome + " , e esse é meu ataque Uchiha, um ataque de fogo. ");
    }

    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " E essa é minha estrategia de batalha ");
    }
}
