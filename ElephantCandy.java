import java.util.*;

class ElephantCandy
{
    static int j;
    public static void main(String[] args)
    {
        boolean flag=false;
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
           int totalElephants=sc.nextInt();
           int totalCandies=sc.nextInt();
           int[] candyElephantNeeds=new int[totalElephants];
           //boolean flag=false;
           int sum=0;
           for(j=0;j<totalElephants;j++)
           {
               candyElephantNeeds[j]=sc.nextInt();
               sum+=candyElephantNeeds[j];
           }
           
           if(sum>totalCandies)
           {
               System.out.println("No");
           }
           else
           {
               System.out.println("Yes");
            }
           
           
        }
    }
}
