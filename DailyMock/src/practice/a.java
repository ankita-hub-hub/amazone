package practice;

public class a {
	
	int c=20;
	static int h=10;
	static a a1;
	public static void main(String[] args)
	{
		a1=new a();
		a1.alpha();
		
		b();
		
	}
	
	public void alpha()
	{
		System.out.println(h);
	}
	
	public static void b()
	{
	  
		System.out.println(a1.c);
		
	}
	

}
