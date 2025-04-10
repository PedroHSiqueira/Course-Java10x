package intermediario.estruturas;

import intermediario.enums.Senioridade;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        // Lista encadeada (Ponteiros / Cursors)

        LinkedList<Senioridade> linkedList = new LinkedList<>();

        //Adição //Junior -> Pleno -> Senior
        linkedList.add(Senioridade.JUNIOR);
        linkedList.add(Senioridade.PLENO);
        linkedList.add(Senioridade.SENIOR);
        System.out.println(linkedList);

        //Adição no meio  //Junior -> Especialista -> Pleno -> Senior
        linkedList.add(1,Senioridade.ESPECIALISTA);
        System.out.println(linkedList);

        //Remover //Junior -> Especialista -> Senior
        linkedList.remove(Senioridade.PLENO);
        System.out.println(linkedList);

        //Limpa lista
        linkedList.clear();
        System.out.println(linkedList);
    }
}
