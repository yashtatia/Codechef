import java.io.*;
class SnakeAndLadder
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++)
        {
            String[] line=br.readLine().split(" ");
            int b=Integer.parseInt(line[0]);
            int ls=Integer.parseInt(line[1]);
            
            double rs1=Math.sqrt(ls*ls-b*b);
            double rs2=Math.sqrt(ls*ls+b*b);
            
            System.out.printf("%.5f %.5f",rs1,rs2);
            System.out.println();
        }
    }
}