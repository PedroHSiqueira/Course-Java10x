package avançado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> nomesArray = new ArrayList<>();
        nomesArray.add("Ana");
        nomesArray.add("Bob");
        nomesArray.add("Carlos");
        nomesArray.add("David");
        nomesArray.add("Jose");
        nomesArray.add("Ricardo");

        // Filtro de nome maior que 3 letra com Stream
        nomesArray.stream()
                .filter(nome -> nome.length() > 3)
                .forEach(System.out::println);
    }
}
