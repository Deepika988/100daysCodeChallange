package pack1;
import java.util.*;
public class Area_Rect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int l=s.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int b=s.nextInt();
        int ar=l*b;
        System.out.println("area of rectangle is "+ar);
	}

}
