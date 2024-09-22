// finding square root of a given number !
import java.util.Scanner;
public class Squareroot
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        double num,squrt;
        System.out.println("Finding square root of a given number!\n");
        System.out.println("please enter a number");
        num=input.nextDouble();
        
        squrt=Math.sqrt(num);
        
        System.out.println("the square root of this number is :-" +squrt);
        input.close();
    }
}