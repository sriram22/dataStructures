package recursion;

public class anagram {
	static String name="cat";
	static char[] a=name.toCharArray();
	public static void main(String args[])
	{
		
		recursiveAnagram(name.length());
		
	}
	
	
	//recursive approach
	
	static void recursiveAnagram(int length)
	{
		if(length==1)
			return;
		
			for(int i=0;i<length;i++)
			{
				recursiveAnagram(length-1);
				if(length==2)
					{
					displayword();
					}
			 rotatewordRecursive(length);
			
		}
	}
	
	static void rotatewordRecursive(int size){
		int position=a.length-size;
		char temp=a[position];
		int i;
		for(i=position+1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[i-1]=temp;
	}
	
	//iterative approach
	static void anagram(int length)
	{
		for(int i=0;i<length;i++)
		{
			for(int j=1;j<=2;j++)
			{
				displayword();
				rotateword();
			}
			shiftRotateword();
		}
	}
	
	static void displayword()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println("");
	}
	
	static void rotateword(){
		char temp;
		temp=a[name.length()-1];
		a[name.length()-1]=a[name.length()-2];
		a[name.length()-2]=temp;
		
	}
	
	static void shiftRotateword()
	{
		char t=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=t;
	}
}
