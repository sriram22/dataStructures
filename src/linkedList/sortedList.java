package linkedList;

public class sortedList {
	private simpleNode head;
	
	
	sortedList(){
		head=null;
	}
	void insert(int key)
	{
		simpleNode n=new simpleNode(key);
		if(head==null)
		{
			head=n;
		}
		else{
			simpleNode temp=head;
			simpleNode prev=null;
			while(temp!=null && key > temp.data)
			{
				prev=temp;
				temp=temp.next;
			}
			
			if(prev==null)
			{
				head=n;
			}
			else
			{
			prev.next=n;
			}
			n.next=temp;
		}
		
	}
	
	void delete(){
		simpleNode temp=head;
		head=temp.next;
	}
	
	
	void displayList()
	{
		simpleNode temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
			
			
	}
}
