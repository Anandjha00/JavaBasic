import java.util.Scanner;
public class Perimeter
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int length,width,peri;
        System.out.print("finding perimeter of a rectangle\n\n");
        System.out.println("Enter the lengh of rectangle");
        length=input.nextInt();
        System.out.println("Enter the width of rectangle");
        width=input.nextInt();
        
        
        int c= length+width;
        peri=2*c;
        
        System.out.print("The perimeter of rectangle is :- "+peri);

    }
}