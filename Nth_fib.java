package prgms3;
import java.util.*;
public class Nth_fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); // n = 10
		int t1 = 0 , t2 = 1;
		System.out.println("Nth Fibonacci numbers of a given number:"+n);
		  // t1 = 0  
		int sum=0;
		for(int i=2;i<=n;i++)
		{
			sum=t1+t2;// sum = 0+1 = 1
			t1 = t2;  // t1 = 1
			t2 = sum;  // t2 = 1		
			 //0 1 1 2
			
		}
		
		System.out.print(" "+sum); 
	}

}
