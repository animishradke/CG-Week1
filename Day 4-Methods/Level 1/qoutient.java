import java.util.Scanner;
class meth19{
  public static int[] findRemainderAndQuotient(int number, int divisor){
  int quotient=number/divisor;
  int remainder=number%divisor;  
  return new int[]{quotient,remainder}; 
  }
  public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the number:");
  int num=scanner.nextInt();
  
  System.out.println("Enter the divisor:");
    int div=scanner.nextInt();
	int[] result=findRemainderAndQuotient(num,div);
    System.out.println("The  Quotient is "+result[0]);
	System.out.println("The  remainder is "+result[1]);
	
  scanner.close();
  }
}