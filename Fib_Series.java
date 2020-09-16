package prgms3;
import java.util.*;
public class Fib_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); // n = 10
		int t1 = 0 , t2 = 1;
		System.out.println("Fibonacci numbers upto given number:"+n);
		System.out.print(t1);  // t1 = 0  
		int sum=0;
		while(sum<n)
		{
			sum = t1 + t2; // sum = 0+1 = 1
			t1 = t2;  // t1 = 1
			t2 = sum;  // t2 = 1		
			System.out.print(" "+t1);  //0 1 1 2
		}

	}

}
