package Escola;

public abstract class Aluno extends Pessoa {
    private String matricula;
    private String turma;
    private Double[] notas;
    private Double mediaAluno;

    public Aluno(String nome, String cpf, String endereco, Integer idade, String matricula, String turma) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEndereco(endereco);
        super.setIdade(idade);
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return this.turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = new Double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            this.notas[i] = notas[i];
        }
    }

    public Double getMediaAluno() {
        return this.mediaAluno;
    }

    public Double calcularMedia() {
        if (this.notas == null || this.notas.length == 0) {
            System.out.println("Notas não foram fornecidas. Não é possível calcular a média.");
            return null;
        }

        double somaDasNotas = 0.0;
        for (int i = 0; i < this.notas.length; i++) {
            somaDasNotas += this.notas[i];
        }

        this.mediaAluno = somaDasNotas / this.notas.length;
        return this.mediaAluno;
    }
}
