//Exceeds time limit try using same code in C
import java.util.*;
class SumOfTriangle
{
    static int[][] mat=new int[100][100];
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            
            for(int k=0;k<n;k++)
            {
                for(int l=0;l<k+1;l++)
                {
                    int p=sc.nextInt();
                    mat[k][l]=p;
                }
            }
            System.out.println(solve(n));
        }
    }
    
    public static int solve(int x)
    {
        if(x==1)
        {
            return mat[0][0];
        }
        
        for(int k=x-2;k>=0;k--)
        {
            for(int l=0;l<=k;l++)
            {
                mat[k][l]+=Math.max(mat[k+1][l],mat[k+1][l+1]);
            }
        }
        return mat[0][0];
    }
}
