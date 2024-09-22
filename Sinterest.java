//finding simple and compound interest on basis of the given details.
import java.util.Scanner;
public class Sinterest
{
    public static void main(String args [])
    {
        Scanner input= new Scanner(System.in);
        int p,t;
        double r,Siminterest ,Cominterest;
        
        System.out.print("finding the Simple interest and Compound Interest\n\n");
        System.out.print("Please enter the principle ammount :- ");
        p=input.nextInt();
        System.out.print("please enter time in years :-");
        t=input.nextInt();
        System.out.print("please enter the rate of interest :-");
        r=input.nextDouble();
        
        Siminterest = (p*r*t)/100;
        Cominterest= p *Math.pow((1+ r/100), t)-p ;
        
        System.out.println("Simple interest is :- " +Siminterest);
        System.out.println("Compound interest is :- " +Cominterest);


    }
}