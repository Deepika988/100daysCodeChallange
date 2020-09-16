package prgms6;
import java.util.*;
public class TriPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
    	int n=s.nextInt();
    	/*int sum=0;
    	int i=1;*/
    	int sum=1+n;
    	int i=2;
    	/*while(i<n)
    	{
    		if(n%i==0)
    		{
    			sum=sum+i;
    		}
    		i=i+1;
    	}*/
    	while(i*i<=n)
    	{
    		if(n%i==0)
    		{
    			if(n%i==i)
    			{
    				sum=sum+i;
    			}
    			else
    			{
    				sum=sum+i+n/i;
    			}
    		}
    		i=i+1;
    	}
    	if(sum==(3*n))
    	{
    		System.out.println("Tri Perfect number");
    	}
    	else
    	{
    		System.out.println("Not a TriPerfect number");
    	}

	}

}
