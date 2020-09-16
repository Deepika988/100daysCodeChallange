package prgms3;
import java.util.*;
public class Fib_Series2 {
	public static void main(String[] args) 
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number :");
	int n = obj.nextInt(); // n = 10
	int t1 = 0 , t2 = 1;
	System.out.println("Fibonacci series:");
	System.out.print(t1+ " "+t2);  // t1 = 0  t2 = 1
	for(int i = 2; i<n; i++)
	{
		int sum = t1 + t2; // sum = 1+1 = 2
		  //0 1 1 2
		System.out.print(" "+sum);
		t1 = t2;  // t1 = 1
		t2 = sum;  // t2 = 1
		
	}
	}

}
