package exercicio4;
public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;
    
    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println("Receitando...\n");
    }
}
