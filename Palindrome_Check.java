package BasicPrograms;
import java.util.*;
public class Palindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int s=sc.nextInt();
		int a[]=new int[s];
		int r;
		for(int i=0;i<s;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++){
			int rev=0;
			int temp=a[i];
		while(a[i]>0){
			r=a[i]%10;
			rev=(rev*10)+r;
			a[i]=a[i]/10;
		}
		if(temp==rev)
		{
			System.out.println( temp+ " is a palindrome");
		}
		else
		{
			System.out.println(temp+" is not a palindrome");
		}
	}

	}

}
