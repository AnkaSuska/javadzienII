import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        System.out.println("Jak masz na imie? ");
        String name = scanner.nextLine();
        System.out.println(" Jak masz na nazwisko? ");
        String surname = scanner.nextLine();
        String age = scanner.nextLine();

        System.out.println("Czesc" +name +surname);


    }
}
