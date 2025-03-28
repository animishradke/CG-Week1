import java.util.Scanner;
class cf13{
     public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter first number");
	 int num1=scanner.nextInt();
	  System.out.println("Enter second number");
	 int num2=scanner.nextInt();
	  System.out.println("Enter three number");
	 int num3=scanner.nextInt();
	 
	  boolean isfirstlargest=num1>num2 && num2>num3;
	  boolean issecondlargest=num2>num1 && num2>num3;
	  boolean isthirdlargest=num3>num1 && num3>num2;
	  
	 
	 System.out.println("\nIs the first number the largest? " + isfirstlargest);
        System.out.println("Is the second number the largest? " + issecondlargest);
        System.out.println("Is the third number the largest? " + isthirdlargest);

        scanner.close();
    }
}