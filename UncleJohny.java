import java.util.Arrays;
import java.io.*;
class UncleJohny
{
    static int j;
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            String[] line=br.readLine().split(" ");
            for(j=0;j<n;j++)
            {
                a[j]=Integer.parseInt(line[j]);
            }
            int pos=Integer.parseInt(br.readLine());
            int length=a[pos-1];
            
            Arrays.sort(a);
            //System.out.println(a);
            for(j=0;j<n;j++)
            {
                if(a[j]==length)
                {
                    System.out.println(j+1);
                }
            }
        }
    }
}