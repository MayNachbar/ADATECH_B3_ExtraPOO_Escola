package Escola;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor(
                "Rafael",
                "112.233.445-01",
                "Rua Railson, Nº 789",
                52,
                "20234578",
                "Manhã",
                3200.50,
                4.5,
                "B",
                "Biologia");

        System.out.println("Informações do Professor:");
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("CPF: " + professor1.getCpf());
        System.out.println("Idade: " + professor1.getIdade());
        System.out.println("Endereço: " + professor1.getEndereco());
        System.out.println("Matrícula: " + professor1.getMatricula());
        System.out.println("Turno: " + professor1.getTurno());
        System.out.println("Turma: " + professor1.getTurma());
        System.out.println("Matéria: " + professor1.getMateria());

        professor1.baterOPonto();
        professor1.calcularSalarioDoMes();
        System.out.println();
        professor1.funcionarioTrabalhando();

        Atendente atendente1 = new Atendente(
                "Thais",
                "111.223.345-01",
                "Rua Domingos, Nº 478",
                32,
                "20234789",
                "Manhã",
                2300.42,
                5.4);

        System.out.println("\nInformações do Atendente:");
        System.out.println("Nome: " + atendente1.getNome());
        System.out.println("CPF: " + atendente1.getCpf());
        System.out.println("Idade: " + atendente1.getIdade());
        System.out.println("Endereço: " + atendente1.getEndereco());
        System.out.println("Matrícula: " + atendente1.getMatricula());
        System.out.println("Turno: " + atendente1.getTurno());

        atendente1.baterOPonto();
        atendente1.calcularSalarioDoMes();
        System.out.println();
        atendente1.funcionarioTrabalhando();

        Bolsista aluno1 = new Bolsista(
                "Maria",
                "123.456.789-01",
                "Rua Wilstom, Nº 99",
                14,
                "2023123",
                "A");

        double[] notasAluno1 = {8.7, 9.3, 10.0};
        aluno1.setNotas(notasAluno1);

        Double mediaAluno1 = aluno1.calcularMedia();

        System.out.println("\nInformações do Aluno:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("CPF: " + aluno1.getCpf());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Endereço: " + aluno1.getEndereco());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Turma: " + aluno1.getTurma());
        System.out.println("Notas: " + Arrays.toString(aluno1.getNotas()));
        System.out.printf("Média do Aluno: %.2f", mediaAluno1);

        if (mediaAluno1 != null) {

            aluno1.setQuantidadeAtividadesEntregues(10);
            aluno1.setAlunoElegivel(true);
            aluno1.setNotas(notasAluno1);

            Double porcentagemBolsa = aluno1.calcularPorcentagemBolsa();

            System.out.println("\nInformações do Bolsista:");
            System.out.println("Porcentagem da Bolsa: " + porcentagemBolsa + "%");
            System.out.println("Aluno Elegível: " + aluno1.isAlunoElegivel());
        }
    }
}
