package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja Kunai = new EquipamentosNinja("Kunai De Ferro");
        EquipamentosNinja Shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja Pergaminho = new EquipamentosNinja("Pergaminho");


        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(Kunai);
        bolsaGenerica.adicionarEquipamentos(Shuriken);
        bolsaGenerica.adicionarEquipamentos(Pergaminho);

        System.out.println(bolsaGenerica);
    }
}
