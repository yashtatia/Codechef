import java.io.*;
public class Factorial1
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int numOfZeroes[]=new int[T];
        
        for(int i=0;i<T;i++)
        {
            int N=Integer.parseInt(br.readLine());
            numOfZeroes[i]=zeroes(N);
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(numOfZeroes[i]);
        }
    }
    
    public static int zeroes(int n)
    {
        int counter=0;
        int i=1;
        int result=1;
        while(result>=1)
        {
            
            result=(int)(n/Math.pow(5,i));
            i++;
            counter+=result;
        }
        return counter;
    }
}