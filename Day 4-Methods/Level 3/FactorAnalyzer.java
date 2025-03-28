import java.util.Scanner;

public class FactorAnalyzer {

    public static int[] getAllFactors(int number) {
        int factorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }
        int[] factors = new int[factorCount];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int getLargestProperFactor(int[] factors, int number) {
        int largestProperFactor = 1;
        for (int factor : factors) {
            if (factor < number && factor > largestProperFactor) {
                largestProperFactor = factor;
            }
        }
        return largestProperFactor;
    }

    public static int calculateSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long calculateProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double calculateProductOfFactorCubes(int[] factors) {
        double productOfCubes = 1;
        for (int factor : factors) {
            productOfCubes *= Math.pow(factor, 3);
        }
        return productOfCubes;
    }

    public static boolean isPerfect(int number, int[] factors) {
        int sumOfProperFactors = 0;
        for (int factor : factors) {
            if (factor != number) {
                sumOfProperFactors += factor;
            }
        }
        return sumOfProperFactors == number;
    }

    public static boolean isAbundant(int number, int[] factors) {
        int sumOfProperFactors = 0;
        for (int factor : factors) {
            if (factor != number) {
                sumOfProperFactors += factor;
            }
        }
        return sumOfProperFactors > number;
    }

    public static boolean isDeficient(int number, int[] factors) {
        int sumOfProperFactors = 0;
        for (int factor : factors) {
            if (factor != number) {
                sumOfProperFactors += factor;
            }
        }
        return sumOfProperFactors < number;
    }

    public static boolean isStrong(int number) {
        int sumOfFactorials = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfFactorials += calculateFactorial(digit);
            tempNumber /= 10;
        }
        return sumOfFactorials == number;
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int[] factors = getAllFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor (excluding number itself): " + getLargestProperFactor(factors, number));
        System.out.println("Sum of Factors: " + calculateSumOfFactors(factors));
        System.out.println("Product of Factors: " + calculateProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + calculateProductOfFactorCubes(factors));
        System.out.println("Is Perfect Number? " + isPerfect(number, factors));
        System.out.println("Is Abundant Number? " + isAbundant(number, factors));
        System.out.println("Is Deficient Number? " + isDeficient(number, factors));
        System.out.println("Is Strong Number? " + isStrong(number));

        scanner.close();
    }
}