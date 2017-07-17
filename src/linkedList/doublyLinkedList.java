package linkedList;

public class doublyLinkedList {

	simpleNode head;
	
	
	doublyLinkedList()
	{
		head=null;
		
	}
	
	void insertFirst(int data)
	{
		simpleNode n=new simpleNode(data);
		if(head==null)
		{
			head=n;
		}
		else{
			n.next=head;
			head.prev=n;
			head=n;
		}
		
	}
	
	void insertLast(int data)
	{
		simpleNode n=new simpleNode(data);
		simpleNode temp=head;
		simpleNode p=temp;
		if(head==null)
		{
			head=n;
		}
		else
		{
		while(temp.next!=null)
		{
			temp=temp.next;
			p=temp;
		}
		p.next=n;
		n.prev=p;
		}
	}
	
	
	void insertPosition(int position,int data)
	{
		simpleNode n=new simpleNode(data);
		simpleNode temp=head;
		int currentPos=1;
		if(head==null)
		{
			head=n;
		}
		else
		{
			while(temp.next!=null)
			{
				if(currentPos==position-1)
				{
					simpleNode p=temp.next;
					temp.next=n;
					n.next=p;
					n.prev=temp;
					break;
				}
				else
				{
					temp=temp.next;
				}
				
			}
		}
	}
	
	
	void deleteFirst()
	{
		simpleNode n=head.next;
		head=n;
	}
	
	void deleteLast()
	{
		simpleNode temp=head;
		simpleNode p=null;
		while(temp.next!=null)
		{
			p=temp;
			temp=temp.next;
			
		}
		p.next=null;
	}
	
	void deletePosition(int position)
	{
		int currentPosition=1;
		simpleNode temp=head;
		while(temp.next!=null)
		{
			if(currentPosition==position-1)
			{
				simpleNode p=temp.next.next;
				temp.next=p;
				if(p!=null)
				p.prev=temp;
				break;
			}
			else
			{
				currentPosition++;
				temp=temp.next;
			}
			
		}
	}
	
	
	
	
	void displayList()
	{
		simpleNode n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
}
