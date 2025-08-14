package NivelIntermediario.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto");
        ninjas.add("Itachi");

        System.out.println("Ninjas: " + ninjas);


        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        System.out.println("NinjasSet: " + ninjasSet);

        Set<String> ninjasTreeSet = new TreeSet<>();
        ninjasTreeSet.addAll(ninjas);
        System.out.println("NinjasTreeSet: " + ninjasTreeSet );

        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(ninjas);
        System.out.println("Ninjas LinkedHashSet: " + ninjasLinkedHashSet);
    }
}
