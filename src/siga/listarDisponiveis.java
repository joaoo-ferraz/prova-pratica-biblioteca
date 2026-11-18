package siga;

import java.util.ArrayList;
import java.util.List;

public class listarDisponiveis {

    @Override 
    public List<Exemplar> listarDisponiveis() {
        List<Exemplar> disponiveis = new ArrayList<>();
        for (String[] linha : legado.consultarExemplares()) {
            Exemplar item = new Exemplar(linha[0], linha[1]);
            // atencao: aqui so se reconhece a letra maiuscula
            item.setDisponivel("D".equals(linha[2]));
            if (item.isDisponivel()) {
                disponiveis.add(item);
            }
        }
        return disponiveis;
    }
}
