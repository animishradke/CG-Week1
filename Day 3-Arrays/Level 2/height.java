import java.util.Scanner;

class height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		final int numPersons=3;
		double[] weight=new double[numPersons];
		double[] height=new double[numPersons];
		double[] bmi=new double[numPersons];
		String[] arr=new String[numPersons];
		
		
		for(int i=0;i<numPersons;i++){
		System.out.println("Enter weight(kg) for person"+ (i+1)+":");
		weight[i]=scanner.nextDouble();
		}
		
		for(int i=0;i<numPersons;i++){
		System.out.println("Enter height(cm) for person"+ (i+1)+":");
		height[i]=scanner.nextDouble();
		}
		for(int i=0;i<numPersons;i++){
		bmi[i]=weight[i]/(height[i]*height[i]);
		
		if (bmi[i] < 18.5) {
                arr[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                arr[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                arr[i] = "Overweight";
            } else {
                arr[i] = "Obese";
            }
		}
		System.out.println("\nBMI Results:");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Weight(kg)", "Height(m)", "BMI", "Arr");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10s\n", weight[i], height[i], bmi[i], arr[i]);
        }

        scanner.close();
    }
}