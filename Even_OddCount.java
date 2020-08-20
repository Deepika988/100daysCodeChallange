package BasicPrograms;
import java.util.*;
public class Even_OddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a size:");
		int si=s.nextInt();
		int ar[]=new int[si];
		int even=0,odd=0;
		System.out.println("Enter the "+si+" array elements");
		for(int i=0;i<si;i++){
			ar[i]=s.nextInt();
		}
		for( int i=0;i<si;i++){
			if(ar[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("EvenCount is "+even);
		System.out.println("OddCount is "+odd);

	}

}
