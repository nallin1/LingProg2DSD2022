package exercicio4;
public class Cirurgiao extends Medico {
    
    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    public void tratarPaciente() {
        System.out.println("Fazendo cirurgia...\n");
    }

    public void fazerIncisao() {
        System.out.println("Fazendo incisão...\n");
    }
}
