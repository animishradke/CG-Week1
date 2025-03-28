import java.util.Scanner;
class toggle{
public static String   toggle(String str){
    StringBuilder result= new StringBuilder();
    
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }


public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
   System.out.println("enter the string:");
   String str=scanner.nextLine();
   String res=toggle(str);
   
   System.out.println("The string becomes:"+res);
        scanner.close();
    }
}
