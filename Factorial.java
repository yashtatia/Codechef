import java.math.*;
import java.io.*;
public class Factorial
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int N;
        int numOfZeroes[]=new int[T];
        for(int i=0;i<T;i++)
        {
            N=Integer.parseInt(br.readLine());
            String bi=factorial(N);
            numOfZeroes[i]=zeroes(bi);            
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(numOfZeroes[i]);
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
    
    public static int zeroes(String n)
    {
        int counter=0;
        for(int i=n.length()-1;i>=0;i--)
        {
            if(n.charAt(i)=='0')
            {
                counter++;
            }
            else
            {
                break;
            }
        }
        return counter;
    }
}