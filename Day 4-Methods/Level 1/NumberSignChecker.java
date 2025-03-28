import java.util.Scanner;

public class NumberSignChecker {

    public static String checkIntegerSign(int num) {
        if (num > 0) {
            return num + " is positive";
        } else if (num < 0) {
            return num + " is negative";
        } else {
            return "The number is zero";
        }
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(checkIntegerSign(num));
    }
}
