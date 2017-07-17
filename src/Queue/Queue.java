package Queue;


class Queue{

	int front,rear,capacity;
	int[] queueArray;
	
	Queue(int size)
	{
		front=-1;
		rear=size-1;
		capacity=0;
		queueArray=new int[size];
	}
	
	void enqueue(int ele){
		if(capacity==queueArray.length){
			System.out.println("full");
		}
		else
			{
			rear=(rear+1)%queueArray.length;
			queueArray[rear]=ele;
			
			capacity++;
			System.out.println("enqueued element:"+ele);
			}
	}
	
	void dequeue()
	{
		if(capacity==0)
		{
			System.out.println("empty");
		}
		else
			{
			front=(front+1)%queueArray.length;
			System.out.println(queueArray[front]);
			
			capacity--;
			}
	}
}
