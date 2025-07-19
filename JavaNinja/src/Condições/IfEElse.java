package Condições;

public class IfEElse {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDemissões = 9;


        if (numeroDemissões == 10 && idade > 15) {
            System.out.println("Rank: Shunnin");
        } else if (numeroDemissões >= 20) {
            System.out.println("Rank: Jonin");
            
        } else {
            System.out.println("Rank: Gennim");
        }

    }
}
