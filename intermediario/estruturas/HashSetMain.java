package intermediario.estruturas;

import intermediario.enums.Senioridade;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {

        //Sets não permitem elemento repetidos e não possuem index
        List<Senioridade> senioridadesList = new ArrayList<Senioridade>();
        senioridadesList.add(Senioridade.JUNIOR);
        senioridadesList.add(Senioridade.PLENO);
        senioridadesList.add(Senioridade.SENIOR);

        System.out.println("List: " + senioridadesList);

        //Adicionar uma Collection
        Set<Senioridade> senioridadeSet = new HashSet<>();
        senioridadeSet.addAll(senioridadesList);

        System.out.println("Set: " + senioridadeSet);

        //Elemento Repetido
        senioridadeSet.add(Senioridade.JUNIOR);
        senioridadeSet.add(Senioridade.PLENO);
        senioridadeSet.add(Senioridade.SENIOR);

        System.out.println("Set 'Com Repetidos': " + senioridadeSet);
    }
}
