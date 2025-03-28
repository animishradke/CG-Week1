import java.util.Scanner;
 class Level22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
		
		System.out.print("Enter the third number: ");
        int c = scanner.nextInt();
		
		int d=a + b *c;
		int f=a * b + c;
		int g= c + a / b;
		int h= a % b + c;
		System.out.printf("The results of Int Operations are %d  %d %d and %d",d,f,g,h);

		
		scanner.close();
    }
}

		