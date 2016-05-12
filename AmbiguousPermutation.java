import java.util.*;
class AmbiguousPermutation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int n=sc.nextInt();
            if(n!=0)
            {
                int[] permu=new int[n];
                for(int i=0;i<n;i++)
                {
                    int num=sc.nextInt();
                    permu[i]=num;
                }
                
                int[] invPermu=new int[n];
                for(int i=0;i<n;i++)
                {
                    int j=permu[i];
                    invPermu[j-1]=i+1;
                }
                
                if(Arrays.equals(permu,invPermu))
                {
                    System.out.println("ambiguous");
                }
                else
                {
                    System.out.println("not ambiguous");
                }
            }else{
                break;
            }
        }
    }
}