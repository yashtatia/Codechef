import java.util.*;
import java.io.*;
class BuyingSweets
{
    static int j;
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String[] line1=br.readLine().split(" ");
            int n=Integer.parseInt(line1[0]);
            int x=Integer.parseInt(line1[1]);
            
            int[] bankNotes=new int[n];
            int sum=0,sum1=0;
            int min=400;
            String[] line2=br.readLine().split(" ");
            for(j=0;j<n;j++)
            {
                bankNotes[j]=Integer.parseInt(line2[j]);
                sum+=bankNotes[j];
                if(min>bankNotes[j])
                {
                    min=bankNotes[j];
                }
            }
            
            Arrays.sort(bankNotes);
            if(sum%x==0)
            {
                System.out.println(sum/x);
            }
            else
            {
                //int p=sum/x;
                if(sum%x<min)
                {
                    System.out.println(sum/x);
                }
                else
                {
                    System.out.println(-1);
                }
            }
        }
    }
}