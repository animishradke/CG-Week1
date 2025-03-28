import java.util.Scanner;

class cf115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scanner.nextInt();
		if(num<0){
		System.out.println("Factorial is not defined for negative number");
		return;
		}
		
		long factorial=1;
		for(int i=1;i<=num;i++){
		factorial*=i;
		}
		
		
		System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}