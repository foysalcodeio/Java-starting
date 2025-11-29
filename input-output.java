import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // System.out.println(age);

        System.out.print("Enter you name : ");
        String name = scanner.nextLine();

        // System.out.println(name);

        System.out.println("Your age is " + age + " your name is " + name);

        scanner.close();
    }
}
