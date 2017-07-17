package Queue;

public class priorityQueue {

	int front,rear;
	int size=0;
	int[] priorityArray;
	
	priorityQueue(int size)
	{
		priorityArray=new int[size];
	}
	public void insert(int ele)
	{
		if(size==priorityArray.length)
		{
			System.out.println("full");
		}
		else if(size==0)
		{
			priorityArray[size++]=ele;
		}
		else
		{
		
			int j=size-1;
			
			while(j>=0 && ele > priorityArray[j])
			{
				priorityArray[j+1]=priorityArray[j];
				j--;
			}
			priorityArray[j+1]=ele;
			size++;
		
		}
	}
	
	public int remove()
	{
		return priorityArray[--size]; 
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(priorityArray[i]);
		}
	}
}
