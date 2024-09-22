import java.util.Scanner;
public class OddEven
{
    public static void main(String[]args)
    {
        double num,fix;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number:- ");
        num=input.nextDouble();
         
        fix=num%2;
        
        if(fix==0){
            System.out.println("the number is  even " +num);
        }else{
            System.out.println("the number is odd " +num);
        }input.close();

    }
}