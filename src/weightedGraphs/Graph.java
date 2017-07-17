package weightedGraphs;
/**
 * This implementation is for weighted graphs
 * This class includes MSTW
 * @author sriramkrishnan
 *
 */
public class Graph {

	private final int MAX_VERTS=20;
	private final int INFINITY=10000;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nVertices;
	private int currentVertex;
	private PriorityQ pq;
	private int nTree;
	private DistPar[] spath;
	private int startTocurrent;
	
	public Graph(){
		vertexList=new Vertex[MAX_VERTS];
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		nVertices=0;
		for(int i=0;i<MAX_VERTS;i++)
			for(int j=0;j<MAX_VERTS;j++)
				adjMat[i][j]=INFINITY;
		pq=new PriorityQ();
		nTree=0;
		spath=new DistPar[MAX_VERTS];
		startTocurrent=0;
	}
	
	
	public void addVertex(char label)
	{
		vertexList[nVertices++]=new Vertex(label);
	}
	
	public void addEdge(int start, int end, int weight)
	{
		adjMat[start][end]=weight;
	//	adjMat[end][start]=weight;
	}
	
	
	public void displayVertex(int v){
		System.out.println(vertexList[v].label);
	}
	
	public void putInPQ(int vertex, int distance)
	{
		//check whether there is any edge with the same vertex
		int idx=pq.find(vertex);
		
		if(idx!=-1)
		{
			//finding the edge for the vertex
			Edge tempEdge=pq.peekN(idx);
			
			int oldDistance=tempEdge.distance;
			
			//check whether old distance is greater than new distance
			if(distance<oldDistance)
			{
				pq.removeN(idx);
				Edge edge=new Edge(currentVertex,vertex,distance);
				pq.insert(edge);
			}
			//else no action let the edge be there
		}
		else
		{
			Edge edge=new Edge(currentVertex,vertex,distance);
			pq.insert(edge);
		}
	}
	

	public void mstw(){
		
		//start with the current Vertex
		currentVertex=0;
		
		while(nTree<nVertices-1)
		{
			//vertex added to the tree
			vertexList[currentVertex].isTree=true;
			nTree++;
			
		 //Insert edges adjacent to the current vertex in PQ
			for(int j=0;j<nVertices;j++)
			{
				//skip the own vertex
				if(j==currentVertex)
					continue;
				
				//skip if the vertex is already in the tree
				if(vertexList[j].isTree)
					continue;
				
				//get the distance
				int distance=adjMat[currentVertex][j];
				
				//put the vertex and distance in the priority Queue
				putInPQ(j,distance);
			}
			
			if(pq.size()==0)
			{
				System.out.println("Grpah is not connected");
				return;
			}
			
			//remove the edge with the minimum distance from the priority Queue
			Edge e=pq.removeMin();
			int sourceVertex=e.srcVertex;
			currentVertex=e.destVertex;
			
			//display the edge
			System.out.println(vertexList[sourceVertex].label);
			System.out.println(vertexList[currentVertex].label);
			System.out.println("");
			
			
			
		
		}
	}
	
	
	/**
	 * Implementing Dijkstra algorithm
	 */
	
	public void path(){
		int startTree=0; //this is like currentVertex
		vertexList[startTree].isTree=true;
		nTree=1;
		
		//transfer all the distances from the adjmat to spath
		for(int j=0;j<nVertices;j++)
		{
			int tempDistance=adjMat[startTree][j];
			spath[j]=new DistPar(tempDistance,startTree);
		}
		
		
		//until all vertices are in the tree
		while(nTree<nVertices){
			
			int indexMin=getMin();//get minimum from the path
			int minDist=spath[indexMin].distance;
			
			if(minDist==INFINITY)
			{
				System.out.println("Unreachable vertex");
				break;
			}
			else{
				currentVertex=indexMin;//reset the currentVert to closest vertex
				startTocurrent=spath[indexMin].distance;
			}
			vertexList[currentVertex].isTree=true;
			nTree++;
			adjust_path(); //update spath[]
		}
		displayPath();
	}
	
	
	public int getMin(){
		int min=INFINITY;
		int index=0;
		
		for(int i=1;i<nVertices;i++)
		{
			if(!vertexList[i].isTree && min>spath[i].distance)
			{
				min=spath[i].distance;
				index=i;
			}
		}
		return index;
	}

	public void adjust_path(){
		for(int i=1;i<nVertices;i++)
		{
			if(vertexList[i].isTree)
				continue;
			
		
			int tempDistance=startTocurrent+adjMat[currentVertex][i];
			if(tempDistance<spath[i].distance)
			{
				spath[i].distance=tempDistance;
				spath[i].parentVert=currentVertex;
			}
		}
	}
	
	public void displayPath(){
		for(int j=0;j<nVertices;j++)
		{
			System.out.print(vertexList[j].label+"=");
			if(spath[j].distance==INFINITY)
			{
				System.out.print("inf");
			}
			else{
				System.out.print(spath[j].distance);
			}
			char parent=vertexList[spath[j].parentVert].label;
			System.out.println(parent);
		}
		System.out.println("");
	}
}
