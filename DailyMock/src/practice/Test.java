package practice;

public class Test {

	public static void main(String[] args) {
		
		a a2=new a();
		a2.alpha();
		
		//eles if
		
//		int marks=40;
//		if(marks>=70)
//		{
//			System.out.println("you are in distinction");
//		}
//		
//		else
//		{
//			if(marks>=40)
//			{
//				System.out.println("you are pass");
//			}
//			else
//			{
//				System.out.println("you are fail");
//			}
//		}
		
//		//reverse array
//		int a[]= {50,60,40,90,40};
//		int b;
//		for(int i=0; i<=a.length-1; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		
//		for(int i=0; i<(a.length/2); i++)
//		{
//			b=a[i];
//			a[i]=a[(a.length-1)-i];
//			a[(a.length-1)-i]=b;
//		}
//		
//		for(int i=0; i<=a.length-1; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		
		//ascending order
		
//		int a[]= {50,70,90,40};
//		
//		for(int i=0; i<=a.length-1; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		
//		for(int i=0; i<=a.length-1; i++)
//		{
//			for(int j=i+1; j<=a.length-1; j++)
//			{
//				if(a[i]>a[j])
//				{
//					int b=a[i];
//					a[i]=a[j];
//					a[j]=b;
//				}
//			}
//		}
//		
//		for(int i=0; i<=a.length-1; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=(i*2)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
		
		

	}

}
