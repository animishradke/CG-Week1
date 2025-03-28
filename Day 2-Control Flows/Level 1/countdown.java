import java.util.Scanner;

class cf19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a countdown: ");
        int counter= scanner.nextInt();
		
		for(int i=counter;i>=1;i--){
		System.out.println(i);
		counter--;
		}

          System.out.println("Lets go rocket");

        scanner.close();
    }
}
