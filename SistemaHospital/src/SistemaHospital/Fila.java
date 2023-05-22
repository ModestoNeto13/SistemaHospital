package SistemaHospital;

public class Fila {
    private No front;
    private No rear;
    private int tamanho;

    public Fila() {
        this.front = null;
        this.rear = null;
    }

    public boolean vazia() {
        return front == null;
    }

    public void adc(Paciente paciente) {
        No novo = new No(paciente);
        if (vazia()) {
            front = novo;
            rear = novo;
            tamanho++;
        } else {
            rear.setNext(novo);
            tamanho++;
        }

        System.out.println("Paciente" + paciente.getNome() + "Inserido na fila");
    }

    public void remover() {
        if (vazia()) {
            throw new IllegalStateException("Fila está vazia");
        }

        String nome = front.getPaciente().getNome();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        System.out.println("Paciente " + nome + "Foi atendido");
        tamanho--;
    }

    public int size() {
        return tamanho;

    }
}
