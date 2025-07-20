package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        Hokage Hashirama = new Hokage();
        Hashirama.nome = "Hashirama";

Hokage Tobirama = new Hokage(40, "Tobirama", "vila da folha", false,50, 100, 1.90);
        System.out.println(Tobirama.altura);

        Hokage Hiruzen = new Hokage();
        System.out.println(Hiruzen.idade);

        Hokage Minato = new Hokage();
        System.out.println(Minato.nome);
        System.out.println(Minato.idade);
        System.out.println(Minato.VivoOuNao);
    }
}
