import java .util.Scanner;
public class AreaOfTriangle
{
    public static void main(String args [])
    {
        Scanner input= new Scanner(System.in);
        System.out.print("finding the area of a triangle\n\n");
        System.out.print("enter the base of the triangle :-");
        int base=input.nextInt();
        System.out.print("Enter the length of the triangle :- ");
        int len= input.nextInt();
        
        double area=0.5*len*base;
       
        System.out.println("The area of triangle is :- " +area);

    }
}