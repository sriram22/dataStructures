package Queue;

public class queueTest {

	public static void main(String args[])
	{
		arrayQueue q=new arrayQueue(3);
//		q.enqueue(1);
//		q.enqueue(2);
//		q.enqueue(3);
//		q.dequeue();
//		q.enqueue(4);
//		q.dequeue();
//		q.display();
		//q.enqueue(5);
		priorityQueue pq=new priorityQueue(3);
		pq.insert(700);
		pq.insert(100);
		pq.insert(500);
		pq.display();
		pq.remove();
		System.out.println("after removing");
		pq.display();
		
	}
}
