package NivelIntermediario.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array - são estaticos e tem referencia de memoria previa
        String[] ninjaArray = new String[3];
        ninjaArray[0] = "Naruto";

        //Listas - são dinamicas, tamanho aumenta e diminui quando necessário
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Sasuke");

        //Stacks - o ultimo elemento a entrar é o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Sasuke");
        System.out.println(ninjaStack);
        ninjaStack.push("Kakashi");
        System.out.println("Stack atual: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack atualizada com pop: " + ninjaStack);
        ninjaStack.peek();
        System.out.println("Minha Stack atualizada com peek: " + ninjaStack);
        System.out.println("Minha Stack atualizada com size: " + ninjaStack.size() + " elementos");



    }
}
