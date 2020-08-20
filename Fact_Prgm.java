package BasicPrograms;
import java.util.*;
public class Fact_Prgm {
	public static void main(String[] args) 
	{
	   Scanner obj = new Scanner(System.in);
	   System.out.println("enter number:");
	   int n = obj.nextInt(); // 5
	   int f =1;
	   for(int i = 1; i<=n ; i++)
	   {
		   f = f*i;
	   }
	   System.out.println("Factorial = "+f);
	}

}
