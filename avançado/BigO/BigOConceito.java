package avançado.BigO;

import java.util.ArrayList;
import java.util.List;

public class BigOConceito {
    public static void main(String[] args) {
        List<Ninja> ninjasArray  = new ArrayList<>();
        ninjasArray.add(new Ninja("Naruto", 17));
        ninjasArray.add(new Ninja("Sasuke", 17));
        ninjasArray.add(new Ninja("Sakura", 17));

        //Complexidade Contante - o(1)
        //Não é afetado pelo tamanho
        System.out.println(ninjasArray.get(1));

        //Complexidade Linear - 0(n)
        // maior = mais ações
        for (Ninja ninja : ninjasArray) {
            System.out.println(ninja);
        }

        //Complexidade quadratica - o(n^2)
        for (int i = 0; i < ninjasArray.size(); i++) {
            for (int j = 0; j < ninjasArray.size(); j++) {
                System.out.println(ninjasArray.get(i) + " vs " + ninjasArray.get(j));
            }
        }
    }
}
