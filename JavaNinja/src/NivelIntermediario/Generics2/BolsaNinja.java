package NivelIntermediario.Generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializar nosso Array
    private List<T> ferramentas;

    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    //Colocar ferramentas na nossa lista
    public void adicionarFerramenta( T ferramenta) {
        ferramentas.add(ferramenta);
    }

    //Mostrar a nossa lista de ferramentas
    public void mostrarFerramentas() {
        for (T ferramenta: ferramentas){
            System.out.println(ferramenta);
        }
    }

}
