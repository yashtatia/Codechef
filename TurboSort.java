import java.util.*;
import java.io.*;
public class TurboSort
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        ArrayList<Integer> sorter=new ArrayList<Integer>();
        int N=Integer.parseInt(br.readLine());
        sorter.add(N);
        for(int i=1;i<t;i++)
        {
            N=Integer.parseInt(br.readLine());
            boolean flag=true;
            for(int j=0;j<sorter.size();j++)
            {
                Integer count=sorter.get(j);
                int counter=(int)count;
                if(counter>N)
                {
                    sorter.add(j,N);
                    flag=false;
                    break;
                }
            }
            
            if(flag)
            {
                sorter.add(N);
            }
        }
        
        for(Integer counter: sorter)
        {
            System.out.println(counter);
        }
    }
}