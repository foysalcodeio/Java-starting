import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result = square(12);
        System.out.println("Square : " +result);

        System.out.println("Cube : " + cube(12));

        scanner.close();
    }
    static void happyBirthday(String name, int age){}
    static double square(double number){
        return number * number;
    }
    static double cube (double number){
        return Math.pow(number, 3);
    }
}
