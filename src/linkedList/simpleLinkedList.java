package linkedList;

public class simpleLinkedList {

simpleNode head;
	
	
	simpleLinkedList()
	{
		head=null;
	}
	
	void insertFirst(int data)
	{
	 simpleNode n=new simpleNode(data);
		n.next=head;
		head=n;
	}
	
	void deleteFirst()
	{
		head=head.next;
		
	}
	
	void insertEnd(int data)
	{
		simpleNode n=new simpleNode(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			simpleNode temp=head;
			simpleNode q=temp;
			while(q.next!=null)
			{
				q=q.next;
				temp=q;
			}
			temp.next=n;
			
		}
	}
	
	void insertPosition(int position,int data)
	{
		simpleNode n=new simpleNode(data);
		simpleNode temp=head;
		int currentPos=1;
		while(temp!=null)
		{
			if(currentPos==position-1)
			{
				simpleNode q=temp.next;
				temp.next=n;
				n.next=q;
				break;
				
			}
			else
			{	currentPos++;
				temp=temp.next;
			}
		}
	}
	
	void deleteEnd()
	{
		simpleNode temp=head;
		simpleNode prev = null;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		if(prev.next!=null)
		{
			prev.next=null;
		}
	}
	
	simpleNode removeAll(int n){
		simpleNode temp=head;
		simpleNode prev=temp;
		
		
		
		while(temp!=null)
		{
			if(n==temp.data)
			{
				if(temp!=head)
					prev.next=temp.next;
				else
					head=temp.next;
			}
			else
			{
				prev=temp;
			}
			temp=temp.next;
		}
		
		return head;
	}
	
	void deletePosition(int position)
	{
		simpleNode temp=head;
		int currentPosition=1;
		while(temp!=null)
		{
			if(currentPosition==position-1)
			{
				simpleNode doubleNext=temp.next.next;
				temp.next=doubleNext;
				break;
			}
			else
			{
				temp=temp.next;
				currentPosition++;
						
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
	
	boolean isEmpty()
	{
		return (head==null);
	}
}
