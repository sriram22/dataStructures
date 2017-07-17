package recursion;

public class binarySearch {

	static int key=12;
	static int[] a=new int[]{12,14,25,26,27,30,32};
	public static void main(String args[])
	{
		int lowIdx=0;
		int highIdx=a.length-1;
		String a="";
		a=binarySearchRecursive(lowIdx,highIdx);
		System.out.println(a);
	}
	
	static String binarySearchRecursive(int lowIdx,int highIdx){
		int mid=(lowIdx+highIdx)/2;
		String s="";	
		
		if(lowIdx>highIdx)
		{
			return "not found";		
		}
		else{
			if(a[mid]>key)
			{
				return binarySearchRecursive(lowIdx,mid-1);
			}
			else if(a[mid]<key)
			{
				return binarySearchRecursive(mid+1,highIdx);
			}
			else if(a[mid]==key)
			{
				return "found";
			}
		}
		
	return null;
}
}