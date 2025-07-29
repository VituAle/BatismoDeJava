package NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.println(" Meu nome é: " + nome + " , e esse é meu ataque Uzumaki, um ataque de ar. ");
    }

    @Override
    public void EstrategiaDeBatalhaNinja(){
        System.out.println(" Meu nome é: " + nome + " e essa é minha estrategia de batalha");
    }
}
