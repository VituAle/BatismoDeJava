package Condições;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        Scanner CaixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int EscolhaDoUsuario = CaixaDeTexto.nextInt();

        System.out.println("Você digitou o número: " + EscolhaDoUsuario);

        switch (EscolhaDoUsuario) {
            case 1:
                System.out.println(" O usuário escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu Sakura Haruna");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida! tente de novo.");


        }



        CaixaDeTexto.close();
    }
}
