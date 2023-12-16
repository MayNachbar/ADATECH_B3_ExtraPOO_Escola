package Escola;

public class Atendente extends Funcionario {
    public Atendente(String nome, String cpf, String endereco, Integer idade, String matricula, String turno, Double salarioFixo, Double horaExtra) {
        super(nome, cpf, endereco, idade, matricula, turno, salarioFixo, horaExtra);
    }

    @Override
    public Double calcularSalarioDoMes() {
        Double salarioFinal = (super.getSalarioFixo() * 0.79) + (super.getHoraExtra() * 1.58);
        System.out.printf("Salário final: %.2f reais", salarioFinal);
        return (salarioFinal);
    }
    @Override
    public void funcionarioTrabalhando() {
        System.out.println("Em atendimento!");
    }
}
