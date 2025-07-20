package NivelIntermediario.Desafio4;

public class NinjaAvançado extends NinjaBasico implements Ninja {

    String Especialidade;


    public NinjaAvançado(String nome, int idade, String habilidade, String especialidade) {
        Especialidade = especialidade;
        this.habilidade = habilidade;
        this.nome = nome;
        this.idade = idade;
    }

    public NinjaAvançado(){

    }

    @Override
    public void MostrarInformaçoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);

    }

    @Override
    public void ExecutarHabilidade() {
        System.out.println("Especialidade: " + Especialidade);

    }
}
