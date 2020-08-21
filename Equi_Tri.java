package Formulas;
import java.util.*;
public class Equi_Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of triangle :");
		float a=s.nextFloat();
		double area= 1.73*a*a;
		System.out.println("Area of Equilateral Triangle is :"+area);
		System.out.printf("%1.2f",area);

	}

}
