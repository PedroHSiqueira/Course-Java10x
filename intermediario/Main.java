package intermediario;

public class Main {
    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica("Pedro", "Siqueira", 20, true, 1200.0f, true);

        Juridica pessoaJuridica = new Juridica("Henrique", "Amaral", 21, true, 2100.0f, true);

        pessoaFisica.tipo();
        pessoaJuridica.tipo();
    }
}
