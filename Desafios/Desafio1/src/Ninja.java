public class Ninja {
    public static void main(String[] args) {

        String  nomeNinja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Encontrar bandido";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'A';

        if (idade < 15){
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Não concluida, idade insuficiente";
            }

        } else {
            statusDaMissao = "Missão concluida, idade suficiente";
        }

        System.out.println("--------------------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade );
        System.out.println("Missão: " + missao);
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println("Status do nível: " + nivelDaMissao);

        System.out.println("--------------------------------------------------");

        String  nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 17;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        if (idade < 15){
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Concluida";
            } else {
                statusDaMissao2 = "Não concluida, idade insuficiente";
            }

        } else {
            statusDaMissao2 = "Missão concluida, idade suficiente";
        }

        System.out.println("--------------------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("Status do nível: " + nivelDaMissao2);

        System.out.println("--------------------------------------------------");



        String  nomeNinja3 = "Sakura";
        int idade3 = 16;
        String missao3 = "Curar feridos";
        String statusDaMissao3 = "Concluido";
        char nivelDaMissao3 = 'D';

        if (idade < 15){
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Concluida";
            } else {
                statusDaMissao3 = "Não concluida, idade insuficiente";
            }

        } else {
            statusDaMissao3 = "Missão concluida, idade suficiente";
        }
        System.out.println("--------------------------------------------------");

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("Status do nível: " + nivelDaMissao3);

        System.out.println("--------------------------------------------------");



    }
}
