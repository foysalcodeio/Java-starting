import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What would you like to buy : ");
        item = scanner.nextLine();
        if(item.isEmpty()){
            System.out.println("You didn't enter food name");
        }

        System.out.print("What is the price each food : ");
        price = scanner.nextDouble();

        System.out.print("How many would you like : ");
        quantity = scanner.nextInt();
        if( quantity < 2) {
            System.out.println("Add altest 2 more product");
        }else{
            total = price * quantity;
            System.out.println("You have bought " + quantity + " " + item + "/s");
            System.out.println("Your total is " + currency + total);
        }

        scanner.close();
    }
}
