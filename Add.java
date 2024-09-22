import java.util.Scanner;
public class Add{
    public static void main(String[]args)
    {
         int num1,num2,sum;
         Scanner input=new Scanner(System.in);
         System.out.println("Addition of  given numbers:!\n");
        
         System.out.println("please enter a first number");
         num1=input.nextInt();
         System.out.println("please enter a second number");
         num2=input.nextInt();
        
         sum=num1+num2;
        System.out.println("The addition of these two numbers is:-" + sum);
        input.close();

    }
}