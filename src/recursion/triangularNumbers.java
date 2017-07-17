package recursion;

public class triangularNumbers {

	public static void main(String args[])
	{
		int sum=0;
		sum=triangle(5);
		System.out.println(sum);
	}

	//using recursion
	static int triangle(int n)
	{
		System.out.println("\nEnterning number"+n);
		if(n==1)
			{
			System.out.println("\nreturning 1");
			return 1;
			}
			int temp=n+triangle(n-1);
			System.out.println("\nreturning"+" "+temp);
		return temp;
		
	}
	
	static int triangle1(int n)
	{
		int total=0;
		while(n>0)
		{
			total+=n;
			n--;
		}
		return total;
	}
}

