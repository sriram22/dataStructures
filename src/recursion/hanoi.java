package recursion;

public class hanoi {

	static int nDisks=3;
	public static void main(String args[])
	{
		move(nDisks,'A','B','C');
	}
	
	
	static void move(int topN, char from,char inter, char to){
		
		if(topN==1)
		{
			System.out.println("Disk 1 from "+from+" to "+to);
		}
		else
		{
	
			move(topN-1,from,to,inter);
		
			System.out.println("Disk "+topN+" from "+from+" to "+to);
		
			move(topN-1,inter,from,to);

		}
		
	}
}
