import java.util.*;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int withdraw=sc.nextInt();
        float balance=sc.nextFloat();
        if(withdraw%5==0)
        {
            float balance1=balance;
            balance=balance-withdraw-0.5f;
            if(balance>=0)
            {
                System.out.printf("%.2f",balance);
            }
            else
            {
                System.out.printf("%.2f",balance1);
            }
        }
        else
        {
            System.out.printf("%.2f",balance);
        }
    }
}