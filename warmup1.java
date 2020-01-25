import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            int n=Integer.parseInt(br.readLine());
            int j;
            char x[]=new char[n];
            for(j=0;j<n;j++)
            {
                x[j]=(char)br.read();
            }
            int a=0,b=0,c=0;
            for(j=0;j<n;j++)
            {
                if(x[j]=='D')
                a++;
                else if(x[j]=='U')
                b++;
                if(a==b&&a>1&&b>1)
                {
                    c++;
                    a=0;
                    b=0;
                }
                if(b>=3&&a==0)
                {
                    c=0;
                    break;
                }
            }
            System.out.println(c);
        }
        catch(NumberFormatException ne){
        System.out.println("");
        }    
    }
}
