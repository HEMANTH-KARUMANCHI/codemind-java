import java.util.*;
class sample
{
    public static boolean p(int x)
    {
        if(x==0 || x==1)
        {
            return false;
        }
        int s=(int)Math.sqrt(x);
        for(int i=2;i<s+1;i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(p(i)==true)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}