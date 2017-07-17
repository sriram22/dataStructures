package simpleSorting;

public class bubbleSort {

	 void sort(int[] a)
	 {
		 
		 int j;

		 for(int i=a.length-1;i>0;i--)
		 {
			 for(j=0;j<i;j++)
			 {
				 if(a[j]>a[j+1])
				 {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
	
		 }
	 	}
	}

