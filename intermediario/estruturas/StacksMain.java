package intermediario.estruturas;

import intermediario.enums.Senioridade;

import java.util.Stack;

public class StacksMain {
    public static void main(String[] args) {

        //Stacks usam o Conceito LIFO(Last in, First Out)
        Stack<Senioridade> senioridades = new Stack<>();

        //para Adição é usado o metodo Push()
        senioridades.push(Senioridade.JUNIOR);
        senioridades.push(Senioridade.PLENO);
        senioridades.push(Senioridade.SENIOR);

        System.out.println("Stack atual: " + senioridades);

        //para remover é usado o metodo pop()
        senioridades.pop();

        System.out.println("Stack atual após o pop: " + senioridades);

        //retornar o ultimo elemento sem remove-lo
        System.out.println("Ultimo elemento: " + senioridades.peek());

        //retornar o tamanho da stack
        System.out.println("Tamanho da stack: " + senioridades.size());
    }
}
