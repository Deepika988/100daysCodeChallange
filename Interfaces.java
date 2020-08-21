package pack1;
interface A
{
	void show();
}
interface B
{
	void show2();
}
class C implements A,B
{
	public void show()
	{
		System.out.println("Interface-A");
	}
	public void show2()
	{
		System.out.println("Interface-B");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.show();
		obj.show2();

	}

}
