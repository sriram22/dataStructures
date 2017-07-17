package recursion;

public class factorial {

	public static void main(String args[])
	{
		int val=0;
		val=factorial(5); 
		System.out.println(val);
	}
	
	static int factorial(int n)
	{
		if(n==0||n==1)
			return 1;
		
		return n*factorial(n-1);
	}
}
