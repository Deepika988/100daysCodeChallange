package prgms3;
import java.util.*;
public class nearst_fib {
    boolean isfib(int n)
    {
    	int a=0,b=1,c=0;
    	while(c<n)
    	{
    		c=a+b;
    		a=b;
    		b=c;
    	}
    	if(c==n)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    int beforefib(int n)
    {
    	int c=0;
    	while(true)
    	{
    		if(isfib(n))
    		{
    			return c;
    		}
    		else
    		{
    			n=n-1;
    			c++;
    		}
    	}
    }
    int afterfib(int n)
    {
    	int c=0;
    	while(true)
    	{
    		if(isfib(n))
    		{
    			return c;
    		}
    		else
    		{
    			n=n+1;
    			c++;
    		}
    	}
    }
    void nearestfib()
    {
    	Scanner s =new Scanner(System.in);
    	System.out.println("Enter a number");
    	int n=s.nextInt();
    	int m1=beforefib(n);
    	int m2=afterfib(n);
    	if(m1>m2)
    	{
    		System.out.println("Nearest fibanacci number is:");
    		System.out.println(n+m2);
    	}
    	else if(m2>m1)
    	{
    		System.out.println("Nearest fibanacci number is:");
    		System.out.println(n-m1);
    	}
    	else if((n-m1)==(n+m2))
    	{
    		System.out.println("It is a Fibannaci number");
    	}
    	else if(m1==m2)
    	{
    		System.out.println("Nearest fibanacci number is:");
    		System.out.println((n-m1)+" "+(n+m2));
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nearst_fib o=new nearst_fib();
		o.nearestfib();

	}

}
