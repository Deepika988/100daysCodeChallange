package pack1;
import java.io.*;
public class File_Write {
   public static void main(String args[]) throws Exception{
	   FileWriter fw = new FileWriter("e:\\File1.txt",true);
	   System.out.println("file is created");
	   fw.write("java class");
	   fw.write(" 100days");
	   fw.flush();
	   fw.close();
   }
}
