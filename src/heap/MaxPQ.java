package heap;

public class MaxPQ {

	private int N;
	private int[] pq;
	
	MaxPQ(int capacity)
	{
		pq=new int[capacity+1];
		
	}
	
	
	public void insert(int key)
	{
		pq[++N]=key;
		swimUp(N);
	}
	
	
	public int delete()
	{
		int val=pq[1];
		exchg(1,N--);
		sink(1);
		pq[N+1]=0;
		return val;
	}
	/**
	 * This is to maintain the heap property while deleting they keys the parent can be smaller than one or both of the child
	 */
	
	public void sink(int k)
	{
		while(2*k<=N)
		{
			int j=2*k;
		
			if(less(j,j+1) && j<N)
			{
				j++;
			}
			if(!less(k,j))break;
			exchg(k,j);
		}
	}
	/**
	 * This is to maintain the heap property while inserting when child is not larger than the parent
	 * @param key
	 */
	public void swimUp(int k)
	{
		while(k>1 && less(k/2,k))
		{
			exchg(k/2,k);
			k=k/2;
		}
		
	}
	
	/**
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	
	private boolean less(int i, int j)
	{
		return(pq[j]>pq[i]);
	}
	
	private void exchg(int i, int j)
	{
		int temp=0;;
		temp=pq[i];
		pq[i]=pq[j];
		pq[j]=temp;
	}
	
	
	
	
	public void display()
	{
		for(int i=1;i<pq.length;i++)
		{
			System.out.println(pq[i]);
		}
	}
	
	/**
	 * This method is to heap order an unordered array using N/2 operations and then sort it by deleting the max and storing it in an array
	 * we can  use in place sort without using auxillary array
	 */
	
	
	
	public int[] sort(int[] a,int N){
		for(int i=N/2;i>=1;i--)
		{
			sink(a,N,i);
		}
		
		while(N>1)
		{
			exchg(a,1,N--);
			sink(a,N ,1);
		}
		return a;
	}
	
	
	/**
	 * This is to maintain the heap property while deleting they keys the parent can be smaller than one or both of the child
	 */
	
	public void sink(int[] a,int N,int k)
	{
		while(2*k<=N)
		{
			int j=2*k;
		
			if(less(j,j+1,a) && j<N)
			{
				j++;
			}
			if(!less(k,j,a))break;
			exchg(a,k,j);
		}
	}
	
	public void exchg(int[] a, int i, int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	private boolean less(int i, int j,int[] a)
	{
		return(a[j]>a[i]);
	}

	public void displaySort(int[] a) {
		for(int i=1;i<=3;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}


