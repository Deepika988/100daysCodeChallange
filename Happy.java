package prgms6;
import java.util.*;
public class Happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		int res=n;
		while(res!=1 && res!=4)
		{
			res=print(res);
		}
		if(res==1)
		{
			System.out.println("HAPPY NUMBER");
		}
		else
		{
			System.out.println("Not a happy number");
		}
		
	}
	static int print(int n){
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		return sum;
	}

}
