package pack1;

public class Static_var {
	static int x =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_var t1 = new Static_var();
		   t1.x=50;
		   System.out.println(t1.x);  //50
		   
		   Static_var t2 = new Static_var();
		   System.out.println(t2.x);  //50

	}

}
