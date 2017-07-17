package simpleSorting;

public class selectionSort {

	void sort(int[] a)
	   {
		   int min = 0;
		  
		   for(int i=0;i<a.length-1;i++)
		   {
			   min=i;
			   for(int j=i+1;j<a.length;j++)
			   {
				   	if(a[j]<a[min])
				   	{
				   		min=j;
				   	}
			   }
			   int temp;
			   temp=a[min];
			   a[min]=a[i];
			   a[i]=temp;
		   }
		   
		   for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		   
	   }
   
}
