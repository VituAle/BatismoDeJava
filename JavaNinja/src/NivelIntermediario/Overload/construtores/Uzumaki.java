package NivelIntermediario.Overload.construtores;

public class Uzumaki extends  Ninja {

    Biju Biju;


    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, Biju Biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.Biju = Biju;
    }



    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar. Eu já completei: " + numeroDeMissoesConcluidas + ", E eu tenho a Biju: " + Biju.getNomeBiju());
    }

}
