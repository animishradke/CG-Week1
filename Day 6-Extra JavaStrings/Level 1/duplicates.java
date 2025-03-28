import java.util.Scanner;
class duplicates{
public static String duplicates(String str){
   int len=str.length();
   boolean seen[]=new boolean[256];
    StringBuilder result=new StringBuilder();
	
	for(char ch:str.toCharArray()){
	if(!seen[ch]){
	result.append(ch);
	seen[ch]=true;
	}
   }
   return result.toString();
}
public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
   System.out.println("enter the string:");
   String str=scanner.nextLine();
   
   String modifiedString = duplicates(str);
   System.out.println("String after removing duplicates: " + modifiedString);
        scanner.close();
    }
}
