import java.util.*;

class PackagingCupcakes
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int[] result=new int[t];
       for(int i=0;i<t;i++)
       {
           int n=sc.nextInt();
           
           if(n==1)
           {
               result[i]=1;
           }
           else
           {
               result[i]=(int)(n/2)+1;
           }
        }
        
       for(int i=0;i<t;i++)
       {
           System.out.println(result[i]);
       }
    }
}