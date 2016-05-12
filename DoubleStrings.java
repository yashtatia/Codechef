import java.util.*;
class DoubleStrings
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] n=new int[t];
        for(int i=0;i<t;i++)
        {
            n[i]=sc.nextInt();
        }
        
        for(int i=0;i<t;i++)
        {
            if(n[i]%2==0)
            {
                System.out.println(n[i]);
            }
            else
            {
                System.out.println(n[i]-1);
            }
        }
    }
}