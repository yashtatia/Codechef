import java.io.*;
import java.util.*;

class TranformTheExpression1
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       
       for(int i=0;i<t;i++)
       {
           String line=br.readLine();
           char[] chars=new char[line.length()];
           chars=line.toCharArray();
           String result="";
           Stack st=new Stack();
           for(int j=0;j<line.length();j++)
           {
               switch(chars[j])
               {
                   case '(': break;
                   
                   case '+':st.push(chars[j]);
                            break;
                   case '-':st.push(chars[j]);
                            break;         
                   case '*':st.push(chars[j]);
                            break;
                   case '/':st.push(chars[j]);
                            break;
                   case '^':st.push(chars[j]);
                            break;
                            
                   case ')':result=result+st.pop();
                            break;
                   
                   default: result=result+chars[j];
                             break;
               }
           }
           System.out.println(result);
       }
    }
}