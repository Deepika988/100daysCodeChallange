package prgms3;
import java.util.*;
public class Sum_fib_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); // n = 10
		int t1 = 0 , t2 = 1,c=0;
		System.out.println("Sum of Fibonacci numbers upto given number:"+n);
		  // t1 = 0  
		int sum=t1+t2;
		for(int i=2;i<=n;i++)
		{
			c = t1 + t2;
			sum=sum+c;// sum = 0+1 = 1
			t1 = t2;  // t1 = 1
			t2 = c;  // t2 = 1		
			 //0 1 1 2
		}
		System.out.println(" "+sum); 

	}

}
