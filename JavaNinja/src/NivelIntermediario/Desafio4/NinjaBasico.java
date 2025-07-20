package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.habilidade = habilidade;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void MostrarInformaçoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);

    }

    @Override
    public void ExecutarHabilidade() {
        System.out.println("Habilidade: " + habilidade);

    }
}
