import java.util.Scanner;

class arr22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		final int numfriends=3;
		//age
		int[] age=new int[numfriends];
		for(int i=0;i<numfriends;i++){
		System.out.print("The age of friend  "  + (i+1)+":");
		age[i]=scanner.nextInt();
		}
		//height
		double[] height=new double[3];
		for(int i=0;i<numfriends;i++){
		System.out.print("The height of friend" + (i+1)+":");
		height[i]=scanner.nextDouble();
		}
		
		
		int youngestage=age[0];
		int youngestindex=0;
		double tallestheight=height[0];
		int tallestindex=0;
		
		for(int i=1;i<numfriends;i++){
			if(age[i]<youngestage){
				youngestage=age[i];
				youngestindex=i;	
			}
			if(height[i]>tallestheight){
				tallestheight=height[i];
				tallestindex=i;
			}
		}
        System.out.println("\nFriends' Age and Height:");
        System.out.println("--------------------------");
        System.out.println("Friend#   Age    Height (cm)");
        System.out.println("--------------------------");
        for (int i = 0; i < numfriends; i++) {
            System.out.printf("%-9d %-5d  %.2f cm\n", (i + 1), age[i], height[i]);
        }
        System.out.println("\nYoungest Friend: Friend " + (youngestindex + 1) + " with age " + youngestage);
        System.out.println("\nTallest Friend: Friend " + (tallestindex + 1) + " with height " + tallestheight + " cm");

        scanner.close();
    }
}
