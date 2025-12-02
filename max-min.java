import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] number = new double[5];  // FIXED: Array size must be given
        System.out.print("Please Enter 5 Numbers: ");

        for (int i = 0; i < 5; i++) {
            number[i] = scanner.nextDouble();
        }

        double max = number[0];
        double min = number[0];

        /*
        for (int i = 0; i < 5; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }
        }
        */
        for (double value : number){
            if (value > max){
                max = value;
            }
            if(value < max) {
                min = value;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

        scanner.close();
    }
}
