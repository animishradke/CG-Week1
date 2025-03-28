import java.util.*;
class cf21{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter the number&quot;);
int number=input.nextInt();
int i;
if(number&gt;0){
for(i=number;i&gt;=1;i--){
if(i%2==0){
System.out.println(i+&quot; is Even&quot;);
}else{
System.out.println(i+&quot; is Odd&quot;);
}
}
}
}
}