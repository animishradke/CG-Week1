import java.util.Scanner;

class arr110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        String[] arr = new String[num];
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            } else {
                arr[i - 1] = String.valueOf(i);
            }
        }

        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + arr[i]);
        }

        scanner.close();
    }
}
