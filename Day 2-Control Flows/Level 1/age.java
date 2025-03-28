import java.util.Scanner;

class cf15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
		int age=scanner.nextInt();
	
		if(age>18){
			System.out.printf("The person's age is %d and can vote.\n",age);
		}
		else{
			System.out.printf("The person's age is %d and cannot vote.\n",age);
		}

        scanner.close();
    }
}
