import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		
		int temp=num,count=0;
		while(temp>0){
		count++;
		temp/=10;
		}
		
		int[] digits=new int[count];
		temp=num;
		
		for(int i=0;i<count;i++){
		digits[i]=temp%10;
		temp/=10;
		}
		
		System.out.println("Reversed number:");
		for(int i=0;i<count;i++){
		System.out.print(digits[i]);
		}
		 scanner.close();
    }
}
