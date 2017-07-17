package linkedList;

public class doublyLinkedListTest {

	
	public static void main(String args[])
	{
		doublyLinkedList lk=new doublyLinkedList();
/*		lk.insertFirst(1);
		lk.insertFirst(12);
		lk.insertFirst(21);
		lk.insertFirst(11);
		*/
		
		lk.insertLast(1);
		lk.insertLast(12);
		lk.insertLast(21);
		lk.insertLast(13);
		
		//lk.insertPosition(2, 33);
		
		lk.deletePosition(4);
		lk.displayList();
	}
}
