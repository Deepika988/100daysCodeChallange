package prgms2;
import java.util.*;
public class Twin_prime {
	 static boolean isPrime(int n){
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)  //  20/2 == 0 -> t
				c++;  
		}
		if(c==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n1,n2;
		     Scanner sc = new Scanner(System.in);
		     System.out.println("enter number1:");
		     n1 = sc.nextInt();
		     System.out.println("enter number2:");
		     n2 = sc.nextInt();
		     if (isPrime(n1)==true && isPrime(n2)==true && (n2-n1)== 2 )
		    	System.out.println("Twin Prime Number") ;
		     else
		    	 System.out.println("Not Twin Prime Numbers");

	}

}
