package NivelIntermediario.Desafio;

public class Uchiha extends Ninja {

    String HabilidadeEspecial;

    public void MostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + HabilidadeEspecial);
    }

    public void MostrarInformaçoes() {
        System.out.println("Nome = " + nome);
        System.out.println("Nível de dificuldade = " + NivelDeDificuldade);
        System.out.println("Status da missão = " + StatusDaMissao);
        System.out.println("Missão = " + Missao);
        System.out.println("Idade = " + idade );
        System.out.println("Habilidade Especial Uchiha. ");

    }
}
