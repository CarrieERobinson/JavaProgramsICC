package recursionpersonalpract;
import java.util.*;
public class RecursionPersonalPract
{
    public static Scanner userIn = new Scanner(System.in);
    public static void main(String[] args) 
    {
        boolean flag = false;
        int f = 0;
        int bNum = 0;
        int eNum = 0;
//        do
//        {
//            try
//            {
//                System.out.print("Enter number to find factorial of:  ");
//                f = userIn.nextInt();
//                System.out.print("Enter base number:  ");
//                bNum = userIn.nextInt();
//                System.out.print("Enter exponent number:  ");
//                eNum = userIn.nextInt();
//                flag = false;
//            }catch(InputMismatchException ex)
//            {
//                userIn.next();
//                System.out.println("Please enter a valid integer!");
//                flag = true;
//            }
//        }while(flag);
//        System.out.println(f + "! = " + factorial(f));
//        System.out.println(bNum + " to the power " + eNum + " is " + power(bNum, eNum));
        System.out.println(fibonacci(6));
    }
    public static int factorial(int n)
    {
        if(n <= 1) 
            return 1;
        else
            return n * factorial(n - 1);
    }
    
    public static int power(int x, int y)
    {
        if(y == 0)
            return 1;
        else
            return x * power(x, y - 1);
    }
    
    public static int fibonacci(int n)
    {
        if(n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n - 2);
    }
}