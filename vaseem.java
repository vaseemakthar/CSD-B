// You are using Java
import java.util.Scanner;
class java
{
    static void dp(int n)
    {
        if(n>7)
        {
            throw new ArithmeticException("IllegalArgumentException caught - Number should not be greater than 7");
        }
        else if(n==0)
        {
            throw new IllegalArgumentException("ArithmeticException caught - / by zero");
        }
    }
}
class main
{
    public static void main(String[] args)
    {
        int n;
        Scanner ml=new Scanner(System.in);
        try
        {
            n=ml.nextInt();
            java.dp(n);
            n=n-4;
            System.out.println("The input number is "+n);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException o)
        {
            System.out.println(o.getMessage());
        }
    }
}
