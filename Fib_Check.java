package BasicPrograms;
import java.util.*;
public class Fib_Check {
    public static void main(String args[]){
    	Scanner s= new Scanner(System.in);
    	System.out.println("Enter a number:");
    	int n=s.nextInt();
    	int a=0,b=1,c=0;
    	while(c<n){
    		c=a+b;
    		a=b;
    		b=c;
    	}
    	if(c==n){
    		System.out.println("It is a Fibannaci number");
    	}
    	else{
    		System.out.println("Not a fibannaci");
    	}
    }	

}
