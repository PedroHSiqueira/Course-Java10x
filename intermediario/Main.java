package intermediario;

import intermediario.Models.Classes.Fisica;
import intermediario.Models.Classes.Juridica;
import intermediario.Models.enums.Senioridade;

public class Main {
    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica("Pedro", "Siqueira", 20, 1200.0f, true);
        pessoaFisica.tipo();
        pessoaFisica.setSenioridade(Senioridade.PLENO);
        pessoaFisica.senioridade();

        System.out.println("--------------------------------");

        Juridica pessoaJuridica = new Juridica("Henrique", "Amaral", 21, 2100.0f, true);
        pessoaJuridica.tipo();
        pessoaJuridica.setSenioridade(Senioridade.JUNIOR);
        pessoaJuridica.senioridade();
    }
}
