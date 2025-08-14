package NivelIntermediario.Overload.construtores;

public class Ninja implements EstrategiaDeBatalha{

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas , Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 1.76;

    public Ninja() {
    }

    // TODO NINJA VAI FAZER OBRIGATORIAMENTE

    final public void TacarKunai() {
        System.out.println("Eu sou um metodo da classe mãe! ");
    }

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamado os novos atributos
    // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome + " Essa é minha estrategia de combate");
    }

    @Override
    public void InteligenciaDeBatalha() {
        System.out.println("Meu nome é: " + nome + " Essa é minha inteligência de combate");
    }

    @Override
    public void InteligenciaDeCombata(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " você é um gênio");
            
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " você é um ninja promissor");
            
        }
        else {
            System.out.println("Seu QI é: " + qi + " você precisa treinar mais suas habilidades");
        }
    }

    @Override
    public String toString() {
        return "Esse é o metodo toString para retornar a referência de memória";
    }
}
