package prgms6;
import java.util.*;
public class Smith_num {
     static int sumdigits(int n)
     {
    	 int s=0;
    	 while(n>0)
    	 {
    		 int r=n%10;
    		 s=s+r;
    		 n=n/10;
    	 }
    	 return s;
     }
     static int sumprimefactors(int n)
     {
    	 int i=2,sum=0;
    	 while(n>1)
    	 {
    		 if(n%i==0)
    		 {
    			 sum=sum+sumdigits(i);
    			 n=n/i;
    		 }
    		 else
    		 {
    			 i++;
    		 }
    	 }
    	 return sum;
     }
     static boolean composite(int n)
     {
    	 int f=0;
    	 for(int k=1;k<=n;k++)
    		{
   		    	
   		    	if(n%k==0)
    		    	{
   		    		f=f+1;
   		    	}
   		    }
    	 if(f==2)
    	 {
    		 
    	 }
    	 return true;
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
//		int f=0;
//		
//		for(int k=1;k<=n;k++)
//	    {
//	    	
//	    	if(n%k==0)
//	    	{
//	    		f=f+1;
//	    	}
//	    }
//		
//		
	    if(composite(n)==true)
	    {
	    	System.out.println("It is not a compositie number");
	    }
	    else
	    {
	    int a=sumdigits(n);
		int a2=sumprimefactors(n);
		 if(a==a2)
		 {
			System.out.println("Smith number");
		 }
		 else
		 {
			System.out.println("Not Smith number");
		 }
	    }
		
	}

}
