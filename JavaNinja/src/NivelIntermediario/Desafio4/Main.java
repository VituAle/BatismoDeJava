package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Sasuke = new NinjaBasico("Sasuke Uchiha", 17, "Mokuton");
        Sasuke.MostrarInformaçoes();
        System.out.println("------------------------------------");
        Sasuke.ExecutarHabilidade();

        System.out.println("\n");


        NinjaAvançado Orochimaru = new NinjaAvançado("Orochimaru", 24, "Jutsu de transferência de corpo", "Justu de Reencarnação");
        Orochimaru.MostrarInformaçoes();
        System.out.println("------------------------------------");
        Orochimaru.ExecutarHabilidade();

    }
}
