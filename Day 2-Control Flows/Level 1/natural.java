import java.util.Scanner;

class cf112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=scanner.nextInt();
		if(num<0){
		System.out.println("Please eneter a natural number greater than 0");
		return;
		}
		
		   int sum=0;
		   int i=1;
		   while(i<=num){
		     sum+=i;
			 i++;
		   }
		
		
		int formula=num*(num+1)/2;
		 System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formula);
		if(sum==formula){
		System.out.println("The result of sum and formula are same");		
		}
		else{
		System.out.println("The result of sum and formula are not same");
		}
		   scanner.close();
    }
}
