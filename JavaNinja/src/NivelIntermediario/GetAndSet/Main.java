package NivelIntermediario.GetAndSet;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki("Naruto", "Aldeia da Folha",16,5,1.76);
        System.out.println(Naruto.getNome());
        Naruto.setNome("Naruto Uzumaki, nome alterado");
        System.out.println(Naruto.getNome());
    }
}
