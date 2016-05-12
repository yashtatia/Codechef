import java.io.*;
class VeryEasyProblem
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] line=br.readLine().split(" ");
        int a=Integer.parseInt(line[0]);
        int n=Integer.parseInt(line[1]);
        int k=Integer.parseInt(line[2]);
        int[] reactors=new int[k];
        for(int i=0;i<k;i++)
        {
            reactors[i]=a%(n+1);
            a/=(n+1);
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(reactors[i]+" ");
        }
    }
}