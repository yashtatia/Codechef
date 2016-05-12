import java.util.*;

class CielProblem
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int diff=a-b;
       if(diff%10==9)
       {
           System.out.println(diff-1);
        }
        else
        {
            System.out.println(diff+1);
        }
    }
}