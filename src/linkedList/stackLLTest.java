package linkedList;

public class stackLLTest {

	public static void main(String args[])
	{
		stackLL st=new stackLL();
		st.push(1);
		st.push(12);
		st.push(3);
		st.push(5);
		
		st.display();
		System.out.println("After popping:");
		st.pop();
		
		st.display();
	}
}
