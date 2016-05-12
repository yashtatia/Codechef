import java.io.*;
class BirthdayCakes
{
    static int j;
    public static void main(String[] ags)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String[] line=br.readLine().split(" ");
            int[] noOfCandles=new int[10];
            int small=10;
            int index=0;
            int result=0;
            for(j=0;j<10;j++)
            {
                noOfCandles[j]=Integer.parseInt(line[j]);
                if(small>noOfCandles[j])
                {
                    small=noOfCandles[j];
                    index=j;
                }         
            }
            
            
            if(index==0)
            {
                small=10;
                int rabbit=0;
                for(j=1;j<10;j++)
                {
                    if(small>noOfCandles[j])
                    {
                        small=noOfCandles[j];
                        rabbit=j;
                    }
                    j++;
                }
                result=(int)Math.pow(10,noOfCandles[index]+1)*noOfCandles[rabbit];
                
            }
            else
            {
                while(true)
                {
                    if(noOfCandles[index]!=0)
                    {
                        result=result*10+index;
                        noOfCandles[index]--;
                    }
                    else
                    {
                        result=result*10+index;
                        break;
                    }
                }
            }
            
            System.out.println(result);
        }
    }
}