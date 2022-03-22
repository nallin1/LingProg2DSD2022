import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String myString = sc.nextLine();

        String myStringLower = myString.toLowerCase();

        System.out.println("A palavra digitada é " + myString + "\n Em minúsculo: " + myStringLower);
    }
}
