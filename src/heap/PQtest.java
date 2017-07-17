package heap;

public class PQtest {

	public static void main(String[] args) {
		
		MaxPQ pq=new MaxPQ(6);

		/**
		 * Insertion in a heap
		 */
		/*pq.insert(100);
		pq.insert(90);
		pq.insert(80);
		pq.insert(30);
		pq.insert(60);
		pq.insert(85);
		*/
		int[] a =new int[]{0,100,12,120};
		a=pq.sort(a,3);
		pq.displaySort(a);
		
		
		
	}

}
