import java.util.Scanner;
class arr12{
 public static void main(String[] args){
   Scanner scanner= new Scanner(System.in);
     int[] num=new int[5];
	
	 System.out.println("Eneter the  5 number:");
	 for(int i=0;i<num.length;i++){
	 System.out.println("Student"+(i+1) + ":" );
	 num[i]=scanner.nextInt();
	 if(num[i]>0){
	 System.out.println("The number is positive" );
	 }
	 else if(num[i]<0){
	  System.out.println("The number is negitive" );
	 }
	 else{
	  System.out.println("The number is zero" );
	 }
	 }
	 
	 int firstnum=num[0];
	 int lastnum=num[num.length-1];
	 if(firstnum==lastnum){
	 System.out.println("They are equal" );
	 }
	 else if(firstnum>lastnum){
	 System.out.println("firstnum is greater");
	 }
	 else{
	 System.out.println("The firstnum is lesser" );
	 }
	 
	 

   scanner.close();
 }
}
