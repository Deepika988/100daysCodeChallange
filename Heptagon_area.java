package Formulas;
import java.util.*;
public class Heptagon_area {
	public static void main(String[] args) 
	{
	  Scanner obj = new Scanner(System.in);
      System.out.println("enter length of a side ");
      float s = obj.nextFloat();
      float a = 3.634f * s * s;
      System.out.println("Area of Heptagon = "+ a);
	}

}
