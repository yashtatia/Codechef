import java.util.*;
import java.io.*;
class TransformTheExpression
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        //String[] result=new String[t];
        for(int i=0;i<t;i++)
        {
            String line=br.readLine();
            String box="";
            String result="";
            while(!line.isEmpty())
            {
                int lastIndex=line.lastIndexOf('(');
                int firstIndex=line.indexOf(')',lastIndex);
                String stringBwparenthesis=line.substring(lastIndex+1,firstIndex);
                char[] chars=new char[stringBwparenthesis.length()];
                chars=stringBwparenthesis.toCharArray();
                System.out.println(chars);
                if(chars.length==3)
                {
                    box=""+chars[0]+chars[2]+chars[1];
                    result=box+result;
                }
                else if(chars.length==2)
                {
                    result=chars[0]+result+chars[1];
                }
                else
                {
                    result=result+chars[0];
                }
                line=line.substring(0,lastIndex)+line.substring(firstIndex+1,line.length());
            }
            //System.out.println(result);
        }
        
        for(int i=0;i<t;i++)
        {
            //System.out.println(result);
        }
    }
}
//last result wrong