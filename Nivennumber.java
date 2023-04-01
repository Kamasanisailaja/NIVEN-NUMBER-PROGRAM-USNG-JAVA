//to find wether a number is niven numbe or not

import java.util.Scanner;
public class Nivennumber
{
    public static void main(String args[])
    {
        int n,sum=0,k=0,mul=1,m;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the value of n");
        n=in.nextInt();
        m=n;
    while(n>0)
    {
        k=n%10;
        sum=sum+k;
        n=n/10;
    }
    if(m%sum==0)
    {
        System.out.println("it is niven number "+m);
    }
    else
    {
        System.out.println("it is not niven number "+m);

    }

    
}
}