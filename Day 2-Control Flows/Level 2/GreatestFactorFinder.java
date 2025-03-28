import java.util.*;
class cf28{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
int GreatestFactor=1;
for(int i=number-1;i&gt;1;i--){
if(number%i==0){
GreatestFactor=i;
break;
}
}
System.out.println(GreatestFactor);
}
}