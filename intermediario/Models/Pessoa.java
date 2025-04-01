package intermediario.Models;

// abstract = Não pode ser instanciada
public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private float salario;
    private Senioridade senioridade;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, int idade, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa(String nome, String sobrenome, int idade,float salario, Senioridade senioridade) {
        this(nome, sobrenome, idade, salario);
        this.senioridade = senioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Senioridade getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(Senioridade senioridade) {
        this.senioridade = senioridade;
    }
}
