import java.util.Scanner;
public class Remain
{
    public static void main(String[]args)
    {
        int num1,num2,rem;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the first number:-");
        num1=input.nextInt();
        System.out.println("please enter the second number:-");
        num2=input.nextInt();
        
        
        rem=num1%num2;
        if(num2!=0){
            System.out.println("the remainder of these two numbers is :- " +rem);
    
        }else{
            System.out.println("error!");
        }
        input.close();

    }
}