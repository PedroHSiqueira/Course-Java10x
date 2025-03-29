package intermediario;

// abstract = Não pode ser instanciada
public abstract class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    boolean trabalhando;
    float salario;

    public Pessoa(String nome, String sobrenome, int idade, boolean trabalhando, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.trabalhando = trabalhando;
        this.salario = salario;
    }
}
