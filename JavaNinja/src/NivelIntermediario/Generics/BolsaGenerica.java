package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }


    //Adicionar equipamentos genericos

    public void adicionarEquipamentos(T equipamentosGenerico) {
        equipamentos.add(equipamentosGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamento: " + equipamentos.toString();
    }
}
