import java.util.Scanner;
   class level110 {
    public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  System.out.print("Enter the base of triangle");
	  double base=scanner.nextDouble();
	  
	  System.out.print("Enter the height of triangle:");
	  double height=scanner.nextDouble();
	  
	  double area=1/2*base*height;
	  System.out.println("The area of traiangle is" + area);
      scanner.close();	  
	
	 }
	}