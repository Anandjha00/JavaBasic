import java.util.Scanner;
public class Product
{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        double num1,num2,pro;
        System.out.println("please enter the first number");
        num1=input.nextDouble();
        System.out.println("please enter the second number ");
        num2= input.nextDouble();
        
        pro=num1*num2;
       
        System.out.print("the product of these two numbers = " +pro);

    }
}