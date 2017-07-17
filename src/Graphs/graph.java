package Graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class graph {

	private int nVertices;//to count the size;
	private vertex[] v;
	private int adjMatx[][];
	
	private int front=0;
	private int rear=-1;
	private char[] queue;
	private int nQueue;
	int capacity;
	Stack<vertex> st;
	private int[] prev=new int[8];//to record the path
	private char[] mstPath=new char[8];
	
	public graph(int size){
		v=new vertex[size];
		nVertices=0;
		adjMatx=new int[size][size];
		queue=new char[size];
		capacity=size;
		st=new Stack<vertex>();
		for(int i=0;i<size;i++)
		{
			prev[i]=-1;
		}
	}
	
	public void addVertex(char label){
		v[nVertices++]=new vertex(label);
	}
	
	public void addEdge(int start, int end)
	{
		adjMatx[start][end]=1;
		
	}
	
	
	public void displayVertex(){
		for(int i=0;i<v.length;i++)
		{
			System.out.println(v[i].label);
		}
	}
	
	/**
	 * These methods are for implementing BFS using queue
	 * @param label
	 */
	
	
	public void enqueue(char label)
	{
		if(isFull())
			return;
		rear=(rear+1)% queue.length;
		queue[rear]=label;
		nQueue++;
	}
	
	public boolean isEmpty(){
		return (nQueue==0);
	}
	
	public char dequeue(){
		
		if(isEmpty())
			return 0;
		
		char item=queue[front];
		front=(front+1)%queue.length;
		nQueue--;
		return item;
	}
	
	
	public boolean isFull(){
		return(capacity==nQueue);
	}
	
	
	
	
	public void bfs(int idx){
		char l;
		int dist=-1; 
		enqueue(v[idx].label);
		v[idx].isVisited=true;
		int i=0;
		
		ArrayList searched=new ArrayList();
		while(!isEmpty())
		{
			l=dequeue();
			
			
		if(!searched.contains(l))
		{	
			
				for(int k=0;k<v.length;k++)
				{
					if(l==v[k].label)
					{
						i=k;
						break;
					}
				}
				
				for(int j=0;j<adjMatx[i].length;j++)
					{
						if(adjMatx[i][j]==1 && v[j].isVisited==false)
						{
							 v[j].isVisited=true;
							 enqueue(v[j].label);
							 
							 prev[j]=l;
							
							 
						}
					
					}
				searched.add(l);
			}
		
				
		}
	}
	
	
	public void printPath(int start,int end)
	{
		int currentV=end;
		while(prev[currentV]!=-1)
		{
			System.out.print(currentV+"---");
			currentV=prev[currentV];
		}
		
	}
	
	
	/**
	 * Implementation of DFS
	 */

	public void recursiveDfs(int start){
		int i=start;
		if(v[start].isVisited==false){
			 System.out.println("visit "+v[start].label);
			 v[start].isVisited=true;
			 st.push(v[start]);
		}
		
			//to add elements to to stack

			for(int j=0;j<adjMatx[i].length;j++)
				{
					if(adjMatx[i][j]==1 && v[j].isVisited==false)
					{
						
						 recursiveDfs(j);
					}
				}
			
			if(!st.isEmpty())
			{
				System.out.println("removing "+st.peek().label);
				st.pop();
			}
		}
	
	public void iterativeDfs(int start)
	{
	 int i=start;
	 int prev=0;
	 	if(v[start].isVisited==false){
		 System.out.println("visit "+v[start].label);
		 v[start].isVisited=true;
		 st.push(v[start]);
	 	}
	
	 	while(!st.isEmpty()){
	 		
	 		for(int j=0;j<adjMatx[i].length;j++)
			{
				if(adjMatx[i][j]==1 && v[j].isVisited==false)
				{
					 System.out.println("visit "+v[j].label);
					 v[j].isVisited=true;
					 st.push(v[j]);
					 i=j;
				}
			}
	 		System.out.println("removing "+st.peek().label);
			st.pop();
			if(!st.empty())
			i=st.peek().label;
	 	}
	}


	
	/**
	 * Implementation of MST
	 * This implementation is done using dfs
	 */

	public void mst(int start){
		
		int i=start;
		if(v[start].isVisited==false){
			
			 v[start].isVisited=true;
			 st.push(v[start]);
		}
		
			//to add elements to to stack

			for(int j=0;j<adjMatx[i].length;j++)
				{
					if(adjMatx[i][j]==1 && v[j].isVisited==false)
					{
						System.out.print(v[i].label);
						 System.out.println(v[j].label);
						mst(j);
					}
				}
			
			if(!st.isEmpty())
			{
				
				st.pop();
			}
		
	}
	
	
	public void topo(){
		
		int totalVertices=nVertices;
		List topo=new ArrayList();
		while(totalVertices>0){
			int current=noSuccessors();
			if(current==-1)
				{
				System.out.println("Graph has cycles");
				return;
				}
				
			topo.add(v[current].label);
			deleteVertex(current);
			
			totalVertices--;
		}
		Iterator it=topo.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	}
	
	/**
	 * even if one value in the row is 1 break and check for the next row 
	 * otherwise the graph has cycles
	 * @return
	 */
	public int noSuccessors(){
		
		boolean isEdge=false;
		for(int i=0;i<nVertices;i++)
		{
			isEdge=false;
			for(int j=0;j<nVertices;j++)
			{
				if(adjMatx[i][j]==1)
					{
						isEdge=true;
						break;
					}
			}
			
			if(!isEdge)
				return i;
			
		}
		
		return -1;
	}
	
	
	public void deleteVertex(int vertex){
		if(vertex!=nVertices-1){
			//to move the vertex towards the left
			for(int j=vertex;j<nVertices-1;j++)
			{
				v[j]=v[j+1];
			}
			
			//now changing the matrix
			for(int row=vertex;row<nVertices-1;row++)
			{
				moveup(row);
			}
			for(int col=vertex;col<nVertices-1;col++)
			{
				moveleft(col);
			}
			
			
		}
		
		
		nVertices--;
	}
	
	public void moveleft(int col){
		for(int i=0;i<nVertices-1;i++)
		{
			adjMatx[i][col]=adjMatx[i][col+1];
		}
		
	}
	
	public void moveup(int row){
		for(int i=0;i<nVertices;i++)
		{
			adjMatx[row][i]=adjMatx[row+1][i];
		}
		
	}

	
	public void mstw(){
		
	}
}

	
