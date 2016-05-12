import java.util.*;

class CleaningUp
{
    static int j,k;
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       ArrayList<Integer> listOfJobsCompleted=new ArrayList<Integer>();
       for(int i=0;i<t;i++)
       {
           int totalJobs=sc.nextInt();
           int jobsCompleted=sc.nextInt();
           int jobsToBeCompleted=totalJobs-jobsCompleted;
           ArrayList<Integer> listOfJobsLeftToBeCompleted=new ArrayList<Integer>();
           
           int[] chefJobs=new int[jobsToBeCompleted];
           int[] assistantJobs=new int[jobsToBeCompleted];
           int c=0,a=0;
           listOfJobsCompleted.clear();
           for(j=0;j<jobsCompleted;j++)
           {
               listOfJobsCompleted.add(sc.nextInt());
           }
           
           for(j=1;j<=totalJobs;j++)
           {
               boolean flag=false;
               flag=exist(j,listOfJobsCompleted);
                   if(flag)
                   {
                       listOfJobsLeftToBeCompleted.add(j);
                   }
               
           }
           
           for(k=0;k<listOfJobsLeftToBeCompleted.size();k+=2)
           {
               chefJobs[c]=listOfJobsLeftToBeCompleted.get(k);
               c++;
           }
           
           for(k=1;k<listOfJobsLeftToBeCompleted.size();k+=2)
           {
               assistantJobs[a]=listOfJobsLeftToBeCompleted.get(k);
               a++;
           }
           
           
           if(chefJobs==null)
           {
               System.out.println();
            }
           else
           {
               for(k=0;k<c;k++)
               {
                   System.out.print(chefJobs[k]+" ");
               }
               System.out.println();
            }
            
           if(chefJobs==null)
           {
               System.out.println();
            }
           else
           {
               for(k=0;k<a;k++)
               {
                   System.out.print(assistantJobs[k]+" ");
               }
               System.out.println();
            } 
        }
    }
    
    static boolean exist(int n,ArrayList<Integer> listOfJobsCompleted)
    {
        
        boolean flag=true;
        for(int p:listOfJobsCompleted)
        {
            if(p==n)
            {
                flag=false;
            }
        }
        return flag;
    }
}