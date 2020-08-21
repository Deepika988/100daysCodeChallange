package pack1;
import java.io.*;
public class File_Read {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("e:\\File1.txt");
		  FileReader fr = new FileReader(f);
		  char[] ch = new char[50];
		  fr.read(ch);
		  for (char c1:ch)
		  { System.out.print(c1); }
          
	}

}
