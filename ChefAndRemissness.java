import java.io.*;
class ChefAndRemissness
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
            int c=a+b;
            int max=(a>b)?a:b;
            System.out.println(max+" "+c);
            
        }
    }
}