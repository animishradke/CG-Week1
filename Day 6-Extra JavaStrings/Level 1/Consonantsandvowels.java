import java.util.Scanner;
class Consonantsandvowels{
   public static void main(String[] args){
	   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter the string:");
   String str=scanner.nextLine();
   int vow=0;
   int con=0;
   String ref = "aeiouAEIOU";
   for(char ch:str.toCharArray()){
   if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
   if(ref.indexOf(ch)!=-1){
   vow++;
   }
   else{
   con++;
   }
   }
   }
   System.out.println("The vowels are:"+vow);
   
    System.out.println("The consonants are:"+con);
   
   
   scanner.close();
   }
}