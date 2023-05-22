package SistemaHospital;

public class Paciente {
    private String nome;
    private String cpf;
    private int prioridade;

    public Paciente(String nome, String cpf, int prioridade) {
        this.nome = nome;
        this.cpf = cpf;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

}
