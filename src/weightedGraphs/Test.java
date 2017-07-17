package weightedGraphs;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g=new Graph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		
		g.addEdge(0, 1, 50); //AB6
		g.addEdge(0, 3, 80); //AD4
		g.addEdge(1, 2, 60); //BC10
		g.addEdge(1, 3, 90); //BD7
		g.addEdge(2, 4, 40); //BE7
		g.addEdge(3, 2, 20); //CD8
		g.addEdge(3, 4, 70); //CE5
		g.addEdge(4, 1, 50); //CF6
		Stack<Character> st=new Stack();
	//	g.mstw();
		g.path();
	}

}
