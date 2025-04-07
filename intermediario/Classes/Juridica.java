package intermediario.Classes;

import intermediario.enums.Cidadania;
import intermediario.interfaces.Trabalho;

public class Juridica extends Pessoa implements Trabalho {
    public boolean gestaoPropria;
    final Cidadania cidadania = Cidadania.BRASILEIRA; // Imutável

    public Juridica(){
        super();
    }

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

    final void AprenderIdioma(){
        System.out.println("Eu estou aprendendo um idioma estrangeiro");
    }
}
