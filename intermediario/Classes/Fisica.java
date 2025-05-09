package intermediario.Classes;

import intermediario.enums.Cidadania;
import intermediario.interfaces.Trabalho;

public class Fisica extends Pessoa implements Trabalho {
    public boolean decimoTerceiro;
    final Cidadania cidadania = Cidadania.BRASILEIRA; // Imutável

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

    final void AprenderIdioma(){
        System.out.println("Eu estou aprendendo um idioma estrangeiro");
    }
}
