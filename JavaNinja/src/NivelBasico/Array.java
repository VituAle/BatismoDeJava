package NivelBasico;

public class Array {
    public static void main(String[] args) {

        String [] ninja = new String[6];
        ninja [0] = "Naruto Uzumaki";
        ninja [1] = "Sasuke Uchiha";
        ninja [2] = "Sakura Haruno";
        ninja [3] = "Hinata Hyuga";
        ninja [4] = "Kakashi";

        System.out.println(ninja[7]);


        ninja = new String[7];
        ninja [0] = "Hashirama";
        ninja [1] = "Tobirama";
        ninja [2] = "Haruzen";
        ninja [3] = "Minato";
        ninja [4] = "Tsunade";
        ninja [5] = "Kakashi";
        ninja [6] = "Naruto";

        for (int i = 0; i < 7; i++) {

            System.out.println(ninja[i]);

        }

        int [] idade = new int[2];
        idade [0] = 17;

        System.out.println(idade[1]);

        boolean [] verdadeiroOuFalso = new boolean[1];

        System.out.println(verdadeiroOuFalso[0]);


    }
}
