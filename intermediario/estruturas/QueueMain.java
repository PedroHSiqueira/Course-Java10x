package intermediario.estruturas;

import intermediario.enums.Senioridade;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {

        //Queue usam o conceito FIFO (First in, first out)
        Queue<Senioridade> senioridadeQueue = new LinkedList<>();

        //Adicionar
        senioridadeQueue.add(Senioridade.JUNIOR);
        senioridadeQueue.add(Senioridade.PLENO);
        senioridadeQueue.add(Senioridade.SENIOR);
        System.out.println("Senioridades: " + senioridadeQueue);

        //Remover Primeiro Elemento
        senioridadeQueue.poll();
        System.out.println("Senioridades: " + senioridadeQueue);

        //Mostrar o primeiro elemento sem remove-lo
        System.out.println("Primeira Senioridade: " + senioridadeQueue.peek());

        //Tamanho da Queue
        System.out.println("Tamanho da fila(Queue): " + senioridadeQueue.size());

        //Limpar queue
        senioridadeQueue.clear();
        System.out.println("Senioridades: " + senioridadeQueue);
    }
}
