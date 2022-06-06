package exercicio4;
public class Medico {
    private boolean trabalhaNoHospital;

    public boolean isTrabalhaNoHospital() {
        return this.trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
        System.out.println("Tratando paciente...\n");
    }
}
