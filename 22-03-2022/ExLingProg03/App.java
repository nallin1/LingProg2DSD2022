import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite duas palavra: ");
        String myString = sc.nextLine();

        String myString2 = sc.nextLine();

        if (myString.equalsIgnoreCase(myString2) == true)
            System.out.println("As duas strings são iguais");
        
        else 
        {
            System.out.println("As duas strings são diferentes");
        } 
    }
}
