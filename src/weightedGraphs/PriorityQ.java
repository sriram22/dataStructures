package weightedGraphs;

public class PriorityQ {

	private final int SIZE=20;
	
	private Edge[] queueArray;
	private int size;
	
	public PriorityQ(){
		queueArray=new Edge[SIZE];
		size=0;
	}
	
	public void insert(Edge item)
	{
		if(size==0)
		{
			queueArray[size++]=item;
		}
		else{
			int j=size-1;
			
			while(j>=0 && item.distance>queueArray[j].distance)
			{
				queueArray[j+1]=queueArray[j];
				j--;
			}
			queueArray[j+1]=item;
			size++;
		}
		
	}
	
	public Edge removeMin(){
		return queueArray[--size];
	}
	
	//removes the edge if longer
	
	public void removeN(int idx)
	{
		for(int i=idx;i<size;i++)
		{
			queueArray[i]=queueArray[i+1];
		}
		size--;
	}
	
	public Edge peekMin(){
		return queueArray[size-1];
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return (size==0);
	}
	
	public Edge peekN(int idx)
	{
		return queueArray[idx];
	}
	
	public int find(int findDex){
		
		for(int i=0;i<size;i++)
		{
			if(queueArray[i].destVertex==findDex)
				return i;
		}
		return -1;
	}
}
