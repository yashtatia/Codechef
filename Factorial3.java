import java.math.*;
import java.io.*;
public class Factorial3
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int N;
        String bi[]=new String[T];
        for(int i=0;i<T;i++)
        {
            N=Integer.parseInt(br.readLine());
            bi[i]=factorial(N);            
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(bi[i]);
        }
    }
    
    public static String factorial(int n)
    {
        BigInteger fact=new BigInteger("1");
        for(int i=1;i<=n;i++)
        {
            fact=fact.multiply(new BigInteger(i+""));
        }
        return fact.toString();
    }
}