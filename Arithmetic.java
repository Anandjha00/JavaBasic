import java.util.Scanner;
public class Arithmetic
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num1,num2,sum,mul,sub;
        double div;
        System.out.println("performing mathematical calculations\n\n");
        System.out.println("please enter the first number");
        num1=input.nextInt();
        System.out.println("please enter the second number");
        num2=input.nextInt();
        
        sum=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        
        System.out.println("addition= " +sum);
        System.out.println("substraction= " +sub);
        System.out.println("multiplication=  " +mul);
        System.out.println("division = " +div);
        


    }
}