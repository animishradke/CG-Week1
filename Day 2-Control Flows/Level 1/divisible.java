import java.util.Scanner;
class cf11{
     public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int num=scanner.nextInt();
	 
	 if(num%5==0){
	      System.out.println("It is divisibe by 5");
	 }
	 else{
	 System.out.println("It is not divisibe by 5");
	 }
	 
	 
	 scanner.close();
	 }
	 }