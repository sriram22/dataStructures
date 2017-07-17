package weightedGraphs;

/**
 * make sure you try to replace the class with just an array to keep track of parent and 
 * an array to keep track of distances
 * @author sriramkrishnan
 *
 */
public class DistPar {

	public int distance;
	public int parentVert;
	
	public DistPar(int d, int p)
	{
		distance=d;
		parentVert=p;
	}
}
