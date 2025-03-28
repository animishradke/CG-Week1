import java.util.*;
class YoungFriend{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int age1,height1,age2,height2,age3,height3;
System.out.print(&quot;Enter the Amar age and height in cm&quot;);
age1=input.nextInt();
height1=input.nextInt();
System.out.print(&quot;Enter the Akbar age and height in cm&quot;);
age2=input.nextInt();
height2=input.nextInt();
System.out.print(&quot;Enter the Anthony age and height in
cm&quot;);
age3=input.nextInt();
height3=input.nextInt();
if(age1&lt;age2 &amp;&amp; age1&lt;age3){
System.out.println(&quot;Amar is youngest&quot;);
}
else if(age2&lt;age1 &amp;&amp; age2&lt;age3){
System.out.println(&quot;Akbar is youngest&quot;);
}
else{
System.out.println(&quot;Anthony is youngest&quot;);
}
if(height1&gt;height2 &amp;&amp; height1&gt;height3){
System.out.println(&quot;Amar is Tallest&quot;);
}
else if(height2&gt;height1 &amp;&amp; height2&gt;height3){
System.out.println(&quot;Akbar is Tallest&quot;);
}
else{
System.out.println(&quot;Anthony is Tallest&quot;);
}
}
}