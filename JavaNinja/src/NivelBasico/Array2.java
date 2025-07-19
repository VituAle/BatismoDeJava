package NivelBasico;

public class Array2 {
    public static void main(String[] args) {

        String [] [] ninjasEAldeia = new String[3][3];

        ninjasEAldeia [0] [0] = "Konoha";
        ninjasEAldeia [0] [1] = "Naruto Uzumaki";
        ninjasEAldeia [0] [2] = "Sasuke Uchiha";

        ninjasEAldeia [1] [0] = "Nevoa";
        ninjasEAldeia [1] [1] = "Zabuza";
        ninjasEAldeia [1] [2] = "Haku";

        ninjasEAldeia [2] [0] = "Deserto";
        ninjasEAldeia [2] [1] = "Gaara";
        ninjasEAldeia [2] [2] = "Temari";


        for (int i = 0; i < ninjasEAldeia.length; i++) {
            System.out.println("Aldeia " + ninjasEAldeia[i][0] + " - Ninja 1: " + ninjasEAldeia [i] [1] + " - Ninja 2: " + ninjasEAldeia [i] [2]);
            
        }
    }
}
