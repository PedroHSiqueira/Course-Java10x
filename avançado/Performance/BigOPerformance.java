package avançado.Performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BigOPerformance {
    public static void main(String[] args) {
        /*
        * Para realizar ações como Adição, exclusão, etc...
        * o LinkedList tem uma perfmormance Superior ao Arraylist, dependendo do tamanho do mesmo
        * Sendo De complexidade O(n) - Constante
        * */

        long inicio;
        long fim;
        long total;

        List<Integer> numerosArray = new ArrayList<>();
        LinkedList<Integer> numerosLinkedList = new LinkedList<>();

        for (int i = 0; i < 50000000; i++) {
            numerosArray.add(i);
            numerosLinkedList.add(i);
        }

        inicio = System.nanoTime();
        numerosArray.add(500);
        fim = System.nanoTime();
        total = (fim - inicio);
        System.out.println("Tempo arrayList: " + total + " ns");

        inicio = System.nanoTime();
        numerosLinkedList.add(500);
        fim = System.nanoTime();
        total = (fim - inicio);
        System.out.println("Tempo linkedList: " + total + " ns");


    }
}
