import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number for which the multiplication table is to be printed
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Input the range up to which the table should be printed
        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            scanner.close();
        }
    }
}


