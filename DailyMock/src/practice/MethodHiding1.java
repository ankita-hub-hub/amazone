package practice;

public class MethodHiding1 extends MethodHiding{

	public static void main(String[] args) {
		test();
		MethodHiding.test();
		

	}
	
	public static void test()
	{
		System.out.println("hi, test method calling from sub class");
	}

}
