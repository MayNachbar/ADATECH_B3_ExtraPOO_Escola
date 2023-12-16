package Escola;

public class Professor extends Funcionario{
    private String turma;
    private String materia;

    public Professor(String nome, String cpf, String endereco, Integer idade, String matricula, String turno, Double salarioFixo, Double horaExtra, String turma, String materia) {
        super(nome, cpf, endereco, idade, matricula, turno, salarioFixo, horaExtra);
        this.turma = turma;
        this.materia = materia;
    }

    public String getTurma() {
        return this.turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public Double calcularSalarioDoMes() {
        Double salarioFinal = (super.getSalarioFixo() * 0.92) + (super.getHoraExtra() * 1.84);
        System.out.printf("Salário final: %.2f reais", salarioFinal);
        return (salarioFinal);
    }
    @Override
    public void funcionarioTrabalhando() {
        System.out.println("Dando aula!");
    }
}
