import java.util.*;
class ThreeWayCommunication
{
    static int j;
    public static void main(String[] arsg)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int distance=sc.nextInt();
            int[] x=new int[3];
            int[] y=new int[3];
            for(j=0;j<3;j++)
            {
                x[j]=sc.nextInt();
                y[j]=sc.nextInt();
            }
            
            int distanceChefHeadServer=(int)Math.ceil(Math.sqrt((y[1]-y[0])*(y[1]-y[0])+(x[1]-x[0])*(x[1]-x[0])));
            int distanceChefSousChef=(int)Math.ceil(Math.sqrt((y[2]-y[0])*(y[2]-y[0])+(x[2]-x[0])*(x[2]-x[0])));
            int distanceHeadServerSousChef=(int)Math.ceil(Math.sqrt((y[1]-y[2])*(y[1]-y[2])+(x[1]-x[2])*(x[1]-x[2])));
            
            if((distanceChefHeadServer<=distance&&distanceHeadServerSousChef<=distance)||(distanceChefHeadServer<=distance&&distanceChefSousChef<=distance)||(distanceChefSousChef<=distance&&distanceHeadServerSousChef<=distance))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}