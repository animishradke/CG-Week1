import java.util.Scanner;
class arr16{
 public static void main(String[] args){
   Scanner scanner= new Scanner(System.in);
   System.out.println("Enter the heights of 11 :");
   double[] heights=new double[11];
    for(int i=0;i<11;i++){
	System.out.println("The hieght of players is:"+(i+1)+":");
	heights[i]=scanner.nextInt();
	}
	double  sum=0;
	for(int i=0;i<11;i++){
	sum+=heights[i];
	}
	double mean=sum/11;
	System.out.println("The mean of players is:"+mean);
   scanner.close();
 }
}