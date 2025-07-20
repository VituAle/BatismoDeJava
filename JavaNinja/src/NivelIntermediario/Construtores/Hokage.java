package NivelIntermediario.Construtores;

public class Hokage {

    String nome;
    int idade;
    boolean VivoOuNao;
    String aldeia;
    int missoes;
    double SaldoBancario;
    double altura;



    public Hokage(int idade, String nome, String aldeia, boolean vivoOuNao, int missoes, double saldoBancario, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.aldeia = aldeia;
        VivoOuNao = vivoOuNao;
        this.missoes = missoes;
        SaldoBancario = saldoBancario;
        this.altura = altura;
    }

    public Hokage() {
    }
}
