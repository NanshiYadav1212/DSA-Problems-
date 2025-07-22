import java.util.*;
public class Gcd{
    static int gcd1(int n1,int n2)
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
    static int gcd2(int n1,int n2)
    {
        if(n2==0) return n1;
        return gcd2(n2,n1%n2);
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ans1=gcd1(n1,n2);
        int ans2=gcd2(n1,n2);
        System.out.println("gcd of "+n1+" & "+n2 +" is "+ans1 +" and "+ ans2);
    }
}