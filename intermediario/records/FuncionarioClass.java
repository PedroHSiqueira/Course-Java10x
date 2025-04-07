package intermediario.records;

import java.util.Objects;

public class FuncionarioClass {
    private final String nome;
    private final String cpf;
    private final String rg;

    public FuncionarioClass(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getrg() {
        return rg;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FuncionarioClass that = (FuncionarioClass) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(rg, that.rg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, rg);
    }

    @Override
    public String toString() {
        return "FuncionarioClass{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
