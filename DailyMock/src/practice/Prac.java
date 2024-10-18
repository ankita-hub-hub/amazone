package practice;

public class Prac {

	public static void main(String[] args) {
		//if marks greater than 40 print you are pass
		
		int marks=50;
		
		if(marks>40)
		{
			System.out.println("you are pass");
		}
		
		
		//if marks greater than 40 print you are pass or print you are fail
		
		int marks1=10;
		
		if(marks1>40)
		{
			System.out.println("you are pass");
		}
		
		else
		{
			System.out.println("you are fail");
		}
		
	//sum of natural numbers
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		
		//second largest number in array
		
		int a[]= {20,50,40,60,70,80,80};
		int largest=0;
		int secondLargest=0;
		
		for(int i=0; i<=a.length-1;i++)
		{
			if(a[i]>largest)
			{
				secondLargest=largest;
				largest=a[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		
		

	}

}
