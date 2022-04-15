package exercicio4;

public class appHospital {
    public static void main(String[] args) {
        Medico medico1 = new Medico(true);
        medico1.tratarPaciente();

        ClinicoGeral clinico1 = new ClinicoGeral(true, false);
        clinico1.receitar();

        Cirurgiao cirurgiao1 = new Cirurgiao(false);
        cirurgiao1.fazerIncisao();
        cirurgiao1.tratarPaciente();
    }
}