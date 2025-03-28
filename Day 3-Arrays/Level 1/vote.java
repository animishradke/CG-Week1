import java.util.Scanner;
class arr11{
 public static void main(String[] args){
   Scanner scanner= new Scanner(System.in);
   int[] ages=new int[10];
   
   System.out.println("Enter the 10 students age:");
    for(int i=0;i<ages.length;i++){
	System.out.println("Student"+(i+1) + ":" );
	ages[i]=scanner.nextInt();
	}
	for(int i=0;i<ages.length;i++){
	if(ages[i]>18){
		System.out.println("The Student"+(i+1) + "with the age"+ages[i]+"can vote" );
	}
	else{
		System.out.println("The Student"+(i+1) + "with the age"+ages[i]+"can vote" );
	}
	}
   scanner.close();
 }
}