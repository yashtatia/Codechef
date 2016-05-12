import java.io.*;
public class LifeUniverseEverything
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num;
        num=Integer.parseInt(br.readLine());     
        while(num!=42)
        {
            System.out.println(num);
            num=Integer.parseInt(br.readLine());
        }
    }
}
