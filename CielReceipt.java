import java.util.*;

class CielReceipt
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int i;
       int[] count=new int[t];
       for(int j=0;j<t;j++)
       {
           int p=sc.nextInt();
           if(p==1)
           {
               count[j]+=1;
            }
           while(p>1)
           {
               for(i=11;i>=0;i--)
               {
                   int quotient=(int)(p/Math.pow(2,i));
                   if(quotient>0)
                   {
                       count[j]+=quotient;
                       break;
                   }
               }
               p=(int)(p%Math.pow(2,i));
               if(p==1)
               {
                   count[j]+=1;
                }
           }
        }
        
       for(int j=0;j<t;j++)
       {
           System.out.println(count[j]);
        }
    }
}