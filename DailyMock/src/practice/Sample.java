package practice;

public class Sample {
	
	public static void main(String[] args)
	{

		
//         *
//        **
//       ***
//      ****
//     *****
		for(int i=1; i<=10; i++)

		{

		for(int j=9; j>=i; j--)
		{
		   System.out.print(" ");
		}
		     for(int j=1; j<=i; j++)
		      {
		    System.out.print("*");
		      }
		System.out.println();
		}
		
		System.out.println();
		System.out.println("========================");
//		* * * * *
//		 * * * *
//		  * * *
//		   * *
//		    *
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "); 
			}
			for(int j=5; j>=i; j--)
			{ 
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("=========================");
		
		
//		* * * * *
//		 * * * *
//		  * * *
//		   * *
//		    *
		
		
		
		for(int i=5; i>=1; i--)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
