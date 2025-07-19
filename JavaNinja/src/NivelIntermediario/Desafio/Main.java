package NivelIntermediario.Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner CaixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha um personagem Uchiha: ");
        System.out.println("1 - Obito Uchiha");
        System.out.println("2 - Itachi Uchiha");
        System.out.println("3 - Sasuke Uchiha");

        int EscolhaDoUsuario = CaixaDeTexto.nextInt();

        System.out.println("Você digitou o número: " + EscolhaDoUsuario);


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.NivelDeDificuldade = "Alta";
        Sasuke.StatusDaMissao = "Em Andamento";
        Sasuke.Missao = "Aprender com o time 7";
        Sasuke.MostrarInformaçoes();

        Uchiha Itachi = new Uchiha();
        Itachi.nome = "Itachi Uchiha";
        Itachi.idade = 20;
        Itachi.NivelDeDificuldade = "Elevada";
        Itachi.StatusDaMissao = "Em Andamento";
        Itachi.Missao = "Proteger a vila da Folha";
        Itachi.MostrarInformaçoes();

        Uchiha Obito = new Uchiha();
        Obito.nome = "Obito Uchiha";
        Obito.idade = 26;
        Obito.NivelDeDificuldade = "Impossível";
        Obito.StatusDaMissao = "Em Andamento";
        Obito.Missao = "Destruir a vila da Folha.";
        Obito.MostrarInformaçoes();


        switch (EscolhaDoUsuario) {
            case 1:
                System.out.println(Sasuke);
                break;
            case 2:
                System.out.println(Itachi);
                break;
            case 3:
                System.out.println(Obito);
                break;
            default:
                System.out.println("Você não digitou uma resposta válida! tente de novo.");


        }




    }
}
