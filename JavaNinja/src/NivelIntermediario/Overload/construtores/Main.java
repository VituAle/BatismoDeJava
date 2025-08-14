package NivelIntermediario.Overload.construtores;

public class Main {
    public static void main(String[] args) {


        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki","Aldeia da Folha", 16,5,NivelNinja.GENIN, Biju.KURAMA);
        Naruto.habilidadeEspecial();


        // Obj uchiha
        Uchiha Sasuke = new Uchiha("Sasuke uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        Sasuke.habilidadeEspecial();

        // Obj Uchiha 2
        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27 );
        Itachi.habilidadeEspecial();

        // obj Uchiha 3
        Uchiha Madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45,900, NivelNinja.KAGE);
        Madara.habilidadeEspecial();
        Madara.EstrategiaDeBatalhaNinja();
        Madara.InteligenciaDeBatalha();
        Madara.InteligenciaDeCombata(151);


    }
}
