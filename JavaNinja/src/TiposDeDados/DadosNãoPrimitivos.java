package TiposDeDados;

import java.util.Locale;

public class DadosNãoPrimitivos {
    public static void main(String[] args) {

        String nome ="Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println("Esse texto está em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String AldeiaEmCaixaBaixa = aldeia.toLowerCase();
        System.out.println(AldeiaEmCaixaBaixa);

    }
}
