import java.util.Scanner;
public class Swap
{
    public static void main(String[]args)
    {
    
     Scanner input=new Scanner(System.in);
     System.out.println("Program to add swap two numbers ");
     int num1,num2,num3;

     System.out.print("please enter the first number:- ");
     num1=input.nextInt();
     System.out.print("please enter the second number:- ");
     num2=input.nextInt();
     
     num3=num1;
     num1=num2;
     num2=num3;
     
     System.out.println("The value after swapping these two numbers are "+num1+ " and " +num2);

    }
}