package arrays;

public class orderedArray {
	int[] array;
	int currentSize;
	int lowIdx;
	int highIdx;
	orderedArray(int size){
		array=new int[size];
		currentSize=0;
		lowIdx=0;
		highIdx=array.length-1;
	}
	
	
//insertion in order
	void insert(int ele){
		int i;
		for(i=0;i<currentSize;i++)
		{
			if(array[i]>ele)
				break;
		}
		for(int k=currentSize ; k>i ;k--){
			array[k]=array[k-1];
		}
		array[i]=ele;
		currentSize++;
	}
	
	
	//deletion in order
	void delete(int ele)
	{
		int i;
		for(i=0;i<currentSize;i++)
		{
			if(array[i]==ele)
				break;
		}
		if(i!=currentSize)
		{
			for(int k=i;k<currentSize;k++)
		{
			array[k]=array[k+1];
		}
			currentSize--;
		}
		
	}
	
	//using while
		void binSearch(int k)
		{
			int mid=(lowIdx+highIdx)/2;
			boolean found=false;
			while(k!=array[mid] && lowIdx<=highIdx)
			{
				mid=(lowIdx+highIdx)/2;
				if(k<array[mid]){
					highIdx=mid-1;
				}
				if(k>array[mid])
				{
					lowIdx=mid+1;
				}
				if(k==array[mid])
				{
					System.out.println("element found"+array[mid]);
					found=true;
				}
				
			}
			if(!found)
			{
				System.out.println("not present");
			}
			}
		
	
	
	//recursion
	int binSearchRecursion(int lowIdx,int highIdx,int k)
	{
		
		int mid=(lowIdx+highIdx)/2;
		if(lowIdx<=highIdx)
		{
		if(k>array[mid])
			{
			binSearchRecursion(mid+1,highIdx,k);
			}
		if(k<array[mid])
		{
			binSearchRecursion(lowIdx,mid-1,k);
		}
		if(k==array[mid])
		{
			return array[mid];
		}
		}
		return 0;
	}
	
	
	void display(){
	for(int i=0;i<currentSize;i++)
	{
		System.out.println(array[i]);
	}
		
	}
}
