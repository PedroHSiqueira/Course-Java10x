package intermediario.Models;

public class Juridica extends Pessoa implements Trabalho {
    boolean gestaoPropria;

    public Juridica(String nome, String sobrenome, int idade, float salario, boolean gestaoPropria) {
        super(nome, sobrenome, idade, salario);
        this.gestaoPropria = gestaoPropria;
    }

    @Override
    public void tipo() {
        System.out.println("Olá, eu sou o " + this.getNome() + " " + this.getNome() + " e atuo na Modalidade PJ (Pessoa Jurídica)");
    }

    @Override
    public void senioridade() {
        if (this.getSenioridade() != null) {
            System.out.println("Sou Desenvolvedor " + this.getSenioridade() + " na modalidade PJ");
        } else {
            System.out.println("Não possuo senioridade");
        }
    }
}
