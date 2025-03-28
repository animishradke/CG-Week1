import java.util.Scanner;
class arr13{
 public static void main(String[] args){
   Scanner scanner= new Scanner(System.in);
   System.out.println("Eneter the number:");
   int number=scanner.nextInt();
   int[] results=new int[10];
   for(int i=1;i<10;i++){
   results[i]=number*(i+1);
   }
   System.out.println("Multipication of Table  of"+number+ ":");
   for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }
	 
   scanner.close();
 }
}