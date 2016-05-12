import java.util.*;

class CuttingRecipes
{
    static int j;
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       
       for(int i=0;i<t;i++)
       {
           int n=sc.nextInt();
           int[] nums=new int[n];
           int maximum;
           int hcf;
           for(j=0;j<n;j++)
           {
               nums[j]=sc.nextInt();
           }
           
           hcf=nums[0];
           for(j=1;j<n;j++)
           {
               hcf=getHCF(hcf,nums[j]);
            }
           
           for(j=0;j<n;j++)
           {
               System.out.print(nums[j]/hcf+" ");
           }
           System.out.println();
        }
    }
        
    static int getHCF(int a, int b)
    {
        int small=(a<b)?a:b;
        int hcf=1;
        for(int i=1;i<=small;i++)
        {
            if(b%i==0&&a%i==0)
            {
                hcf=i;
            }
        }
        return hcf;
    }
}