import java.io.*;
import java.util.*;
class RacingHorses
{
    static int j;
    public static void main(String[] ags)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            String[] line=br.readLine().split(" ");
            int[] s=new int[n];
            for(j=0;j<n;j++)
            {
                s[j]=Integer.parseInt(line[j]);
            }
            int p;
            Arrays.sort(s);
            int min=s[1]-s[0];
            for(j=1;j<n-1;j++)
            {
                p=s[j+1]-s[j];
                if(p<min)
                {
                    min=p;
                }
            }
            System.out.println(min);
        }
    }
}