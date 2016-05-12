import java.io.*;
class Carvans
{
    static int j;
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            String[] line=br.readLine().split(" ");
            int[] carSpeed=new int[n];
            for(j=0;j<n;j++)
            {
                carSpeed[j]=Integer.parseInt(line[j]);
            }
            
            int counter=1;
            for(j=1;j<n;j++)
            {
                if(carSpeed[j-1]>=carSpeed[j])
                {
                    counter++;
                }
                else
                {
                    carSpeed[j]=carSpeed[j];
                }
            }
            System.out.println(counter);
        }
    }
}