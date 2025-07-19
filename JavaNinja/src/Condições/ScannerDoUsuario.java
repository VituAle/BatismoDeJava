package Condições;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner CaixaDeTexto = new Scanner(System.in);
        System.out.println("Escreva aqui o nome do Ninja: ");

        String nomeDoNinja = CaixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = CaixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos" );

        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja é maior de idade e pode ir para missão fora da aldeia");

        } else {
            System.out.println("Esse ninja é menor e não pode ir em missão fora da aldeia");
        }


        CaixaDeTexto.close();
    }
}
