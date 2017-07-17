package linkedList;

public class queueLL {
	
	private circularSinglyLinkedList linkList;
	
	queueLL(){
		linkList=new circularSinglyLinkedList();
	}

	void enqueue(int data){
		linkList.insertEnd(data);
	}
	
	
	void dequeue(){
		linkList.deleteFirst();
	}
	
	void displayList(){
		linkList.displayList();
	}

}
