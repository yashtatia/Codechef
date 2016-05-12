//changing IO
import java.io.*;// time taken for execution 6.01
class CoinFlip1
{
    static int j;
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        
        for(int i=0;i<t;i++)
        {
            int g=Integer.parseInt(br.readLine());
            int counter=0;
            for(j=0;j<g;j++)
            {
                String[] line=br.readLine().split(" ");
                int I=Integer.parseInt(line[0]);
                int N=Integer.parseInt(line[1]);
                int Q=Integer.parseInt(line[2]);
                
                //I=1, all head
                //I=2 all tail
                int countHeads=0;
                int countTails=0;
                
                if(I==1)
                {
                    countHeads=(int)N/2;
                    countTails=N-countHeads;                    
                }
                else
                {
                    countTails=(int)N/2;
                    countHeads=N-countTails;                    
                }
                
                if(Q==1)
                {
                    System.out.println(countHeads);
                }
                else
                {
                    System.out.println(countTails);
                }
            }
        }
    }
    
}