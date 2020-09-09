package prgms6;
import java.util.*;
public class Auto_Morphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=s.nextInt();
		int sq=n*n;
		int x=0;
		while(n>0)
		{
			if(n%10==sq%10)
			{
				n=n/10;
				sq=sq/10;
				
			}
			else{
				x=1;
				break;
			}
		}
		if(x==0)
		{
			System.out.println("Automorphic number ");
		}
		else
		{
			System.out.println("not an automorphic number ");
		}

	}

}
