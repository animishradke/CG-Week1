import java.util.Scanner;
class arr15{
 public static void main(String[] args){
   Scanner scanner= new Scanner(System.in);
   System.out.println("Eneter the number:");
   int number=scanner.nextInt();
   int[] results=new int[4];
   for(int i=0;i<4;i++){
   results[i]=number*(i+6);
   }
   System.out.println("Multipication of Table  of"+number+ ":");
   for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }
	 
   scanner.close();
 }
}