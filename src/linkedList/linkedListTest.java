package linkedList;

public class linkedListTest {

	public static void main(String args[])
	{
		
		simpleLinkedList lk=new simpleLinkedList();
		
		//insert first
//		lk.insertFirst(1);
//		lk.insertFirst(2);
//		lk.insertFirst(13);
//		lk.insertFirst(21);
		
		lk.insertEnd(3);
		lk.insertEnd(3);
		lk.insertEnd(2);
		lk.insertEnd(3);
		lk.insertEnd(3);
		

		//delete
	//	lk.deleteFirst();
		//display
		//lk.deleteEnd();
		lk.removeAll(3);
		lk.displayList();
				
		
		
	}
}
