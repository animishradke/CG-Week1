import java.util.Scanner;
class cf12{
     public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter three number");
	 int num1=scanner.nextInt();
	 int num2=scanner.nextInt();
	 int num3=scanner.nextInt();
	 
	 if(num1>num2 && num1>num3){
	 System.out.printf("The number %d is largest.\n",num1);
	 }
	  else if(num2>num1 && num2>num3){
	 System.out.printf("The number %d is largest.\n",num2);
	 }
	  else{
	 System.out.printf("The number %d is largest.\n",num3);
	 }

	 scanner.close();
	 }
	 }