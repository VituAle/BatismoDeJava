package Condições;

public class LaçosDeRepetição {
    public static void main(String[] args) {


        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " +  numeroDeClones );
        }


        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
            System.out.println("O Naruto está se clonando e ja se clonou: " + i );
            
        }
    }
}
