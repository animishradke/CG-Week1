import java.util.Scanner;
public class TravelDetails {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter your name: &quot;);
String name = scanner.nextLine();
System.out.print(&quot;Enter your starting city: &quot;);
String fromCity = scanner.nextLine();
System.out.print(&quot;Enter your via city: &quot;);
String viaCity = scanner.nextLine();
System.out.print(&quot;Enter your final destination city: &quot;);
String toCity = scanner.nextLine();
System.out.print(&quot;Enter distance from start city to via city (in
miles): &quot;);
double fromToVia = scanner.nextDouble();
System.out.print(&quot;Enter distance from via city to final destination
(in miles): &quot;);

double viaToFinalCity = scanner.nextDouble();
System.out.print(&quot;Enter time taken (in hours): &quot;);
double timeTaken = scanner.nextDouble();
double totalDistance = fromToVia + viaToFinalCity;
double averageSpeed = totalDistance / timeTaken;
System.out.println(&quot;Traveler: &quot; + name);
System.out.println(&quot;Route: &quot; + fromCity + &quot; -&gt; &quot; + viaCity + &quot; -&gt; &quot;
+ toCity);
System.out.println(&quot;Total distance: &quot; + totalDistance + &quot; miles&quot;);
System.out.println(&quot;Time taken: &quot; + timeTaken + &quot; hours&quot;);
System.out.println(&quot;Average speed: &quot; + averageSpeed + &quot;
miles/hour&quot;);
}
}