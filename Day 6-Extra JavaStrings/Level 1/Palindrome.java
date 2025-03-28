import java.util.Scanner;
class Palindrome{
public static boolean palindrome(String str){
   int len=str.length();
   for(int i=0;i<len/2;i++){
	   if(str.charAt(i)!=str.charAt(len-1-i)){
		   return false;   
	   }
   }
	   return true;
   }
   
   

   public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
   System.out.println("enter the string:");
   String str=scanner.nextLine();
 
    boolean result=palindrome(str);
	System.out.println("The number is:"+result);
 
   scanner.close();
   }

}