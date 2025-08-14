package NivelIntermediario.Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //QUEUE = Fila.
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakusa Haruno");
        ninjasQueue.add("Kakashi");


        //Mostrar fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        //Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas fila depois do poll: " + ninjasQueue);

        //Como ver quem é o primeiro
        ninjasQueue.peek();
        System.out.println("Ver o primeiro da fila: " + ninjasQueue.peek());

        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");

        System.out.println("Ninjas na fila: " + ninjasQueue);

        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Fila: " + ninjasQueue);

        //Verificar se a fila está vazia
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia");
        }


    }
}
