package prgms6;
import java.util.*;
import java.lang.Math;
public class Unhappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		for(int i=count(n);i>=0;i--)
		{
			if(n>0)
			{
			int rem=n%10;
			sum=(int) (sum+Math.pow(rem,i));
			n=n/10;
			}
			
		}
		if(temp==sum)
		{
			System.out.println("UNHAPPY NUMBER");
		}
		else
		{
			System.out.println("NOT A UNHAPPY NUMBER");
		}

	}
	static int count(int n){
		int c=0;
		while(n>0)
		{
			
			int r=n%10;
			c=c+1;
			n=n/10;
		}
		return c;
		
	}

}
