package practice;

public class ReverseString {
	public static void main(String[] args) {
		
		String a="ankita";
		String b="";
		System.out.println("original string is "+a);
		for(int i=a.length()-1; i>=0; i--)
		{
			b=b+a.charAt(i);//ati
			
		}
		System.out.println("reverse string is "+b);
		
		
		
		String upperCase = a.toUpperCase();
		hello();
		a.toUpperCase();
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
	}
	
	public static void hello()
	{
		int g=10;
		//System.out.println("hi");
		System.out.println(g);
		String c="anushri";
		
		System.out.println(c.toUpperCase());
		
	}
	
	

}
