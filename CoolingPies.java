import java.util.*;
class CoolingPies
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] count=new int[t];
        for(int i=0;i<t;i++)
        {
            count[i]=0;
            int n=sc.nextInt();
            ArrayList<Integer> piesWeight=new ArrayList<Integer>();
            //Iterator<Integer> itr1=piesWeight.iterator();
            ArrayList<Integer> rackWeight=new ArrayList<Integer>();
            //Iterator<Integer> itr1=rackWeight.iterator();
            
            for(int j=0;j<n;j++)
            {
                piesWeight.add(sc.nextInt());
            }
            
            for(int j=0;j<n;j++)
            {
                rackWeight.add(sc.nextInt());
            }
            Collections.sort(piesWeight);
            Collections.sort(rackWeight);
            int p1=n-1;
            int r1=n-1;
            while(p1>=0&&r1>=0)
            {
                
                if(piesWeight.get(p1).compareTo(rackWeight.get(r1))>0)
                {
                    piesWeight.remove(p1);
                    p1--;
                }
                else
                {
                    piesWeight.remove(p1);
                    rackWeight.remove(r1);
                    count[i]++;
                    p1--;
                    r1--;
                }   
            }
        }
        
        for(int i=0;i<t;i++)
        {
            System.out.println(count[i]);
        }
    }
}