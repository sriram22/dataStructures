package stacks;

public class stack implements Istack {
	
	char[] stackArray;
	int currentSize;
	
	public stack(int size)
	{
		stackArray=new char[size];
		currentSize=-1;
		
	}
	
	@Override
	public void push(char element) {
		// TODO Auto-generated method stub
		if(currentSize<stackArray.length-1)
		{
			stackArray[++currentSize]=element;
		}
		else
		{
			System.out.println("overflow");
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		char poppedval = 0;
		if(currentSize > -1)
		{
			poppedval=stackArray[currentSize];
			stackArray[currentSize]=0;
			currentSize--;
		}
		return poppedval;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (currentSize==-1);
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		return (stackArray[currentSize]);
	}

	void display()
	{
		for(int i=0;i<stackArray.length;i++)
		{
			System.out.println("stack"+i+":"+stackArray[i]);
		}
	}
	
}
