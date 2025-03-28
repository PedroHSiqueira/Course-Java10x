package intermediario;

public class Juridica extends Pessoa implements Trabalho{
    boolean gestaoPropria;

    public Juridica(String nome, String sobrenome, int idade, boolean trabalhando, float salario, boolean gestaoPropria) {
        super(nome, sobrenome, idade, trabalhando, salario);
        this.gestaoPropria = gestaoPropria;
    }

    @Override
    public void tipo() {
        System.out.println("Olá, eu sou o " + nome + " " + sobrenome + " e atuo na Modalidade PJ (Pessoa Jurídica)");
    }
}
