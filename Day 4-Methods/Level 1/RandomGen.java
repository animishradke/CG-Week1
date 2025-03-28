import java.util.Scanner;

public class RandomGen {

    public int[] generate4DigitRandomArray(int size) {
        int[] random = new int[size];
        for (int i = 0; i < size; i++) {
            random[i] = (int)(Math.random() * 9000) + 1000;
        }
        return random;
    }

    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many random numbers should be generated: ");
        int size = input.nextInt();

        RandomGen res = new RandomGen();
        int[] result = res.generate4DigitRandomArray(size);
        double[] fina = res.findAverageMinMax(result);

        System.out.println("Generated random numbers:");
        for (int num : result) {
            System.out.println(num);
        }

        System.out.println("Average of random numbers is " + fina[0]);
        System.out.println("Minimum value of random numbers is " + fina[1]);
        System.out.println("Maximum value of random numbers is " + fina[2]);

        input.close();
    }
}
