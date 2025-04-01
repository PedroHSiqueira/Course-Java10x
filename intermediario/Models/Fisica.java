package intermediario.Models;

public class Fisica extends Pessoa implements Trabalho {
    boolean decimoTerceiro;

    public Fisica(String nome, String sobrenome, int idade, float salario, boolean decimoTerceiro) {
        super(nome, sobrenome, idade, salario);
        this.decimoTerceiro = decimoTerceiro;
    }

    @Override
    public void tipo() {
        System.out.println("Olá, eu sou o " + this.getNome() + " " + this.getSobrenome() + " e atuo na Modalidade CLT (Pessoa Física)");
    }

    @Override
    public void senioridade() {
        if (this.getSenioridade() != null) {
            System.out.println("Sou Desenvolvedor " + this.getSenioridade());
        } else {
            System.out.println("Não possuo senioridade");
        }
    }
}
