import java.util.*;//time for execution 8.77
class CoinFlip
{
    static int j;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int g=sc.nextInt();
            int counter=0;
            for(j=0;j<g;j++)
            {
                int I=sc.nextInt();
                int N=sc.nextInt();
                int Q=sc.nextInt();
                
                //I=1, all head
                //I=2 all tail
                int countHeads=0;
                int countTails=0;
                
                if(I==1)
                {
                    countHeads=(int)N/2;
                    countTails=N-countHeads;                    
                }
                else
                {
                    countTails=(int)N/2;
                    countHeads=N-countTails;                    
                }
                
                if(Q==1)
                {
                    System.out.println(countHeads);
                }
                else
                {
                    System.out.println(countTails);
                }
            }
        }
    }
    
}