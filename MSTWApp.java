package mstw;

class MSTWApp {
	public static void main(String[] args) {
		Graph theGraph = new Graph();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		
		theGraph.addEdge(0, 1, 5);	//AB 5
		theGraph.addEdge(0, 2, 10);	//AC 10
		theGraph.addEdge(2, 3, 15);	//CD 15
		theGraph.addEdge(1, 3, 5);	//BD 5
		theGraph.addEdge(1, 2, 10);	//BC 10
		
		System.out.print("Minimum spanning tree: ");
		theGraph.mstw();
		System.out.println();
	}
}
