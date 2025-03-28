import java.util.Scanner;

class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
		int num=scanner.nextInt();
		
		boolean isnatural=num>0;
		System.out.println("Is the number a natural number? " + isnatural);
		if(isnatural){
			int sum=num*(num+1)/2;
			System.out.printf("The sum of first %d natural numbers is: %d\n", num, sum);
		}else{
			System.out.println("natural number start from 1");
		}

        scanner.close();
    }
}
