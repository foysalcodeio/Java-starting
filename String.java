import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

       String message = "Foysal Ahmed";
       // checking index position number
       System.out.println(message.indexOf("A"));
       System.out.println(message.replace("y", "*"));
       System.out.println(message.trim());
       System.out.println(message.toLowerCase());

       System.out.println("Here is the Original string " + message);


        scanner.close();
    }
}
