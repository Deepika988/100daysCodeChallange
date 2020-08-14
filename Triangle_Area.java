package pack1;
import java.util.*;
public class Triangle_Area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the base");
        float b=s.nextFloat();
        System.out.println("Enter the height");
        float h=s.nextFloat();
        double a=0.5*b*h;
        System.out.println("Area of triangle is "+a);
	}

}
