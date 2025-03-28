import java.util.Scanner;

class cf16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int month = scanner.nextInt();

        System.out.print("Enter a day: ");
        int day = scanner.nextInt();

        if(month==may && month==april){
		   System.out.println("It is a spring season ");
		}
		else if(month==march && day>=20 ||month==june && day<=20 ){
		System.out.println("It is a spring season " );
		}
		else{
		System.out.println("It is a spring season ");
		}

        scanner.close();
    }
}
