package practice;

public class IntExcecution implements Int1 {

	public static void main(String[] args) {
		IntExcecution i=new IntExcecution();
		i.hello();
		i.hi();

	}

	
	 public void hi() {
		System.out.println("hi method calling");
		
	}

	
	public void hello() {
		System.out.println("hello method calling");
	}

}
