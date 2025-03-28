import java.util.Scanner;
class arr17{
 public static void main(String[] args){
   Scanner scanner= new Scanner(System.in);
   System.out.println("Enter a number:");
   int number=scanner.nextInt();
   if(number>0){
     System.out.println("It is a natural number"); 	 
   }
   else{
   System.out.println("error and exit the program"); 	
   }
   int[] even=new int[number/2+1];   
   int[] odd=new int[number/2+1]; 
   
   int oddnum=0;
   int evennum=0;
    
	for(int i=1;i<=number;i++){
	  if(i%2==0){
	   even[evennum]=i;
	   evennum++;
	  }
	  else{
	  odd[oddnum]=i;
	   oddnum++;
	  }
	  }
	  
	System.out.println("\n odd numbers:");
	for(int i=0;i<oddnum;i++){
	System.out.println("Index"+ i+":"+odd[i]);
	}
	
	System.out.println("\n even numbers:");
	for(int i=0;i<evennum;i++){
	System.out.println("Index"+ i+":"+even[i]);
	}
	
	
   scanner.close();
 }
}