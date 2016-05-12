import java.util.*;

class PayingUp
{
    static int j;
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
           int n=sc.nextInt();
           int m=sc.nextInt();
           int[] notes=new int[n];
           boolean flag=false;
           for(j=0;j<n;j++)
           {
               notes[j]=sc.nextInt();
           }
          
           for(j=0;j<Math.pow(2,n);j++)
           {
               int sum=0;
               for(int k=0;k<n;k++)
               {
                   //check if jth bit in j is set...Gray Code Order
                   if((j&(1<<k))>0)
                   {
                       sum=sum+notes[k];
                     
                    }
               }
              
               if(sum==m)
               {
                   flag=true;
                   break;
               }
              
           }
           
           if(flag)
           {
               System.out.println("Yes");
           }
           else
           {
               System.out.println("No");
           }
           
       }
    }
}