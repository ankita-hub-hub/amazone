package practice;

public class Demo {

	public static void main(String[] args) {
		
		int a=10;//a=20
		int b=20;//b=10
		int c;
		
		System.out.println("original vaur of a is "+a);
		System.out.println("original vaur of b is "+b);
		c=a;
		a=b;
		b=c;
		
		System.out.println("swap value of a is "+a);
		System.out.println("swap value of b is "+b);
		
		System.out.println("================================");

		int d=10;//20
		int e=20;//10
		
		d=d+e;//10+20=30
		e=d-e;//30-20=10
		d=d-e;//30-10=20
		System.out.println(d);
		System.out.println(e);
		
		
		

	}

}
