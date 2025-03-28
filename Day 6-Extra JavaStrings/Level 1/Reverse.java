import java.util.Scanner;
class Reverse{
          public static String reversenumber(String str){
		  String res="";
		  for(int i=str.length()-1;i>=0;i--){
		  res+=str.charAt(i);
		  }
		  return res;
		  }
    public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=scanner.nextLine();
	 
	 String result=reversenumber(str);
	 System.out.println("The reverse string is:"+result);
	scanner.close();
	}

}