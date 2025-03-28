import java.util.Scanner;

class cf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int  number=scanner.nextInt();
		 int sum=0;
		 
         while(number!=0){
		 sum+=number;
		 System.out.print("Enter the number:");
		 number=scanner.nextInt();
		 }	
         System.out.println( sum); 		 
		
		   scanner.close();
    }
}
