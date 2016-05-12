import java.io.*;
public class EnormousInputTest
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        String[] line=br.readLine().split(" ");
        int n=Integer.parseInt(line[0]);
        int k=Integer.parseInt(line[1]);
        int counter=0;
        while(n!=0)
        {
            
            if(Integer.parseInt(br.readLine())%k==0)
            {
                counter++;
            }
            n--;
        }
        System.out.println(counter);
    }
}