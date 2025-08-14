package NivelIntermediario.List;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Arrays são estaticos, não alteram tamanho

        String [] NinjasArray = new String[3];
        NinjasArray[0] = "Naruto";
        NinjasArray[1] = "Sasuke";
        NinjasArray[2] = "Sakura";

        for (int i = 0; i < NinjasArray.length; i++) {
            System.out.println(NinjasArray[i]);
            
        }

        // Listas não são estaticas, podem aumentar e diminuir
        //Adicionar

        List<String> NinjasList = new ArrayList<>();
        NinjasList.add("Naruto Uzumaki");
        NinjasList.add("Sasuke Uchiha");
        NinjasList.add("Sakura Haruno");
        NinjasList.add("Tobirama Sanju");

        System.out.println(NinjasList);

        //Remover

        NinjasList.remove("Tobirama Sanju");
        System.out.println(NinjasList);

        //Trocar

        NinjasList.set(2,"Tobirama Senju");
        System.out.println(NinjasList);

        //Ver o tamanho da lista

        System.out.println("Tamanho da Lista: " + NinjasList.size() + " elementos");


    }
}
