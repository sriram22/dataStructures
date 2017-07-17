package hashTables;

public class hashTableTest {

	public static void main(String args[])
	{
		linearProbing lp=new linearProbing(10);
		lp.insert(15);
		
		lp.displayTable();
	}
}
