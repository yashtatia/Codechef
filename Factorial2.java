import java.io.*;
import java.math.*;
public class Factorial2
{
    
    public static void main(String[] ags)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        
        if(t>=1&&t<=100)
        {
            int[] result=new int[t];
            
            for(int i=0;i<t;i++)
            {
                int n=Integer.parseInt(br.readLine());
                if(t>=1&&t<=100)
                {
                    result[i]=factorial(n);
                }
            }
            for(int i=0;i<t;i++)
            {
                System.out.println(result[i]);
            
            }
        }
    }
    
    public static int factorial(int n)
    {
        int fact;
        if(n==1)
        {
            return 1;
        }
        fact=n*factorial(n-1);
       return fact;
    }
}