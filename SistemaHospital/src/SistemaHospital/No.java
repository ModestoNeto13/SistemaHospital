package SistemaHospital;

public class No {
    private Paciente paciente;
    private No next;

    public No(Paciente paciente) {
        this.paciente = paciente;
        this.next = null;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
}
