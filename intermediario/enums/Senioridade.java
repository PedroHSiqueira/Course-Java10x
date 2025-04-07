package intermediario.enums;

public enum Senioridade {
    JUNIOR("Nivel mais baixo na hierarquia", 2),
    PLENO("Nivel médio na hierarquia", 6),
    SENIOR("Nivel alto na hierarquia", 11);

    private String descricao;
    private int anosExperiencia;

    Senioridade(String descricao, int anosExperiencia) {
        this.descricao = descricao;
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
