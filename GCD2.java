import java.io.*;
class GCD2
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++)
        {
            String[] line=br.readLine().split(" ");
            int a=Integer.parseInt(line[0]);
            int b=Integer.parseInt(line[1]);
            System.out.println(findGCD(a,b));
        }
        
    }
    
    public static int findGCD(int number1, int number2)
    {
        if(number2==0)
        {
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
}