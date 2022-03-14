import java.util.Scanner;

public class Account {
    private String name;
    private String surname;
    private static int balance;
    private int ID;

    public Account(String name, String surname, int balance, int ID) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.ID = ID;


    }


    {   Scanner scanner = new Scanner (System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();


        System.out.println(name +" your balance is ");


    }
}