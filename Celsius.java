// converting temperture from fahrenhit to celsius!
import java.util.Scanner;
public class Celsius
{
    public static void main(String args [])
    {
      Scanner input = new Scanner(System.in);
      System.out.println("program to convert Fahrenheit to celsius");
      System .out.println("enter temperature in fahrenheit :- ");
      int ftem=input.nextInt();
      double ctem;
      
      ctem=(ftem -32 )*5/9 ;
      
      System.out.print("Tempeture in Celsius :- " +ctem);
    }
}