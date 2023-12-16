package Escola;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private Integer idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void falar() {
        System.out.println("Falando");
    }
    public void andar(){
        System.out.println("Andando");
    };
    public void comer(){
        System.out.println("Comendo");
    };
}