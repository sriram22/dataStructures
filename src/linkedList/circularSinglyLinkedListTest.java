package linkedList;

public class circularSinglyLinkedListTest {

	public static void main(String args[])
	{
		circularSinglyLinkedList cs=new circularSinglyLinkedList();
/*		cs.insertFirst(1);
		cs.insertFirst(21);
		cs.insertFirst(12);
		cs.insertFirst(13);
		cs.insertFirst(14);*/
		
		
		cs.insertEnd(1);
		cs.insertEnd(21);
		cs.insertEnd(12);
		cs.insertEnd(13);
		cs.insertEnd(14);
		cs.displayList();
		
	}
}
