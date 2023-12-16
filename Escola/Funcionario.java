package Escola;

public abstract class Funcionario extends Pessoa{
    private String matricula;
    private String turno;
    private Double salarioFixo;
    private Double horaExtra;

    public Funcionario(String nome, String cpf, String endereco, Integer idade, String matricula, String turno, Double salarioFixo, Double horaExtra) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setEndereco(endereco);
        super.setIdade(idade);
        this.matricula = matricula;
        this.turno = turno;
        this.salarioFixo = salarioFixo;
        this.horaExtra = horaExtra;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Double getHoraExtra() {
        return this.horaExtra;
    }
    public void setHoraExtra(Double horaExtra) {
        this.horaExtra = horaExtra;
    }
    public Double getSalarioFixo() {
        return this.salarioFixo;
    }
    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public abstract Double calcularSalarioDoMes();
    public abstract void funcionarioTrabalhando();
    public final void baterOPonto() {
        System.out.println("Batendo o ponto");
    }
}
