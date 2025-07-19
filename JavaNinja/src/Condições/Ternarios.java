package Condições;

public class Ternarios {
    public static void main(String[] args) {

        short numeroDemissoes = 11;
        String nivelDoninja = (numeroDemissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";

        System.out.println(nivelDoninja);
    }
}
