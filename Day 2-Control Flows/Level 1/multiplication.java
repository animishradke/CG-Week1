import java.util.Scanner;

class cf118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:");
		int num=scanner.nextInt();
		System.out.println("\nMultiplication Table of " + num + " from 6 to 9:");
		for(int i=6;i<=9;i++){
		System.out.println(num+"* " + i + " ="+(num*i));
		}
		
		scanner.close();
    }
}