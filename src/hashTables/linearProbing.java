package hashTables;

public class linearProbing {

	private int[] hashArray;
	private int isDelete=-1;
	private int arraySize;
	
	linearProbing(int size)
	{
		hashArray=new int[size];
		arraySize=size;
	}
	
	
	public void displayTable(){
		for(int i=0;i<hashArray.length;i++)
		{
			System.out.println(hashArray[i]);
		}
	}
	
	
	/**
	 * This is the method that computes the hash function
	 */
	
	 public int hashFunction(int key){
		 return key % arraySize;
	 }
	
	 
	 /**
	  * This is the method that inserts that inserts item into the hash table
	  */
	 
	 public void insert(int key){
		 
		 int hashVal=hashFunction(key);
		 
		 //this finds an empty spot
		 while(hashArray[hashVal]!=0 && hashArray[hashVal]!=-1)
		 {
			 hashVal++;	
			 //to wrap around
			 hashVal %= arraySize;
		 }
		
		 
		 hashArray[hashVal]=key;
	 
	 }
	 
	 
	 /**
	  * This is a method that deletes the item instead of making it null its made -1
	  */
	 
	 public void delete(int key)
	 {
		 int hashVal=hashFunction(key);
		 
		 while(hashArray[hashVal]!=key)
		 {
			 hashVal++;
			 hashVal %=arraySize;
		 }
		 
		 hashArray[hashVal]=isDelete;
	 }
	 
	 
	 /**
	  * This method is used to find a particular item in the hash table assuming the hash table is not full otherwise it keeps on
	  * looping
	  */
	 
	 public void find(int key)
	 {
		 int hashVal=hashFunction(key);
		 
		 while(hashArray[hashVal]!=0 && hashArray[hashVal]!=-1)
		 {
			 if(hashArray[hashVal]==key)
			 {
				 System.out.println("found");
				 return;
			 }
			 hashVal++;
			 hashVal%=arraySize;
		 }
		 System.out.println("not found");
	 }
	
}
