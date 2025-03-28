package intermediario;

public class Fisica extends Pessoa implements Trabalho{
    boolean decimoTerceiro;

    public Fisica(String nome, String sobrenome, int idade, boolean trabalhando, float salario, boolean decimoTerceiro) {
        super(nome, sobrenome, idade, trabalhando, salario);
        this.decimoTerceiro = decimoTerceiro;
    }

    @Override
    public void tipo() {
        System.out.println("Olá, eu sou o " + nome + " " + sobrenome + " e atuo na Modalidade CLT (Pessoa Física)");
    }
}
