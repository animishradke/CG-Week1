import java.util.Scanner;
public class SwapNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter first number: &quot;);
int number1 = scanner.nextInt();
System.out.print(&quot;Enter second number: &quot;);
int number2 = scanner.nextInt();
int temp = number1;


number1 = number2;
number2 = temp;
System.out.println(&quot;The swapped numbers are &quot; + number1 + &quot; and &quot; +
number2);
}
}