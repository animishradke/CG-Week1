import java.util.Scanner;

class cf16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The number is positive: " + num);
        } 
        else if (num < 0) {
            System.out.println("The number is negative: " + num);
        } 
        else {
            System.out.println("The number is zero: " + num);
        }

        scanner.close();
    }
}
