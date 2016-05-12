import java.util.*;
class PermutationCycles
{
    static int j;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int cycles=0;
        int[] permu=new int[n];
        for(int i=0;i<n;i++)
        {
            permu[i]=sc.nextInt();
        }
        
        ArrayList<Integer> visited=new ArrayList<Integer>(); 
        ArrayList<Integer> toVisit=new ArrayList<Integer>();
        
        for(j=0;j<n;j++)
        {
            toVisit.add(j);
        }
        int k1=0;
        
        while(true)
        {
            if( true       )
            {
            }
        }
    }
    
    public static boolean belongs(int k1, ArrayList<Integer> visited)
    {
        boolean flag=false;
        for(int c:visited)
        { 
            if(c==k1)
            {
                flag=true;
                break;
            }
            
        }
        return flag;
    }
}
/*
        for(int k:toVisit)
        {
            visited.add(k);
            k1=permu[k]-1;
            toVisit.remove(k);
            visited.add(k1);
            while(!belongs(k1,visited))
            {
                k1=permu[k1]-1;
                toVisit.remove(k1);
                visited.add(k1);
            }
            
        }*/