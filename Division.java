import java.util.Scanner;
public class Division
{
    public static void main(String[]args)
    {
        //taking divisor and dividend from user and then divide and print the result
        Scanner input=new Scanner(System.in);
        System.out.println("enter the divisor:-");
        double dsor=input.nextDouble();
        System.out.println("enter the dividend:-");
        double ddend=input.nextDouble();
        
        double drs=ddend/dsor;
        
        System.out.println("The result of " +ddend+ " divided by "+dsor+" is " +drs);
        input.close();

    }
}