import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 6 and 9: ");
        int number = scanner.nextInt();

        if (number >= 6 && number <= 9) {
            printMultiplicationTable(number);
        } else {
            System.out.println("Invalid input. Please enter a number between 6 and 9.");
        }

        scanner.close();
    }

    // Method to print multiplication table
    public static void printMultiplicationTable(int number) {
        f
