package arrays;

public class unorderedArray {

	int[] array;
	int currentSize;
	unorderedArray(int size){
		array=new int[size];
		currentSize=0;
	}
	
	//to set element in an array at the specified position
	
	
	void insert(int ele){
		
		//to check overflow
		
		if(currentSize<array.length){
			array[currentSize++]=ele;
			
		}
		else
		{
			System.out.println("array overflow");
		}
		
	}
	
	//not duplicates
	void Lsearch(int key){
		int i;
		for(i=0;i<currentSize;i++)
		{
			if(array[i]==key){
				break;
			}
		}
		if(i==currentSize){
			System.out.println("cant find the element");
		}
		else
		{
			System.out.println("Element found"+key);
		}
	}

	
	void delete(int key)
	{
		int i;
		for(i=0;i<currentSize;i++)
		{
			if(array[i]==key)
				break;
		}
		if(i==currentSize)
		{
			System.out.println("element not found");
		}
		else
		{
			for(int j=i;j<currentSize;j++)
			{
				array[j]=array[j+1];
			}
			currentSize--;
		}
	}
	
	void display(){
	for(int i=0;i<currentSize;i++)
	{
		System.out.println(array[i]);
	}
		
	}
}

