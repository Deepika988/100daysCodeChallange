package prgms6;
import java.util.*;
public class Kaprekar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int sq=n*n;
		int count=0;
		int firstpart=0;
		int secondpart=0;
		int sum=0;
		int temp=sq;
		while(temp!=0)
		{
			count=count+1;
			temp=temp/10;
		
		}
		for(int i=count-1;i>0;i--)
		{
			firstpart= (sq/(int)Math.pow(10, i));
			secondpart=(sq%(int)Math.pow(10, i));
			if(firstpart!=0 && secondpart!=0 )
			{
			sum=firstpart+secondpart;
			}
			if(sum==n)
			{
				System.out.println("Kaprekar Number");
				break;
			}
			
		}
		if(sum!=n){
			System.out.println("Not Kaprekar Number");
			
		}
	}

}
