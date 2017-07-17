package linkedList;

public class stackLL {

	private simpleLinkedList linkList;
	
	stackLL()
	{
		linkList=new simpleLinkedList();
	}
	
	void push(int data)
	{

		linkList.insertFirst(data);
	}
	
	void pop(){
		if(!linkList.isEmpty())
		linkList.deleteFirst();
		else
			System.out.println("nothing there to delete");
	}
	
	void display()
	{
		linkList.displayList();
	}
}
