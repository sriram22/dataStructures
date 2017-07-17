package linkedList;

public class queueLLTest {

	public static void main(String args[])
	{
		queueLL q=new queueLL();
		q.enqueue(2);
		q.enqueue(21);
		q.enqueue(12);
		
		q.displayList();
		
		q.dequeue();
		System.out.println("after dequeue");
		q.displayList();
	}
}
