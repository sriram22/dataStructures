package linkedList;

public class circularSinglyLinkedList {

	simpleNode head;
	simpleNode tail;
	
	public circularSinglyLinkedList() {
		head=null;
		tail=null;
		
	}
	
	void insertFirst(int data)
	{
		simpleNode n=new simpleNode(data);
		
		if(head==null)
		{
			head=n;
			head.next=head;
			tail=head;
		}
		else
		{
			n.next=head;
			tail.next=n;
			head=n;
			//tail=n.next;
		}
		
	}
	
	void insertEnd(int data)
	{
		simpleNode n=new simpleNode(data);
		if(head==null)
		{
			head=n;
			head.next=head;
			tail=head;
		}
		else
		{
			simpleNode temp=head;
			simpleNode p=temp;
			while(temp.next!=head)
			{
				p=temp.next;
				temp=temp.next;
			}
			p.next=n;
			n.next=head;
			tail=n;
		}
		
	}
	
	void deleteFirst(){
		simpleNode temp=head;
		head=temp.next;
		tail.next=head;
	}
	
	
	void displayList()
	{
		simpleNode temp=head;
		while(temp.next!=head)
		{
			
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}
