import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String myString = sc.nextLine();

        if (myString.endsWith("em") == true) {
            System.out.println("A string termina com [em]");
        } else {
            System.out.println("A string não termina com [em]");
        }
    }
}
