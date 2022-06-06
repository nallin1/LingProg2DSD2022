public class ExercicioPolimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Cachorro c1 = (Cachorro) a1;
        c1.emitirSom();

        Animal a2 = new Preguica();
    }
}
