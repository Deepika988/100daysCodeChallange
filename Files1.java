package pack1;
import java.io.*;
public class Files1 {
	public static void main(String args[])throws Exception{
	int c=0;
	File f = new File("E://");
	String[] s = f.list();
    for(String s1:s)
	{
		System.out.println(s1);
		c++;
	}
	System.out.println(" total = "+c);
}

}
