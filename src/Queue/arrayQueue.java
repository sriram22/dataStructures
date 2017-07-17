package Queue;

public class arrayQueue {

	int front,rear;
	int size;
	int[] queueArray;
	
	arrayQueue(int size)
	{
		queueArray=new int[size];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public void enqueue(int key)
	{
		
		if(size==queueArray.length)
		{
			System.out.println("queue is full");
			return;
		}
		
		 if (rear==queueArray.length-1)
		{
			rear=-1;
		}
		
			size++;
			queueArray[++rear]=key;
	}
	
	
	public int dequeue()
	{
		int dequeudVal=0;
		if(size==0)
		{
			System.out.println("empty");
			return 0;
		}
		 if(front==rear)
		{
			front=-1;
		}
		
			dequeudVal=queueArray[++front];
			size--;
		
		return dequeudVal;
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(queueArray[i]);
		}
	}
}
