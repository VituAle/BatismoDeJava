package NivelBasico;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 10;
        String[] ninja = new String[NUMERO_MAX];

        int ninjasCadastrados = 0;
        int opçao = 0;

        while (opçao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opçao = scanner.nextInt();
            scanner.nextLine();


            switch (opçao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja para cadastro:");
                        String nomeNinja = scanner.nextLine();
                        ninja[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista ninja está cheia, impossível de cadastrar um novo ninja.");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        System.out.println("====== Lista de ninjas ======");
                        for (int i = 0; i < ninja.length; i++) {
                            System.out.println(ninja[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n===== Digite a posição do Ninja que você quer deletar =====");
                for (int i = 0; i < ninja.length; i++) {
                    if (ninja[i] != null){
                        System.out.println((i + 1)+". "+ ninja[i]);
                    }
                }
                int del = scanner.nextInt();
                scanner.nextLine();
                if (del >= 1 && del <= NUMERO_MAX && ninja[del - 1] != null) {
                    System.out.println("Ninja "+ninja[del - 1]+" deletado com sucesso!");
                    ninja[del - 1] = null;
                    ninjasCadastrados--;
                } else{
                    System.out.println("Número inválido ou posição vazia.");
                }
                break;

                case 4:
                    System.out.println("Estamos saindo o programa... aguarde");
                    break;

                default:
                    System.out.println("Essa opção não é válida.");
                    break;


            }

        } scanner.close();
    }
}
