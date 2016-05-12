import java.io.*;
public class LeadGame
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] Si=new int[1000];
        int[] Ti=new int[1000];
        //int[] lead=new int[N];
        int lead,W=0,L=-1;
        for(int i=0;i<N;i++)
        {
            String[] line=br.readLine().split(" ");
            Si[i]=Integer.parseInt(line[0]);
            Ti[i]=Integer.parseInt(line[1]);
            lead=Si[i]-Ti[i];
            if(L<Math.abs(lead))
            {
                L=Math.abs(lead);
                if(lead>0)
                {
                    W=1;
                }
                else
                {
                    W=2;
                }
            }
        }
        
        System.out.println(W+" "+L);
    }
}