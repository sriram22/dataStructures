package weightedGraphs;

public class Edge {

	public int srcVertex; //index of vertex starting edge
	public int destVertex; //index of vertex ending edge
	
	public int distance;
	
	public Edge(int src,int dest, int w)
	{
		srcVertex=src;
		destVertex=dest;
		distance=w;
	}

}