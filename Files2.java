package pack1;
import java.io.*;
public class Files2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int c = 0;
		File f = new File("E:\\");
// f var holds id of e:\\ drive
		String[] s = f.list();
// enhanced for loop
		for(String s1 : s)
		{
			File f1 = new File(f,s1);
			// f var holds id of s1 present in f
			if(f1.isFile())
			{
			System.out.println(s1);
			c++;
			}
		}
		System.out.println(" total files = "+c);

	}

}
