package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class graphTest {

	public static void main(String args[])
	{
		graph g=new graph(8);
		
		
		//example for bfs
		
		/*g.addVertex('S');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('F');
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.displayVertex();
		g.bfs();*/
		
		
		//example for dfs
		/*g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.displayVertex();
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(0, 3);
		g.addEdge(3, 4);
		//g.bfs(4);
		//g.printPath(4, 2);
		g.iterativeDfs(0);
		*/
		
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		g.addVertex('F');
		g.addVertex('G');
		g.addVertex('H');
		
		g.addEdge(0, 3);
		g.addEdge(0, 4); 
		g.addEdge(1, 4);
		g.addEdge(2, 5); 
		g.addEdge(3, 6); 
		g.addEdge(4, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 7); 
		
		
	/*	g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
	*/
		
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.topo();
		
		
		//g.displayVertex();
	}
}
