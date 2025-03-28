import java.util.Scanner;
class arr18{
  public static void main(String[] args){
  Scanner scanner= new Scanner(System.in);
  System.out.println("Enter the number:");
  int num=scanner.nextInt();
  int[] fact=new int[num];
  int count=0;
  for(int i=1;i<=num;i++){
     if(num%i==0){
	 System.out.print(i+" ");
	 fact[count]=i;
	 count++;
	 }
  }
  System.out.println("The factors stored in an array of :"+num+"are:");
  for(int i=0;i<=count;i++){
  System.out.print(fact[i]+ "");
  }
  }
}