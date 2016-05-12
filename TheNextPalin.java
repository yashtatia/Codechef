import java.io.*;
class TheNextPalin
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        char[] ch;
        int k=0;
        int counter;
        char b,e;
        for(int i=0;i<t;i++)
        {
            String line=br.readLine();
            int l=line.length();
            counter=0;
            ch=line.toCharArray();
            boolean flag=true;
            if(l==1&&ch[0]<'9')
            {
                ch[0]++;
            }
            else if(l==1&&ch[0]=='9')
            {
                k=1;
                System.out.println("11");
            }
            else if(l%2==0)
            {
                
                while(true)
                {
                    
                    b=ch[counter];
                    e=ch[l-counter-1];
                    if(counter!=l/2-1)
                    {
                       
                        if(b>e)
                        {
                            flag=false;
                        }
                        ch[l-counter-1]=b;
                    }
                    else
                    {
                        if(b!=e)
                        {
                            if(b>e)
                            {
                                ch[l-counter-1]=b;
                            }
                            else
                            {
                                ch[counter]++;
                                ch[l-counter-1]=ch[counter];
                            }                           
                            break;
                        }
                        else
                        {
                            if(b=='9')
                            {
                                if(flag)
                                {
                                    while(counter>0)
                                {
                                    if(ch[counter]=='9')
                                    {
                                        ch[counter]='0';
                                        ch[l-counter-1]='0';
                                        counter--;
                                    }
                                    else
                                    {
                                        ch[counter]++;
                                        ch[l-counter-1]=ch[counter];
                                        counter=1;
                                        break;
                                    }
                                    
                                    
                                }
                                
                                if(counter==0)
                                {
                                    String s=""+1;
                                    for(int j=1;j<=l-1;j++)
                                    {
                                        s=s+"0";
                                    }
                                    s=s+"1";
                                    k=1;
                                    
                                    System.out.println(s);
                                    break;
                                }
                                    
                                }
                                else
                                {
                                    break;
                                }
                                
                            }
                            else
                            {
                                if(flag)
                                {
                                    ch[counter]++;
                                    ch[l-counter-1]=ch[counter];
                                    break;
                                }
                                else
                                {
                                    break;
                                }
                            }
                        }
                        
                    }
                    counter++;
                }
            }
            
            else if(l%2!=0&&l>0)
            {           
                        
                
                while(counter<=l/2)
                {
                    
                    b=ch[counter];
                    e=ch[l-counter-1];
                    if(counter!=l/2)
                    {
                        if(b>e)
                        {
                            //ch[0-counter-0]=b;
                            flag=false;
                        }
                        ch[l-counter-1]=b;
                    }
                    else
                    {
                        if(b=='9')
                            {
                                if(flag)
                                { 
                                    while(counter>0)
                                {
                                    
                                    if(ch[counter]=='9')
                                    {
                                        ch[counter]='0';
                                        ch[l-1-counter]='0';
                                        counter--;
                                    }
                                    else
                                    {
                                        //System.out.println(ch[counter]);
                                        ch[counter]++;
                                        ch[l-counter-1]=ch[counter];
                                        counter=1;
                                        break;
                                    }
                                    
                                    //System.out.println(ch[counter]);
                                    //System.out.println();
                                }
                                
                                if(ch[counter]=='9'&&counter==0)
                                {
                                    String s=""+1;
                                    for(int j=1;j<l;j++)
                                    {
                                        s=s+"0";
                                    }
                                    s=s+"1";
                                    k=1;
                                    System.out.println(s);
                                    break;
                                }
                                else
                                    {
                                        //System.out.println(ch[counter]);
                                        ch[counter]++;
                                        ch[l-counter-1]=ch[counter];
                                        break;
                                    }
                                    
                                }
                                else
                                {
                                    break;
                                }
                                
                                
                            }
                            else
                            {
                                if(flag)
                                {
                                    ch[counter]++;
                                    break;
                                }
                                else
                                {
                                    break;
                                }
                            }
                    }
                    counter++;
                }
            }
            
            if(k!=1)
            {
                for(int j=0;j<l;j++)
                {
                    System.out.print(ch[j]);
                }
                System.out.println();
                
            }
            
        }
    }
}