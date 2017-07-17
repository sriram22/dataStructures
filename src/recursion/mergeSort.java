package recursion;

public class mergeSort {

	static int[] a=new int[]{14,12,65,21,2,3,545};
	static int[] c=new int[7];

	public static void main(String args[])
	{
		int lowIdx=0;
		int highIdx=a.length-1;
		//int mid=(lowIdx+highIdx)/2;
		mergeSort(a,lowIdx,highIdx);
		
		display();
	}
	
	static void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}

		
		static void mergeSort(int[] a,int lowIdx,int highIdx){
			 
			int mid=(lowIdx+highIdx)/2;
			
			if(lowIdx==highIdx)
				return;
			
			//left
			mergeSort(a,lowIdx,mid);
			
			//right
			mergeSort(a,mid+1,highIdx);
			
			//merge
			merge(c, lowIdx, mid+1, highIdx);
			
			
		}
		
		
		static void merge(int [] c,int lowIdx,int mid,int highIdx)
		{
			int i=0;
			int n=highIdx-lowIdx+1;
			int beforeMid=mid-1;
			int lowptr=lowIdx;
			while(lowIdx<=beforeMid && mid<=highIdx)
			{
				if(a[lowIdx]<a[mid])
				{
					c[i++]=a[lowIdx++];
				}
				else{
					c[i++]=a[mid++];
				}
			}
			
			
			while(lowIdx<=beforeMid)
			{
				c[i++]=a[lowIdx++];
			}
			
			while(mid<=highIdx){
				c[i++]=a[mid++];
			}
			
			
			//copying the c array to original array
			
			for(int j=0;j<n;j++)
			{
				a[lowptr+j]=c[j];
			}
		}
}
