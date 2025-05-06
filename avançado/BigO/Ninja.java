package avançado.BigO;

public class Ninja {
    private String nome;
    private int idade;

    public Ninja(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
