package prgms2;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter 2 numbers:");
		  int n1 =sc.nextInt();  //12
		  int n2 = sc.nextInt(); //24
		  int gcd = 1;
		  
		  for(int i =1; i<=n1 && i<=n2; i++ )
		  {
			  if(n1%i==0  && n2%i==0)
				  gcd = i;  // 12
		  }
		  System.out.println("GCD = "+ gcd);

	}

}
