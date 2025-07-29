package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.HabilidadeEspecial();
        Naruto.EstrategiaDeBatalhaNinja();


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 17;
        Sasuke.HabilidadeEspecial();

        Uchiha Itachi = new Uchiha("Itachi Ichiha", "Aldeia da Folha", 27);
        Itachi.HabilidadeEspecial();

    }
}
