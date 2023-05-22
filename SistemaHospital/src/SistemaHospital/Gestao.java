package SistemaHospital;

import java.util.Scanner;

public class Gestao {
    private Fila filaNormal;
    private Fila filaSevero;
    private Fila filaModerado;
    private Fila filaLeve;

    public Gestao() {
        filaLeve = new Fila();
        filaNormal = new Fila();
        filaModerado = new Fila();
        filaSevero = new Fila();
    }

    public void adcPaciente() {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente(null, null, 0);
        System.out.println("Digite o CPF do paciente:\n");
        String CPF = sc.nextLine();
        paciente.setCpf(CPF);
        System.out.println("Digute o nome do paciente:\n");
        String nome = sc.nextLine();
        paciente.setNome(nome);
        System.out.println("Qual a prioridade do paciente?");
        int prioridade = sc.nextInt();
        while (prioridade != 0 || prioridade != 1 || prioridade != 2 || prioridade != 3) {
            System.out.println("Prioridade só de 0 à 3, digite uma válida:\n");
            prioridade = sc.nextInt();
        }
        paciente.setPrioridade(prioridade);
        switch (prioridade) {
            case 0:
                filaNormal.adc(paciente);
                break;
            case 1:
                filaLeve.adc(paciente);
                break;
            case 2:
                filaModerado.adc(paciente);
                break;
            case 3:
                filaSevero.adc(paciente);
                break;
        }
        sc.close();
    }

    public void atenderPaciente() {

        if (!filaSevero.vazia()) {
            filaSevero.remover();
        } else if (!filaModerado.vazia()) {
            filaModerado.remover();
        } else if (!filaLeve.vazia()) {
            filaLeve.remover();
        } else if (!filaNormal.vazia()) {
            filaNormal.remover();
        } else {
            System.out.println("A fila está vazia");
        }
    }

    public int numPacientes() {
        return filaLeve.size() + filaModerado.size() + filaNormal.size() + filaSevero.size();
    }
}
