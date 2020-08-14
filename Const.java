package pack1;
class Student
{
	String name;
	int roll_no;
	
	Student(String name, int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
	}
	public void printStudent()
	{
		System.out.println(name);
		System.out.println(roll_no);
	}	
}
public class Const {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student("Suresh",101);
		s1.printStudent();

	}

}
