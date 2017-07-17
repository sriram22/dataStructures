package simpleSorting;

public class sortTest {

	public static void main(String args[])
	{
		int[] array={11,25,12,22,64};
		
		
//		bubbleSort b=new bubbleSort();
//		System.out.println("bubble sort");
//		b.sort(array);
	
		System.out.println("selection sort");
		selectionSort s=new selectionSort();
		s.sort(array);
		
//		System.out.println("Insertion sort");
//		insertionSort is=new insertionSort();
//		is.sort(array);
		
	}
}
