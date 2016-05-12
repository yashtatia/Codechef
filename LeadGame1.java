import java.util.*;
public class LeadGame1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int lead,W=0,L=0,Si,Ti,S1=0,S2=0;
        for(int i=0;i<N;i++)
        {
            Si=sc.nextInt();
            Ti=sc.nextInt();
            S1+=Si;
            S2+=Ti;
            lead=S1-S2;
            if(Math.abs(L)<Math.abs(lead))
            {
                L=lead;
            }
        }
        if(L>0)
                {
                    W=1;
                }
                else
                {
                    W=2;
                }
        System.out.println(W+" "+Math.abs(L));
    }
}