// Display a good morning meassage to user and adding given numbers !
import java.util.Scanner;
public class Goodmorning
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("please enter your name ");
        String yourname=input.nextLine();
        System.out.print("Good morning " +yourname+ ". write a program to add two numbers!" );
       
        int num1,num2,sum;
        System.out.print("\n Okk ,please follow these steps;-");
        System.out.print("please enter first number:-");
        num1=input.nextInt();
        System.out.print("please enter the second number:- ");
        num2=input.nextInt();
        
        sum=num1+num2;
        System.out.println("The addition of these two numbers is :-" +sum);
    }
}