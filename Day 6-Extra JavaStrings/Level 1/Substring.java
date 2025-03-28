import java.util.Scanner;
class Substring{
public static int sentence(String str,String sub){
       int count=0;
	   int index=str.indexOf(sub);
	   
	  while (index != -1) { // Loop while the substring is found
            count++; // Increment count
            index = str.indexOf(sub, index + 1); // Find next occurrence
        }
        return count;
    } 

public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
   System.out.println("enter the string:");
   String str=scanner.nextLine();
   
   System.out.println("enter the substring to count:");
   String sub=scanner.nextLine();
   int  result=sentence(str,sub);
   System.out.println("The count is:"+result);
  
        scanner.close();
    }
}
