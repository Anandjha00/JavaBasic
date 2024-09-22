
import java.util.Scanner;
public class Square
{
    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        double num,square;
        
        System.out.println("please enter a number ;-");
        num=input.nextDouble();
        
        square=Math.pow(num,2);
        System.out.println("the squre of the number "+num+ " is:- " +square);
        input.close();
    }
}