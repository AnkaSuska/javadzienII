import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Account  user1 = new Account (" Anna", " Suska", 10000,100);


    System.out.println(user1.getBalance());
        user1.withdrawl(15);
    System.out.println(user1.getBalance());
        }



    }

