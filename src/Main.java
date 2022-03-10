import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Books jeden = new Books (" Alicja w krainie czarow", " Lewis Caroll"," Magia",100);

    System.out.println(jeden.bookDetails());
     jeden.setAuthor(" Orwell");
     System.out.println(jeden.bookDetails());
     jeden.setPublisher(" Karakter");
     System.out.println(jeden.bookDetails());
        }



    }

