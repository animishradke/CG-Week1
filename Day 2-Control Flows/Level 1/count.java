import java.util.Scanner;

class cf18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a countdown: ");
        int counter= scanner.nextInt();
		while(counter>=1){
		System.out.println(counter);
		counter--;
		}

          System.out.println("Lets go rocket");

        scanner.close();
    }
}
