  import java.util.Scanner;
class Level18 {
    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter distance in kilometers:");
	double km=scanner.nextDouble();
	
	double miles=km/1.6;
	System.out.println("The total miles is" + miles + "miles for the given" + km + "km.");
     scanner.close();	
	
	  }
	}