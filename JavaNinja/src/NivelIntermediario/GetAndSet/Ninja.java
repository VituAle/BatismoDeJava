package NivelIntermediario.GetAndSet;

public class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int NumeroDeMissoesConcluidas;
    private double altura;


    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        NumeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    public Ninja() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return NumeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        NumeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
