import java.io.*;
public class Holes
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        
        for(int j=0;j<T;j++)
        {
            String line=br.readLine();
            char[] str=line.toCharArray();
            int count=0;
            for(int i=0;i<str.length;i++)
            {
                if(str[i]=='A'||str[i]=='D'||str[i]=='O'||str[i]=='P'||str[i]=='Q'||str[i]=='R')
                {
                    count++;
                }
                if(str[i]=='B')
                {
                    count+=2;
                }
            }
            System.out.println(count);
        }
    }
}