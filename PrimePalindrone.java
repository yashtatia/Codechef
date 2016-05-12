import java.util.*;

class PrimePalindrone
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       while(true)
       {
           if(checkPalindrome(n)&&checkPrime(n))
           {
               System.out.println(n);
               break;
            }
           n++; 
        }
    }
    
    public static boolean checkPrime(int n)
    {
        boolean flag=true;
        int count=0;
        if(n==1)
        {
            flag=false;
        }
        else
        {
            for(int i=2;i<n/2+1;i++)
            {   
                if(n%i==0)
                {
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
    
    public static boolean checkPalindrome(int n)
    {
        boolean flag=false;
        
            int m=n;
            int palindromeNumber=0;        
            while(n>0)
            {
                palindromeNumber=palindromeNumber*10+n%10;
                n=n/10;
            }
            
            if(palindromeNumber==m)
            {
                flag=true;
            }
        

        return flag;
    }
}//importance of &&
//palindrome takes less time than to check prime