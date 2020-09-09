package prgms6;
import java.util.*;
public class Neon_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		int sq=n*n;
		int sum=0;
		while(sq>0){
			int r=sq%10;
			sum=sum+r;
			sq=sq/10;
			
		}
		if(n==sum)
		{
			System.out.println("Neon number");
		}
		else
		{
			System.out.println("Not a neon number");
		}

	}

}
