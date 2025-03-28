import java.util.Scanner;
class TotalIncome {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter your salary (INR): &quot;);
double salary = scanner.nextDouble();
System.out.print(&quot;Enter your bonus (INR): &quot;);
double bonus = scanner.nextDouble();
double totalIncome = salary + bonus;
System.out.printf(&quot;The salary is INR %.2f and bonus is INR %.2f.
Hence, Total Income is INR %.2f.\n&quot;,
salary, bonus, totalIncome);
scanner.close();
}
}