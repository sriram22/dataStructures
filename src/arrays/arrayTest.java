package arrays;

public class arrayTest {

	public static void main(String args[])
	{
		orderedArray a=new orderedArray(20);
		a.insert(1);
		a.insert(2);
		a.insert(3);
		a.insert(4);
		a.insert(5);
		a.insert(6);
		a.insert(7);
		a.insert(8);//7
		a.insert(9);//8
		a.insert(10);//9
		a.binSearch(3);
		a.delete(2);
		/*int val=a.binSearchRecursion(0,9,2);
		if(val==2)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}*/
		a.display();
		//a.insert(2);
		
	//	a.display();
	}
}
