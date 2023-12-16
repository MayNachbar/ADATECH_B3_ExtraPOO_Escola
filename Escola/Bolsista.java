package Escola;

public final class Bolsista extends Aluno {
    private Double porcentagemBolsa;
    private Integer quantidadeAtividadesEntregues;
    private Boolean alunoElegivel;

    public Bolsista(String nome, String cpf, String endereco, Integer idade, String matricula, String turma) {
        super(nome, cpf, endereco, idade, matricula, turma);
    }

    public Double getPorcentagemBolsa() {
        return this.porcentagemBolsa;
    }

    public void setPorcentagemBolsa(Double porcentagemBolsa) {
        this.porcentagemBolsa = porcentagemBolsa;
    }

    public Integer getQuantidadeAtividadesEntregues() {
        return this.quantidadeAtividadesEntregues;
    }

    public void setQuantidadeAtividadesEntregues(Integer quantidadeAtividadesEntregues) {
        this.quantidadeAtividadesEntregues = quantidadeAtividadesEntregues;
    }

    public Boolean isAlunoElegivel() {
        return this.alunoElegivel;
    }

    public void setAlunoElegivel(Boolean alunoElegivel) {
        this.alunoElegivel = alunoElegivel;
    }

    public Double calcularPorcentagemBolsa() {
        Double mediaAluno = super.calcularMedia();

        if (mediaAluno > 9.5 && this.quantidadeAtividadesEntregues > 9 && alunoElegivel) {
            this.porcentagemBolsa = 100.0;
        } else if (mediaAluno > 8.5 && this.quantidadeAtividadesEntregues > 8 && alunoElegivel) {
            this.porcentagemBolsa = 60.0;
        } else if (mediaAluno > 7.5 && this.quantidadeAtividadesEntregues > 7 && alunoElegivel) {
            this.porcentagemBolsa = 30.0;
        } else if (mediaAluno > 6.5 && this.quantidadeAtividadesEntregues > 6 && alunoElegivel) {
            this.porcentagemBolsa = 10.0;
        } else {
            this.porcentagemBolsa = 0.0;
        }

        return porcentagemBolsa;
    }
}
