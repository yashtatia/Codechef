import java.util.*;
class Lapindromes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
            String firstHalf, secondHalf;
            String s=sc.next();
            int len=s.length();
            if(s.length()%2==0)
            {
                firstHalf=s.substring(0,len/2);
                secondHalf=s.substring(len/2,len);
            }
            else
            {
                firstHalf=s.substring(0,(len-1)/2);
                secondHalf=s.substring((len+1)/2,len);
            }
            
            //System.out.println(firstHalf+"      "+secondHalf);
            if(firstHalf.compareTo(secondHalf)==0)
            {
                System.out.println("YES");
            }
            else
            {
                char[] fH=new char[firstHalf.length()];
                char[] sH=new char[secondHalf.length()];
                fH=firstHalf.toCharArray();
                sH=secondHalf.toCharArray();
                Arrays.sort(sH);
                Arrays.sort(fH);
                //System.out.println(fH+"        "+sH);
                if(Arrays.equals(fH,sH))
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
        
    }
}