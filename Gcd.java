import java.util.*;
public class Gcd{
    static int gcd(int n1,int n2)
    {
        int gcd=1;
        int n=Math.min(n1,n2);
        for(int i=1;i<n;i++)
        {
            if(n1%i==0 && n2%i==0)
             gcd=i;
        }
        return gcd;
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ans=gcd(n1,n2);
        System.out.println("gcd of "+n1+" & "+n2 +" is "+ans);
    }
}