package pack1;
import java.util.*;
public class Display_Info {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter sno");
		int sno = obj.nextInt();
		System.out.println("enter sname");
		String sname = obj.next();
		System.out.println("enter age");
		byte age= obj.nextByte();
		System.out.println("enter fee");
		float fee= obj.nextFloat();
	System.out.println(" sno = "+sno+"\n sname = "+sname+"\n age = "+age+"\n fee = "+fee);
	
	}

}
