package NivelIntermediario.ClassesAbstrata;

public abstract class Hokages {

    String nome;
    int idade;
    boolean VivoOuNao;
    String aldeia;
    int missoes;
    double SaldoBancario;
    double altura;


    public abstract void SabedoriaHokages();



    public Hokages(int idade, String nome, String aldeia, boolean vivoOuNao, int missoes, double saldoBancario, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.aldeia = aldeia;
        VivoOuNao = vivoOuNao;
        this.missoes = missoes;
        SaldoBancario = saldoBancario;
        this.altura = altura;
    }

    public Hokages() {
    }
}
