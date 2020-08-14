package pack1;
import java.util.*;
public class Area_Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        System.out.println("Enter the square side");
        float side=s.nextFloat();
        double area=side*side;
        System.out.println("Area of square is "+area);
	}

}
