import java.util.Scanner;
class Level210 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of chocolates:");
		int numberofchocolates=scanner.nextInt();
		
		System.out.println("Enter the number of children:");
		int numberofchildren=scanner.nextInt();
		
		int distributedchocolates=numberofchocolates/numberofchildren;
		int nondistributedchocolates=numberofchocolates%numberofchildren;
		
		System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d. %n",
		distributedchocolates,nondistributedchocolates);
		
		
        scanner.close();
    }
}
