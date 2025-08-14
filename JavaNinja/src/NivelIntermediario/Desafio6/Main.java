package NivelIntermediario.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Iniciar uma Linked List com 7 Ninjas
        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        boolean sair = false;
        short opcao;

        //Adicionar os ninjas na minha Linked List
        listaDeNinjas.add(new Ninja("Naruto Uzumake", "Vila da Folha", 16));
        listaDeNinjas.add(new Ninja("Sakura Haruno", "Vila da Folha", 16));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", "Vila da Folha", 17));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", "Vila da Folha", 25));
        listaDeNinjas.add(new Ninja("Shikamaru", "Vila da Folha", 17));
        listaDeNinjas.add(new Ninja("Hinata Hyuga", "Vila da Folha", 16));
        listaDeNinjas.add(new Ninja("Rock Lee", "Vila da Folha", 17));

        while (!sair) {
            System.out.println("====================================");
            System.out.println("Escolha um opção: ");
            System.out.println("1 - Remover o primeiro ninja da lista");
            System.out.println("2 - Adicionar um novo ninja no inicio da lista");
            System.out.println("3 - Exibir a lista de ninjas");
            System.out.println("4 - Acessar um ninja especifico");
            System.out.println("5 - Ordernar a lista");
            System.out.println("6 - Busca de um ninja por nome");
            System.out.println("7 - Sair");
            System.out.println("====================================");
            opcao = scanner.nextShort();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    listaDeNinjas.removeFirst();
                    System.out.println("====Ninja removido com sucesso=====");
                    break;
                case 2:
                    System.out.println("Digite o nome do novo ninja: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do novo ninja: ");
                    int idade = scanner.nextShort();
                    scanner.nextLine();
                    System.out.println("Digite a vila do novo ninja: ");
                    String vila = scanner.nextLine();
                    listaDeNinjas.addFirst(new Ninja(nome, vila, idade));
                    System.out.println("====Ninja adicionado com sucesso=====");
                    break;

                case 3:
                    System.out.println("====Lista de ninjas=====");
                    for (Ninja ninja: listaDeNinjas){
                        System.out.println(ninja);
                    }
                    break;
                case 4:
                    System.out.println("Digite a posição do ninja que deseja ver os dados: ");
                    int posicao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(listaDeNinjas.get(posicao));
                    break;
                case 5:
                    short opcaoOrdenacao;
                    System.out.println("Digite a opção de ordenação: ");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Idade");
                    System.out.println("3 - Vila");
                    opcaoOrdenacao = scanner.nextShort();
                    scanner.nextLine();


                    switch (opcaoOrdenacao){
                        case 1:
                            listaDeNinjas.sort(Comparator.comparing(Ninja::getNome));
                            break;
                        case 2:
                            listaDeNinjas.sort(Comparator.comparing(Ninja::getIdade));
                            break;
                        case 3:
                            listaDeNinjas.sort(Comparator.comparing(Ninja::getVila));
                            break;
                        default:
                            System.out.println("Opcão inválida");
                    }
                    break;
                case 6:
                    System.out.println("Digite o nome do ninja que quer procurar: ");
                    String nomeNinja = scanner.nextLine();


                    boolean encontrado = false;


                    for(Ninja ninja: listaDeNinjas){
                        if(ninja.getNome().equals(nomeNinja)){
                            encontrado = true;
                            System.out.println("Ninja encontrado: ");
                            System.out.println(ninja);
                            break;
                        }
                    }


                    if(!encontrado){
                        System.out.println("Nenhum ninja encontrado com o nome enviado");
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }


        }
        System.out.println("========== Lista de Ninjas ==========");

            //Listar os Ninjas
            System.out.println("Lista de Ninjas: " + listaDeNinjas);

            //Complexidade o(n)
            for (Ninja ninja : listaDeNinjas) {
                System.out.println(ninja);
            }

            //Adicionar o ninja no inicio da lista
            listaDeNinjas.addFirst(new Ninja("Boruto Uzumaki", "Vila da Folha", 8));


            System.out.println("========== Ninja Removido ==========");

            //Removar o ninja do inicio da lista
            Ninja removido = listaDeNinjas.removeFirst();
            System.out.println("Ninja removido: " + removido);

            System.out.println("========== mudanças ==========");

            //Listar ninjas
            for (Ninja listaDeNinjasAtualizada : listaDeNinjas) {
                System.out.println("Lista de Ninja: " + listaDeNinjasAtualizada);
            }

            //Procurar um ninja por indice
            Ninja primeiroNinja = listaDeNinjas.get(0);
            System.out.println("Primeiro Ninja: " + primeiroNinja);

            scanner.close();


        }
    }

