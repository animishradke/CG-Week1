import java.util.Scanner;
class compare{
public static int compare(String str1,String str2){
     int minLength=Math.min(str1.length(),str2.length());
    for(int i=0;i<minLength;i++){
	char char1=str1.charAt(i);
	char char2=str2.charAt(i);	
	if(char1<char2){
	return -1;
	}
	else if(char1>char2){
	return 1;
	}else{
	return 0;
	}
	}
	
	if(str1.length()<str2.length()){
		return -1;
		
	}else if(str1.length()>str2.length()){
		return 1;
	}else{
		return 0;
	}
}

public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
   System.out.println("enter the String 1:");
   String str1=scanner.nextLine();
   
    System.out.println("enter the String 2:");
   String str2=scanner.nextLine();
   int result = compare(str1, str2);
   if(result==0){
   System.out.println("Both the strings are equal");
   }
   else if(result<0){
   System.out.println(str1 + "lexicographical smaller than"+str2);
   }
   else{
    System.out.println(str1 + "lexicographical larger than"+str2);
   }
        scanner.close();
    }
}
