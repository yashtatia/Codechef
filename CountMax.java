import java.util.*;

class CountMax
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       String[] result=new String[t];
       for(int i=0;i<t;i++)
       {
           int n=sc.nextInt();
           ArrayList<Integer> arrays=new ArrayList<Integer>();
           int[] counter=new int[n];
           int[] diffNum=new int[n];
           int l=0;
           for(int j=0;j<n;j++)
           {
               arrays.add(sc.nextInt());
           }
           
           while(!arrays.isEmpty())
           {
               diffNum[l]=arrays.get(0);
               counter[l]++;
               arrays.remove((Integer)diffNum[l]);
               while(arrays.contains(diffNum[l]))
               {
                   counter[l]++;
                   arrays.remove((Integer)diffNum[l]);
                } 
               l++; 
            }
           
           int bigger=counter[0];
           int index=0;
           int f,smaller=diffNum[0];;
           for(f=1;f<l;f++)
           {
               if(bigger<counter[f])
               {
                   bigger=counter[f];
                   index=f;
                   smaller=diffNum[index];
                }
               
               else if(bigger==counter[f])
               {
                   if(smaller>diffNum[f])
                   {
                       smaller=diffNum[f];
                       index=f;
                   }
                }
 
           }
           result[i]=diffNum[index]+" "+counter[index];
        }
       
       for(int i=0;i<t;i++)
       {
           System.out.println(result[i]);
       }
    }
}