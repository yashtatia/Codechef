import java.io.*;
import java.util.*;
class BuyGet
{
    static int j;
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
        int t=Integer.parseInt(br.readLine());
        ArrayList<Character> jewels=new ArrayList<Character>();
        for(int i=0;i<t;i++)
        {
            jewels.clear();
            int k=0;
            String jewel=br.readLine();
            for(j=0;j<jewel.length();j++)
            {
                jewels.add(jewel.charAt(j));
            }
            
            int[] counter=new int[52];
            
            while(!jewels.isEmpty())
            {
                char c=jewels.get(0);
                while(jewels.contains((Character)c))
                {
                    jewels.remove((Character)c);
                    counter[k]++;
                }
                k++;
            }
            int result=0;
            
            for(j=0;j<k;j++)
            {
                result+=counter[j]/2+counter[j]%2;
            }
            System.out.println(result);
        }
    }
}