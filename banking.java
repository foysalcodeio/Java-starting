import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double balance = 10.99;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("*****************");
            System.out.println("BANKING PROGRAMME");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("******************");

            //GET PROCESS USER CHOICE
            System.out.print("Enter you choice (1-4) : ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("*******************");
        System.out.println("Have a nice day!!");
        System.out.println("*******************");
        scanner.close();
    }
    static void showBalance (double balance){
        System.out.println("******************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.println("Enter what amount you deposit : ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            return amount;
        }
    }
    static double withdraw(double balance) {
        double amount;
        System.out.println("Enter to be amount withdraw : ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Balance .... ");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
