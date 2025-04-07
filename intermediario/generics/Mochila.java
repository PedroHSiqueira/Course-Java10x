package intermediario.generics;

import java.util.ArrayList;
import java.util.List;

public class Mochila<T> {
    private List<T> equipamentos = new ArrayList<>();

    public Mochila() {
    }

    public Mochila(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void adicionarEquipamento(T equipamento){
        this.equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Mochila: " + equipamentos ;
    }
}
