package NivelIntermediario.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaArrayList = new ArrayList<>();



        LinkedList<String> listLinkedList = new LinkedList<>();
        listLinkedList.add("Naruto Uzumaki");
        listLinkedList.add("Sasuke Uchiha");
        listLinkedList.add("Sakura Haruno");
        System.out.println(listLinkedList);

        listLinkedList.add(1,"Kakashi Hatake");
        System.out.println(listLinkedList);

        listLinkedList.remove(2);
        System.out.println(listLinkedList);




    }
}
